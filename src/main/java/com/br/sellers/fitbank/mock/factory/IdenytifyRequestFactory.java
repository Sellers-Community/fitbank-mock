package com.br.sellers.fitbank.mock.factory;

import com.br.sellers.fitbank.mock.gateway.model.request.BasicRequestModel;
import com.br.sellers.fitbank.mock.service.ServiceBase;
import com.br.sellers.fitbank.mock.service.account.CreateAccountService;
import com.br.sellers.fitbank.mock.service.balancer.GetAccountEntryService;
import com.br.sellers.fitbank.mock.service.card.request.RequestCardService;
import com.br.sellers.fitbank.mock.service.internaltransfer.CreateInternalTransferMultipleService;
import com.br.sellers.fitbank.mock.service.internaltransfer.CreateInternalTransferSimpleService;
import com.br.sellers.fitbank.mock.service.moneytransfer.CreateMoneyTransferService;
import com.br.sellers.fitbank.mock.service.moneytransfer.GetMoneyTransferService;
import com.br.sellers.fitbank.mock.service.paymentslip.CreatePaymentSlipService;
import com.br.sellers.fitbank.mock.service.paymentslip.GetPaymentSlipByIdService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import lombok.extern.log4j.Log4j2;

/**
 * Factory super importante que vai identificar qual é o serviço que deve ser executado.
 */
@Log4j2
public class IdenytifyRequestFactory {

    public static final String CREATE_ACCOUNT = "CreateAccount";
    public static final String GET_ACCOUNT_ENTRY = "GetAccountEntry";
    public static final String GENERATE_PAYMENT_SLIP = "GenerateBoleto";
    public static final String GET_PAYMENT_SLIP_ID = "GetBoletoById";
    public static final String INTERNAL_TRANSFER_SIMPLE = "InternalTransfer";
    public static final String INTERNAL_TRANSFER_MULTIPLE = "MultipleInternalTransfers";
    public static final String MONEY_TRANSFER = "MoneyTransfer";
    public static final String GET_MONEY_TRANSFER = "GetMoneyTransferOutById";
    public static final String REQUEST_CARD = "RequestCard";

    private IdenytifyRequestFactory() {
    }

    public static ServiceBase getInstance(String json) throws JsonProcessingException {

        BasicRequestModel basic = new Gson().fromJson(json, BasicRequestModel.class);

        log.debug("Método: " + basic.getMethod());

        // Então é validado a propriedade Method em cada serviço e criado a classe correspondente.
        // OBS:
        // Todos os Services abaixo não foi usado como @Service, como define o Spring Boot
        // porque não tinha necessidade.
        if (CREATE_ACCOUNT.equals(basic.getMethod())) {
            return new CreateAccountService();
        } else if (GET_ACCOUNT_ENTRY.equals(basic.getMethod())) {
            return new GetAccountEntryService();
        } else if (GENERATE_PAYMENT_SLIP.equals(basic.getMethod())) {
            return new CreatePaymentSlipService();
        } else if (GET_PAYMENT_SLIP_ID.equals(basic.getMethod())) {
            return new GetPaymentSlipByIdService();
        } else if (INTERNAL_TRANSFER_SIMPLE.equals(basic.getMethod())) {
            return new CreateInternalTransferSimpleService();
        } else if (INTERNAL_TRANSFER_MULTIPLE.equals(basic.getMethod())) {
            return new CreateInternalTransferMultipleService();
        }else if (MONEY_TRANSFER.equals(basic.getMethod())) {
            return new CreateMoneyTransferService();
        }else if (GET_MONEY_TRANSFER.equals(basic.getMethod())) {
            return new GetMoneyTransferService();
        }else if (REQUEST_CARD.equals(basic.getMethod())) {
            return new RequestCardService();
        }

        log.debug("O serviço " + basic.getMethod() + " não foi implementado.");
        return null;
    }

}

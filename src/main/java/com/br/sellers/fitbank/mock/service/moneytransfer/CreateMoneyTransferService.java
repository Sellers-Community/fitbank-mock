package com.br.sellers.fitbank.mock.service.moneytransfer;

import com.br.sellers.fitbank.mock.gateway.model.request.BasicRequestModel;
import com.br.sellers.fitbank.mock.gateway.model.request.moneytransfer.MoneyTransferRequestModel;
import com.br.sellers.fitbank.mock.gateway.model.response.BasicResponseModel;
import com.br.sellers.fitbank.mock.gateway.model.response.moneytransfer.MoneyTransferResponseModel;
import com.br.sellers.fitbank.mock.service.ServiceBaseImpl;
import com.google.gson.Gson;

import java.util.Map;
import java.util.Random;

public class CreateMoneyTransferService extends ServiceBaseImpl {

    @Override
    protected BasicRequestModel toObject(String body) {
        return new Gson().fromJson(body, MoneyTransferRequestModel.class);
    }

    @Override
    protected BasicResponseModel createResponse() {
        return new MoneyTransferResponseModel();
    }

    @Override
    protected void sucess(BasicRequestModel request, BasicResponseModel response) {
        MoneyTransferRequestModel model = (MoneyTransferRequestModel) request;
        MoneyTransferResponseModel modelResponde = (MoneyTransferResponseModel) response;

        int value = new Random().nextInt(5000);
        modelResponde.setDocumentNumber(new Long(value).toString());
        modelResponde.setIdentifier(new Long(model.getIdentifier()));
    }

    @Override
    protected void validadeFields(BasicRequestModel request, Map<String, Object> errors) {
        MoneyTransferRequestModel model = (MoneyTransferRequestModel) request;
        validadeField(model.getIdentifier(), "Identifier", "Identifier é obrigatório", errors);
    }

}

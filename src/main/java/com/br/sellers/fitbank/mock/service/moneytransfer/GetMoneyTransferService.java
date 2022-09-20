package com.br.sellers.fitbank.mock.service.moneytransfer;

import com.br.sellers.fitbank.mock.gateway.model.request.BasicRequestModel;
import com.br.sellers.fitbank.mock.gateway.model.request.moneytransfer.GetMoneyTransferCheckRequestModel;
import com.br.sellers.fitbank.mock.gateway.model.response.BasicResponseModel;
import com.br.sellers.fitbank.mock.gateway.model.response.moneytransfer.GetMoneyTransferCheckResponseModel;
import com.br.sellers.fitbank.mock.gateway.model.response.moneytransfer.GetMoneyTransferCheckTransferResponseModel;
import com.br.sellers.fitbank.mock.service.ServiceBaseImpl;
import com.google.gson.Gson;

import java.math.BigDecimal;
import java.util.Map;

public class GetMoneyTransferService extends ServiceBaseImpl {

    @Override
    protected BasicRequestModel toObject(String body) {
        return new Gson().fromJson(body, GetMoneyTransferCheckRequestModel.class);
    }

    @Override
    protected BasicResponseModel createResponse() {
        return new GetMoneyTransferCheckResponseModel();
    }

    @Override
    protected void sucess(BasicRequestModel request, BasicResponseModel response) {
        GetMoneyTransferCheckResponseModel modelResponde = (GetMoneyTransferCheckResponseModel) response;

        GetMoneyTransferCheckTransferResponseModel transfer = new GetMoneyTransferCheckTransferResponseModel();
        transfer.setStatus(5);
        transfer.setPrincipalValue(new BigDecimal(65));

        modelResponde.setTransfer(new Gson().toJson(transfer));
    }

    @Override
    protected void validadeFields(BasicRequestModel request, Map<String, Object> errors) {
        GetMoneyTransferCheckRequestModel model = (GetMoneyTransferCheckRequestModel) request;
        validadeField(model.getDocumentNumber(), "DocumentNumber", "DocumentNumber é obrigatório", errors);
    }

}

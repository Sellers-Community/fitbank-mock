package com.br.sellers.fitbank.mock.service.account;

import com.br.sellers.fitbank.mock.gateway.model.request.BasicRequestModel;
import com.br.sellers.fitbank.mock.gateway.model.request.account.CreateAccountRequestModel;
import com.br.sellers.fitbank.mock.gateway.model.response.BasicResponseModel;
import com.br.sellers.fitbank.mock.gateway.model.response.account.CreateAccountResponseModel;
import com.br.sellers.fitbank.mock.service.ServiceBaseImpl;
import com.google.gson.Gson;

import java.util.Map;
import java.util.Random;

public class CreateAccountService extends ServiceBaseImpl {

    @Override
    protected BasicRequestModel toObject(String body) {
        return new Gson().fromJson(body, CreateAccountRequestModel.class);
    }

    @Override
    protected BasicResponseModel createResponse() {
        return new CreateAccountResponseModel();
    }

    @Override
    protected void sucess(BasicRequestModel request, BasicResponseModel responde) {
        CreateAccountResponseModel modelResponde = (CreateAccountResponseModel) responde;

        int value = new Random().nextInt(5000);
        modelResponde.setIdentifier(new Long(value));
    }

    @Override
    protected void validadeFields(BasicRequestModel request, Map<String, Object> errors) {
        CreateAccountRequestModel model = (CreateAccountRequestModel) request;

        validadeField(model.getMail(), "Mail", "Mail é obrigatório", errors);
        validadeField(model.getPhone(), "Phone", "Phone é obrigatório", errors);
        validadeField(model.getNickname(), "Nickname", "Nickname é obrigatório", errors);
        validadeField(model.getName(), "Name", "Name é obrigatório", errors);
        validadeField(model.getTaxNumber(), "TaxNumber", "TaxNumber é obrigatório", errors);
        validadeField(model.getBank(), "Bank", "Bank é obrigatório", errors);
        validadeField(model.getBankBranch(), "BankBranch", "BankBranch é obrigatório", errors);
        validadeField(model.getBankAccount(), "BankAccount", "BankAccount é obrigatório", errors);
        validadeField(model.getBankAccountDigit(), "BankAccountDigit", "BankAccountDigit é obrigatório", errors);
    }

}

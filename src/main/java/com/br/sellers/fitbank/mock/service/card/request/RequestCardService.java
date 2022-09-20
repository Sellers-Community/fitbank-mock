package com.br.sellers.fitbank.mock.service.card.request;

import com.br.sellers.fitbank.mock.gateway.model.request.BasicRequestModel;
import com.br.sellers.fitbank.mock.gateway.model.request.card.request.CardRequestModel;
import com.br.sellers.fitbank.mock.gateway.model.response.BasicResponseModel;
import com.br.sellers.fitbank.mock.gateway.model.response.card.request.RequestCardResponseModel;
import com.br.sellers.fitbank.mock.service.ServiceBaseImpl;
import com.google.gson.Gson;

import java.util.Random;

public class RequestCardService extends ServiceBaseImpl {

    @Override
    protected BasicRequestModel toObject(String body) {
        return new Gson().fromJson(body, CardRequestModel.class);
    }

    @Override
    protected BasicResponseModel createResponse() {
        return new RequestCardResponseModel();
    }

    @Override
    protected void sucess(BasicRequestModel request, BasicResponseModel response) {
        RequestCardResponseModel modelResponde = (RequestCardResponseModel) response;

        int value = new Random().nextInt(5000);
        modelResponde.setIdentifierCard(new Long(value).toString());
    }

}

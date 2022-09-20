package com.br.sellers.fitbank.mock.service.paymentslip;

import com.br.sellers.fitbank.mock.gateway.model.request.BasicRequestModel;
import com.br.sellers.fitbank.mock.gateway.model.request.paymentslip.CreatePaymentSlipRequestModel;
import com.br.sellers.fitbank.mock.gateway.model.response.BasicResponseModel;
import com.br.sellers.fitbank.mock.gateway.model.response.paymentslip.GetPaymentSlipResponseModel;
import com.br.sellers.fitbank.mock.service.ServiceBaseImpl;
import com.google.gson.Gson;

import java.util.Random;

public class CreatePaymentSlipService extends ServiceBaseImpl {

    @Override
    protected BasicRequestModel toObject(String body) {
        return new Gson().fromJson(body, CreatePaymentSlipRequestModel.class);
    }

    @Override
    protected BasicResponseModel createResponse() {
        return new GetPaymentSlipResponseModel();
    }

    @Override
    protected void sucess(BasicRequestModel request, BasicResponseModel response) {
        GetPaymentSlipResponseModel modelResponde = (GetPaymentSlipResponseModel) response;

        int value = new Random().nextInt(5000);
        modelResponde.setDocumentNumber(new Long(value).toString());
        modelResponde.setAlreadyExists(false);
    }

}

package com.br.sellers.fitbank.mock.service.paymentslip;

import com.br.sellers.fitbank.mock.gateway.model.request.BasicRequestModel;
import com.br.sellers.fitbank.mock.gateway.model.request.paymentslip.GetPaymentSlipDetailsRequestModel;
import com.br.sellers.fitbank.mock.gateway.model.response.BasicResponseModel;
import com.br.sellers.fitbank.mock.gateway.model.response.paymentslip.GetPaymentSlipDetailsItensResponseModel;
import com.br.sellers.fitbank.mock.gateway.model.response.paymentslip.GetPaymentSlipDetailsResponseModel;
import com.br.sellers.fitbank.mock.service.ServiceBaseImpl;
import com.google.gson.Gson;

public class GetPaymentSlipByIdService extends ServiceBaseImpl {

    @Override
    protected BasicRequestModel toObject(String body) {
        return new Gson().fromJson(body, GetPaymentSlipDetailsRequestModel.class);
    }

    @Override
    protected BasicResponseModel createResponse() {
        return new GetPaymentSlipDetailsResponseModel();
    }

    @Override
    protected void sucess(BasicRequestModel request, BasicResponseModel response) {
        GetPaymentSlipDetailsResponseModel modelResponde = (GetPaymentSlipDetailsResponseModel) response;

        modelResponde.setBoleto(new GetPaymentSlipDetailsItensResponseModel());
    }

}

package com.br.sellers.fitbank.mock.service.paymentslip;

import com.br.sellers.fitbank.mock.gateway.model.request.BasicRequestModel;
import com.br.sellers.fitbank.mock.gateway.model.request.paymentslip.CreatePaymentSlipRequestModel;
import com.br.sellers.fitbank.mock.gateway.model.response.BasicResponseModel;
import com.br.sellers.fitbank.mock.gateway.model.response.paymentslip.GetPaymentSlipResponseModel;
import com.br.sellers.fitbank.mock.service.ServiceBaseImpl;
import com.google.gson.Gson;

import java.util.Map;
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

    @Override
    protected void validadeFields(BasicRequestModel request, Map<String, Object> errors) {
        CreatePaymentSlipRequestModel model = (CreatePaymentSlipRequestModel) request;

        validadeField(model.getGroupTemplate(), "GroupTemplate", "GroupTemplate é obrigatório", errors);
        validadeField(model.getCustomerName(), "CustomerName", "CustomerName é obrigatório", errors);
        validadeField(model.getCustomerTaxNumber(), "CustomerTaxNumber", "CustomerTaxNumber é obrigatório", errors);
        validadeField(model.getCustomerMail(), "CustomerMail", "CustomerMail é obrigatório", errors);
        validadeField(model.getCustomerPhone(), "CustomerPhone", "CustomerPhone é obrigatório", errors);
        validadeField(model.getNeighborhood(), "Neighborhood", "Neighborhood é obrigatório", errors);
        validadeField(model.getCity(), "City", "City é obrigatório", errors);
        validadeField(model.getState(), "State", "State é obrigatório", errors);
        validadeField(model.getZipCode(), "ZipCode", "ZipCode é obrigatório", errors);
        validadeField(model.getSupplierTaxNumber(), "SupplierTaxNumber", "SupplierTaxNumber é obrigatório", errors);
        validadeField(model.getSupplierFullName(), "SupplierFullName", "SupplierFullName é obrigatório", errors);
        validadeField(model.getSupplierTradingName(), "SupplierTradingName", "SupplierTradingName é obrigatório", errors);
        validadeField(model.getSupplierLegalName(), "SupplierLegalName", "SupplierLegalName é obrigatório", errors);
        validadeField(model.getSupplierMail(), "SupplierMail", "SupplierMail é obrigatório", errors);
        validadeField(model.getSupplierPhone(), "SupplierPhone", "SupplierPhone é obrigatório", errors);
        validadeField(model.getRateValue(), "RateValue", "RateValue é obrigatório", errors);
        validadeField(model.getRateSent    (), "RateSent", "RateSent é obrigatório", errors);
        validadeField(model.getAddressLine1(), "AddressLine1", "AddressLine1 é obrigatório", errors);
        validadeField(model.getExternalNumber(), "ExternalNumber", "ExternalNumber é obrigatório", errors);
        validadeField(model.getIdentifier(), "Identifier", "Identifier é obrigatório", errors);
        validadeField(model.getProducts(), "Products", "Products é obrigatório", errors);
        validadeField(model.getDueDate(), "DueDate", "DueDate é obrigatório", errors);
        validadeField(model.getTotalValue(), "TotalValue", "TotalValue é obrigatório", errors);
    }
}

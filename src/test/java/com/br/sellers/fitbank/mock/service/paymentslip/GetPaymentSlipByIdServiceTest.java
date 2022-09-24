package com.br.sellers.fitbank.mock.service.paymentslip;

import com.br.sellers.fitbank.mock.gateway.model.request.paymentslip.GetPaymentSlipDetailsRequestModel;
import com.br.sellers.fitbank.mock.gateway.model.response.BasicResponseModel;
import com.br.sellers.fitbank.mock.service.ServiceBase;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.Map;

class GetPaymentSlipByIdServiceTest {

    @ParameterizedTest
    @NullAndEmptySource
    void executarValidacaoVazio(final String documentNumber) throws JsonProcessingException {
        final GetPaymentSlipDetailsRequestModel request = new GetPaymentSlipDetailsRequestModel();
        request.setMethod("GetBoletoById");
        request.setPartnerId(12345L);
        request.setBusinessUnitId(1234567890L);

        request.setMktPlaceId(1L);
        request.setDocumentNumber(documentNumber);

        final String requestBody = new Gson().toJson(request);

        final ServiceBase service = new GetPaymentSlipByIdService();
        final BasicResponseModel response = service.execute(requestBody, "");

        Assertions.assertNotNull(response);
        Assertions.assertNotNull(response.getValidation());
        Assertions.assertEquals(1, response.getValidation().length);

        final Map<String, String> validation = (Map<String, String>) response.getValidation()[0];
        Assertions.assertTrue(validation.containsKey("DocumentNumber"));
        Assertions.assertEquals("DocumentNumber é obrigatório", validation.get("DocumentNumber"));
    }
}

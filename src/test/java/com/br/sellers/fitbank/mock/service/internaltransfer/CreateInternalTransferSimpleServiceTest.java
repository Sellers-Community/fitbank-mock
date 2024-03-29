package com.br.sellers.fitbank.mock.service.internaltransfer;

import com.br.sellers.fitbank.mock.gateway.model.request.internaltransfer.InternalTransferSimpleRequestModel;
import com.br.sellers.fitbank.mock.gateway.model.response.BasicResponseModel;
import com.br.sellers.fitbank.mock.service.ServiceBase;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

class CreateInternalTransferSimpleServiceTest {

    private final ServiceBase createInternalTransferSimpleService = new CreateInternalTransferSimpleService();

    @ParameterizedTest
    @NullAndEmptySource
    void shouldGetNullWhenPassingInvalidFromTaxNumber(final String fromTaxNumber) throws JsonProcessingException {
        final InternalTransferSimpleRequestModel request = request();
        request.setFromTaxNumber(fromTaxNumber);

        createInternalTransferSimpleServiceExecuteAssertions(request, "FromTaxNumber");
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldGetNullWhenPassingInvalidToTaxNumber(final String toTaxNumber) throws JsonProcessingException {
        final InternalTransferSimpleRequestModel request = request();
        request.setToTaxNumber(toTaxNumber);

        createInternalTransferSimpleServiceExecuteAssertions(request, "ToTaxNumber");
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldGetNullWhenPassingInvalidTransferDate(final String transferDate) throws JsonProcessingException {
        final InternalTransferSimpleRequestModel request = request();
        request.setTransferDate(transferDate);

        createInternalTransferSimpleServiceExecuteAssertions(request, "TransferDate");
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldGetNullWhenPassingInvalidIdentifier(final String identifier) throws JsonProcessingException {
        final InternalTransferSimpleRequestModel request = request();
        request.setIdentifier(identifier);

        createInternalTransferSimpleServiceExecuteAssertions(request, "Identifier");
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldGetNullWhenPassingInvalidDescription(final String description) throws JsonProcessingException {
        final InternalTransferSimpleRequestModel request = request();
        request.setDescription(description);

        createInternalTransferSimpleServiceExecuteAssertions(request, "Description");
    }

    @Test
    void shouldGetNullWhenPassingInvalidValue() throws JsonProcessingException {
        final InternalTransferSimpleRequestModel request = request();
        request.setValue(null);

        createInternalTransferSimpleServiceExecuteAssertions(request, "Value");
    }

    @Test
    void shouldGetNullWhenPassingInvalidRateValue() throws JsonProcessingException {
        final InternalTransferSimpleRequestModel request = request();
        request.setRateValue(null);

        createInternalTransferSimpleServiceExecuteAssertions(request, "RateValue");
    }

    private void createInternalTransferSimpleServiceExecuteAssertions(final InternalTransferSimpleRequestModel request,
                                                                      final String field) throws JsonProcessingException {
        final String requestBody = new Gson().toJson(request);
        final BasicResponseModel response = createInternalTransferSimpleService.execute(requestBody, "");

        Assertions.assertNotNull(response);
        Assertions.assertNotNull(response.getValidation());
        Assertions.assertEquals(1, response.getValidation().length);

        final Map<String, String> validation = (Map<String, String>) response.getValidation()[0];
        Assertions.assertTrue(validation.containsKey(field));
        Assertions.assertEquals(String.format("%s é obrigatório", field), validation.get(field));
    }

    private InternalTransferSimpleRequestModel request() {
        final InternalTransferSimpleRequestModel request = new InternalTransferSimpleRequestModel();
        request.setMethod("GetBoletoById");
        request.setPartnerId(12345L);
        request.setBusinessUnitId(1234567890L);

        request.setFromTaxNumber("10000");
        request.setToTaxNumber("200000");
        request.setValue(BigDecimal.valueOf(1000L));
        request.setRateValue(BigDecimal.valueOf(1000));
        request.setTransferDate("01/01/2023");
        request.setIdentifier(UUID.randomUUID().toString());
        request.setDescription("Description");

        return request;
    }
}

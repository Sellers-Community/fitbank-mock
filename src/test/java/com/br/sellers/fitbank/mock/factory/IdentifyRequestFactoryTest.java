package com.br.sellers.fitbank.mock.factory;

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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

class IdentifyRequestFactoryTest {


    @ParameterizedTest
    @MethodSource("dataSetParameters")
    void shouldGetConcreteInstanceAsPerMethodPassedInJson(final String method, final Class<?> clazz) throws JsonProcessingException {
        final String json = String.format( "{ \"Method\": \"%s\" }", method);
        final ServiceBase instance = IdentifyRequestFactory.getInstance(json);

        Assertions.assertNotNull(instance);
        Assertions.assertEquals(clazz, instance.getClass());
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = "{}")
    void shouldGetNullWhenPassingInvalidJson(final String method) throws JsonProcessingException {
        final String json = String.format( "{ \"Method\": \"%s\" }", method);
        final ServiceBase instance = IdentifyRequestFactory.getInstance(json);

        Assertions.assertNull(instance);
    }

    private static Stream<Arguments> dataSetParameters() {
        return Stream.of(
            Arguments.of(IdentifyRequestFactory.CREATE_ACCOUNT, CreateAccountService.class),
            Arguments.of(IdentifyRequestFactory.GET_ACCOUNT_ENTRY, GetAccountEntryService.class),
            Arguments.of(IdentifyRequestFactory.GENERATE_PAYMENT_SLIP, CreatePaymentSlipService.class),
            Arguments.of(IdentifyRequestFactory.GET_PAYMENT_SLIP_ID, GetPaymentSlipByIdService.class),
            Arguments.of(IdentifyRequestFactory.INTERNAL_TRANSFER_SIMPLE, CreateInternalTransferSimpleService.class),
            Arguments.of(IdentifyRequestFactory.INTERNAL_TRANSFER_MULTIPLE, CreateInternalTransferMultipleService.class),
            Arguments.of(IdentifyRequestFactory.MONEY_TRANSFER, CreateMoneyTransferService.class),
            Arguments.of(IdentifyRequestFactory.GET_MONEY_TRANSFER, GetMoneyTransferService.class),
            Arguments.of(IdentifyRequestFactory.REQUEST_CARD, RequestCardService.class)
        );
    }
}

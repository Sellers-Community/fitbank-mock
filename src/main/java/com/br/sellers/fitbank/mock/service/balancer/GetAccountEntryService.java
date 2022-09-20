package com.br.sellers.fitbank.mock.service.balancer;

import com.br.sellers.fitbank.mock.gateway.model.request.BasicRequestModel;
import com.br.sellers.fitbank.mock.gateway.model.request.balancer.GetAccountEntryRequestModel;
import com.br.sellers.fitbank.mock.gateway.model.response.BasicResponseModel;
import com.br.sellers.fitbank.mock.gateway.model.response.balancer.GetAccountEntryResponseModel;
import com.br.sellers.fitbank.mock.gateway.model.response.balancer.GetAccountEntryStatementResponseModel;
import com.br.sellers.fitbank.mock.service.ServiceBaseImpl;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.*;

public class GetAccountEntryService extends ServiceBaseImpl {

    @Override
    protected BasicRequestModel toObject(String body) {
        return new Gson().fromJson(body, GetAccountEntryRequestModel.class);
    }

    @Override
    protected BasicResponseModel createResponse() {
        return new GetAccountEntryResponseModel();
    }

    @Override
    protected void sucess(BasicRequestModel request, BasicResponseModel response) {
        GetAccountEntryRequestModel modelRequest = (GetAccountEntryRequestModel) request;
        GetAccountEntryResponseModel modelResponde = (GetAccountEntryResponseModel) response;

        int value = new Random().nextInt(5000);
        modelResponde.setIdentifier(new Long(value));
        modelResponde.setTransactionId(new Long(value));
        modelResponde.setBalance(new BigDecimal(0.04));

        if (Boolean.FALSE.toString().toLowerCase(Locale.ROOT).equals(modelRequest.getOnlyBalance())) {
            modelResponde.setEntryResponse(getStatement());
        }
    }

    @Override
    protected void validadeFields(BasicRequestModel request, Map<String, Object> errors) {
        GetAccountEntryRequestModel model = (GetAccountEntryRequestModel) request;

        if( model.getOnlyBalance() == null ){
            model.setOnlyBalance("false");
        }

        validadeField(model.getBusinessUnitId(), "BusinessUnitId", "Mail é obrigatório", errors);
        validadeField(model.getStartDate(), "StartDate", "StartDate é obrigatório", errors);
        validadeField(model.getEndDate(), "EndDate", "EndDate é obrigatório", errors);
        validadeField(model.getBank(), "Bank", "Bank é obrigatório", errors);
        validadeField(model.getBankBranch(), "BankBranch", "BankBranch é obrigatório", errors);
        validadeField(model.getBankAccount(), "BankAccount", "BankAccount é obrigatório", errors);
        validadeField(model.getBankAccountDigit(), "BankAccountDigit", "BankAccountDigit é obrigatório", errors);
    }

    private String getStatement() {

        String json = "[{\n" +
                "    \"InternalIdentifier\": 0,\n" +
                "    \"EntryId\": 0,\n" +
                "    \"Description\": \"Saldo Inicial\",\n" +
                "    \"Subtype\": 21,\n" +
                "    \"EntryDate\": \"2021-06-01T00:00:00\",\n" +
                "    \"EntryValue\": 0.00,\n" +
                "    \"Type\": \"InitialBalance\",\n" +
                "    \"UsedGuaranteed\": null,\n" +
                "    \"GuaranteedValue\": null,\n" +
                "    \"Details\": \"Saldo Inicial\",\n" +
                "    \"ReceiptUrl\": null,\n" +
                "    \"BankDetails\": null,\n" +
                "    \"DocumentNumber\": null,\n" +
                "    \"TransactionId\": null,\n" +
                "    \"Bank\": null,\n" +
                "    \"BankBranch\": null,\n" +
                "    \"BankAccount\": null,\n" +
                "    \"BankAccountDigit\": null,\n" +
                "    \"OperationId\": null,\n" +
                "    \"NoteId\": null,\n" +
                "    \"NoteEntry\": null,\n" +
                "    \"OperationType\": 0,\n" +
                "    \"ManualEntryCategory\": 0,\n" +
                "    \"ReceiptFileName\": null,\n" +
                "    \"Tags\": []\n" +
                "},\n" +
                "{\n" +
                "    \"InternalIdentifier\": 1925525628,\n" +
                "    \"EntryId\": 1925525628,\n" +
                "    \"Description\": \"InternalDischargeAccount\",\n" +
                "    \"Subtype\": 35,\n" +
                "    \"EntryDate\": \"2022-08-11T14:16:04.36\",\n" +
                "    \"EntryValue\": 204.54,\n" +
                "    \"Type\": \"InternalDischargeAccount\",\n" +
                "    \"UsedGuaranteed\": null,\n" +
                "    \"GuaranteedValue\": null,\n" +
                "    \"Details\": \"Transferência - XXXX XXX LTDA (0000000000000)\",\n" +
                "    \"ReceiptUrl\": \"https://receipt.fitbank.com.br/receiptapi/pdf?filename=\",\n" +
                "    \"BankDetails\": null,\n" +
                "    \"DocumentNumber\": \"2104941\",\n" +
                "    \"TransactionId\": 2104941,\n" +
                "    \"Bank\": null,\n" +
                "    \"BankBranch\": null,\n" +
                "    \"BankAccount\": null,\n" +
                "    \"BankAccountDigit\": null,\n" +
                "    \"OperationId\": 139970316,\n" +
                "    \"NoteId\": 125359167,\n" +
                "    \"NoteEntry\": 1925525627,\n" +
                "    \"OperationType\": 6,\n" +
                "    \"ManualEntryCategory\": 0,\n" +
                "    \"ReceiptFileName\": \"2022-08-11/1lfmf14n.pdf\",\n" +
                "    \"Tags\": []\n" +
                "},\n" +
                "{\n" +
                "    \"InternalIdentifier\": 1927124063,\n" +
                "    \"EntryId\": 1927124063,\n" +
                "    \"Description\": \"Pré-taxa para transferencia\",\n" +
                "    \"Subtype\": 13,\n" +
                "    \"EntryDate\": \"2022-08-12T11:12:40.853\",\n" +
                "    \"EntryValue\": -2.50,\n" +
                "    \"Type\": \"PreRateByTransfer\",\n" +
                "    \"UsedGuaranteed\": false,\n" +
                "    \"GuaranteedValue\": null,\n" +
                "    \"Details\": \"Taxa de transferência\",\n" +
                "    \"ReceiptUrl\": \"https://receipt.fitbank.com.br/receiptapi/pdf?filename=\",\n" +
                "    \"BankDetails\": null,\n" +
                "    \"DocumentNumber\": \"5371871\",\n" +
                "    \"TransactionId\": 5371871,\n" +
                "    \"Bank\": \"001\",\n" +
                "    \"BankBranch\": \"1709\",\n" +
                "    \"BankAccount\": \"29262\",\n" +
                "    \"BankAccountDigit\": \"1\",\n" +
                "    \"OperationId\": 140099058,\n" +
                "    \"NoteId\": 125486205,\n" +
                "    \"NoteEntry\": 1927124068,\n" +
                "    \"OperationType\": 3,\n" +
                "    \"ManualEntryCategory\": 0,\n" +
                "    \"ReceiptFileName\": \"2022-08-12/.pdf\",\n" +
                "    \"Tags\": []\n" +
                "},\n" +
                "{\n" +
                "    \"InternalIdentifier\": 1927124067,\n" +
                "    \"EntryId\": 1927124067,\n" +
                "    \"Description\": \"Solicitação de resgate em conta\",\n" +
                "    \"Subtype\": 5,\n" +
                "    \"EntryDate\": \"2022-08-12T11:12:40.903\",\n" +
                "    \"EntryValue\": -202.00,\n" +
                "    \"Type\": \"PreDischargeAccount\",\n" +
                "    \"UsedGuaranteed\": false,\n" +
                "    \"GuaranteedValue\": null,\n" +
                "    \"Details\": \"Transferência Banco do Brasil - 0000 000000-0\",\n" +
                "    \"ReceiptUrl\": \"https://receipt.fitbank.com.br/receiptapi/pdf?filename=\",\n" +
                "    \"BankDetails\": {\n" +
                "        \"Bank\": \"0\",\n" +
                "        \"BankBranch\": \"0\",\n" +
                "        \"BankAccount\": \"0\",\n" +
                "        \"BankAccountDigit\": \"1\"\n" +
                "    },\n" +
                "    \"DocumentNumber\": \"5371871\",\n" +
                "    \"TransactionId\": 5371871,\n" +
                "    \"Bank\": \"001\",\n" +
                "    \"BankBranch\": \"0\",\n" +
                "    \"BankAccount\": \"0\",\n" +
                "    \"BankAccountDigit\": \"1\",\n" +
                "    \"OperationId\": 140099058,\n" +
                "    \"NoteId\": 125486205,\n" +
                "    \"NoteEntry\": 1927124068,\n" +
                "    \"OperationType\": 3,\n" +
                "    \"ManualEntryCategory\": 0,\n" +
                "    \"ReceiptFileName\": \"2022-08-12/.pdf\",\n" +
                "    \"Tags\": []\n" +
                "},\n" +
                "{\n" +
                "    \"InternalIdentifier\": 0,\n" +
                "    \"EntryId\": 0,\n" +
                "    \"Description\": \"Saldo Final\",\n" +
                "    \"Subtype\": 22,\n" +
                "    \"EntryDate\": \"2025-06-30T00:00:00\",\n" +
                "    \"EntryValue\": 0.04,\n" +
                "    \"Type\": \"FinalBalance\",\n" +
                "    \"UsedGuaranteed\": null,\n" +
                "    \"GuaranteedValue\": null,\n" +
                "    \"Details\": \"Saldo Final\",\n" +
                "    \"ReceiptUrl\": null,\n" +
                "    \"BankDetails\": null,\n" +
                "    \"DocumentNumber\": null,\n" +
                "    \"TransactionId\": null,\n" +
                "    \"Bank\": null,\n" +
                "    \"BankBranch\": null,\n" +
                "    \"BankAccount\": null,\n" +
                "    \"BankAccountDigit\": null,\n" +
                "    \"OperationId\": null,\n" +
                "    \"NoteId\": null,\n" +
                "    \"NoteEntry\": null,\n" +
                "    \"OperationType\": 0,\n" +
                "    \"ManualEntryCategory\": 0,\n" +
                "    \"ReceiptFileName\": null,\n" +
                "    \"Tags\": []\n" +
                "}]";

        return json;
//        Type listType = new TypeToken<ArrayList<GetAccountEntryStatementResponseModel>>() {
//        }.getType();
//        return new Gson().fromJson(json, listType);
    }

}

package com.br.sellers.fitbank.mock.gateway.model.response.moneytransfer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetMoneyTransferCheckTransferResponseModel {

    @SerializedName("PrincipalValue")
    private BigDecimal principalValue;

    @SerializedName("Status")
    private int status;

    @SerializedName("paymentDate")
    private String paymentDate;

    @SerializedName("ReceiptUrl")
    private String receiptUrl;

    @SerializedName("ReturnMessage")
    private String returnMessage;

    @SerializedName("ReturnCode")
    private String returnCode;
}

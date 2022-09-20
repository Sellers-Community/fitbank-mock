package com.br.sellers.fitbank.mock.gateway.model.response.paymentslip;

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
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetPaymentSlipDetailsItensResponseModel {

    @SerializedName("DueDate")
    private String dueDate;

    @SerializedName("Barcode")
    private String barCode;

    @SerializedName("DigitableLine")
    private String digitableLine;

    @SerializedName("PaymentDate")
    private String paymentDate;

    @SerializedName("PrincipalValue")
    private BigDecimal principalValue;

    @SerializedName("InterestValue")
    private BigDecimal interestValue;

    @SerializedName("FineValue")
    private BigDecimal fineValue;

    @SerializedName("TotalValue")
    private BigDecimal totalValue;

    @SerializedName("PaidValue")
    private String paidValue;

    @SerializedName("Status")
    private Integer status;

    @SerializedName("MailToSend")
    private String mailToSend;

    @SerializedName("PhoneToSend")
    private String phoneToSend;

    @SerializedName("Comments")
    private String comments;

    @SerializedName("OurNumber")
    private String ourNumber;

    @SerializedName("Identifier")
    private String identifier;

    @SerializedName("ReturnMessage")
    private String returnMessage;

    @SerializedName("ReturnCode")
    private String returnCode;

}

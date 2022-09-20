package com.br.sellers.fitbank.mock.gateway.model.request.moneytransfer;

import com.br.sellers.fitbank.mock.gateway.model.request.BasicRequestModel;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MoneyTransferRequestModel extends BasicRequestModel {
    //--------------------
    // CONTA DE ORIGEN
    @SerializedName("FromTaxNumber")
    private String fromTaxNumber;

    @SerializedName("FromBank")
    private String fromBank;

    @SerializedName("FromBankBranch")
    private String fromBankBranch;

    @SerializedName("FromBankAccount")
    private String fromBankAccount;

    @SerializedName("FromBankAccountDigit")
    private String fromBankAccountDigit;

    //--------------------
    // CONTA DE DESTINO

    @SerializedName("ToTaxNumber")
    private String toTaxNumber;

    @SerializedName("ToName")
    private String toName;

    @SerializedName("Bank")
    private String bank;

    @SerializedName("BankBranch")
    private String bankBranch;

    @SerializedName("BankAccount")
    private String bankAccount;

    @SerializedName("BankAccountDigit")
    private String bankAccountDigit;

    // ------------------------

    @SerializedName("AccountType")
    private int accountType;

    @SerializedName("Value")
    private BigDecimal value;

    @SerializedName("RateValue")
    private BigDecimal rateValue;

    @SerializedName("Identifier")
    private String identifier;

    @SerializedName("RateValueType")
    private Short rateValueType;

    @SerializedName("PaymentDate")
    private String paymentDate;

    @SerializedName("Description")
    private String description;
}

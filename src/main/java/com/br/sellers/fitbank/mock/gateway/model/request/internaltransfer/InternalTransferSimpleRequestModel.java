package com.br.sellers.fitbank.mock.gateway.model.request.internaltransfer;

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
@Builder
public class InternalTransferSimpleRequestModel extends BasicRequestModel {

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

    @SerializedName("ToBank")
    private String bank;

    @SerializedName("ToBankBranch")
    private String bankBranch;

    @SerializedName("ToBankAccount")
    private String bankAccount;

    @SerializedName("ToBankAccountDigit")
    private String bankAccountDigit;

    // ------------------------

    @SerializedName("Value")
    private BigDecimal value;

    @SerializedName("RateValue")
    private BigDecimal rateValue;

    @SerializedName("Identifier")
    private String identifier;

    @SerializedName("RateValueType")
    private Short rateValueType;

    @SerializedName("TransferDate")
    private String transferDate;

    @SerializedName("Description")
    private String description;
}

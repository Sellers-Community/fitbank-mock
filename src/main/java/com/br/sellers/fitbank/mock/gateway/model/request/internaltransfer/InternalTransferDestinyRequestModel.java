package com.br.sellers.fitbank.mock.gateway.model.request.internaltransfer;

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
public class InternalTransferDestinyRequestModel {

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

    @SerializedName("Identifier")
    private String identifier;

    @SerializedName("Description")
    private String description;

}

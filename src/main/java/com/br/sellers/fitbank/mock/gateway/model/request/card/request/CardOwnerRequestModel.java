package com.br.sellers.fitbank.mock.gateway.model.request.card.request;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CardOwnerRequestModel {

    @SerializedName("FullName")
    private String fullName;

    @SerializedName("OwnerTaxNumber")
    private String taxNumber;

    @SerializedName("Phone")
    private String phone;

    @SerializedName("Mail")
    private String email;

    @SerializedName("OwnerMail")
    private String ownerMail;

    @SerializedName("Bank")
    private String bank;

    @SerializedName("BankBranch")
    private String bankBranch;

    @SerializedName("BankAccount")
    private String bankAccount;

    @SerializedName("BankAccountDigit")
    private String bankAccountDigit;

}

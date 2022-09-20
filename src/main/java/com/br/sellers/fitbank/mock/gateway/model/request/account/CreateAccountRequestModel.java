package com.br.sellers.fitbank.mock.gateway.model.request.account;

import com.br.sellers.fitbank.mock.gateway.model.request.BasicRequestModel;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreateAccountRequestModel extends BasicRequestModel {

    @SerializedName("Mail")
    private String mail;

    @SerializedName("Phone")
    private Long phone;

    @SerializedName("Nickname")
    private String nickname;

    @SerializedName("Name")
    private String name;

    @SerializedName("TaxNumber")
    private String taxNumber;

    @SerializedName("Bank")
    private String bank;

    @SerializedName("BankBranch")
    private String bankBranch;

    @SerializedName("BankAccount")
    private String bankAccount;

    @SerializedName("BankAccountDigit")
    private String bankAccountDigit;

}

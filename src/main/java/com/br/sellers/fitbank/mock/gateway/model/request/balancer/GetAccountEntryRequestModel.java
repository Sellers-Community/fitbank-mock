package com.br.sellers.fitbank.mock.gateway.model.request.balancer;

import com.br.sellers.fitbank.mock.gateway.model.request.BasicRequestModel;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GetAccountEntryRequestModel extends BasicRequestModel {

    @SerializedName("OnlyBalance")
    private String onlyBalance;

    @SerializedName("StartDate")
    private String startDate;

    @SerializedName("EndDate")
    private String endDate;

    @SerializedName("Bank")
    private String bank;

    @SerializedName("BankBranch")
    private String bankBranch;

    @SerializedName("BankAccount")
    private String bankAccount;

    @SerializedName("BankAccountDigit")
    private String bankAccountDigit;

}

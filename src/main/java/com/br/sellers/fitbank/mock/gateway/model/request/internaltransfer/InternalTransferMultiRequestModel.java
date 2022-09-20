package com.br.sellers.fitbank.mock.gateway.model.request.internaltransfer;

import com.br.sellers.fitbank.mock.gateway.model.request.BasicRequestModel;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InternalTransferMultiRequestModel extends BasicRequestModel {

    //--------------------
    // CONTA DE ORIGEN
    @SerializedName("TaxNumber")
    private String fromTaxNumber;

    @SerializedName("Bank")
    private String fromBank;

    @SerializedName("BankBranch")
    private String fromBankBranch;

    @SerializedName("BankAccount")
    private String fromBankAccount;

    @SerializedName("BankAccountDigit")
    private String fromBankAccountDigit;

    @SerializedName("InternalTransfers")
    private List<InternalTransferDestinyRequestModel> internalTransfers;

}

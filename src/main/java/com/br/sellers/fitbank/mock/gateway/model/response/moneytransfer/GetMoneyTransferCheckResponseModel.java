package com.br.sellers.fitbank.mock.gateway.model.response.moneytransfer;

import com.br.sellers.fitbank.mock.gateway.model.response.BasicResponseModel;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetMoneyTransferCheckResponseModel extends BasicResponseModel {

    @SerializedName("Transferencia")
    private String transfer;

}

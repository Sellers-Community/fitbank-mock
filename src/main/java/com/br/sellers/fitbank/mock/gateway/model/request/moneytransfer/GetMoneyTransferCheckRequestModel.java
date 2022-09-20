package com.br.sellers.fitbank.mock.gateway.model.request.moneytransfer;

import com.br.sellers.fitbank.mock.gateway.model.request.BasicRequestModel;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetMoneyTransferCheckRequestModel extends BasicRequestModel {

    @SerializedName("DocumentNumber")
    private String documentNumber;

}

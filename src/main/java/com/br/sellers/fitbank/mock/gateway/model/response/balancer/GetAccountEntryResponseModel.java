package com.br.sellers.fitbank.mock.gateway.model.response.balancer;

import com.br.sellers.fitbank.mock.gateway.model.response.BasicResponseModel;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GetAccountEntryResponseModel extends BasicResponseModel {

    @SerializedName("Identifier")
    private Long identifier;

    @SerializedName("TransactionId")
    private Long transactionId;

    @SerializedName("Balance")
    private BigDecimal balance;

    @SerializedName("Entry")
    private String entryResponse;
}

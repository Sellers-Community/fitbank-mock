package com.br.sellers.fitbank.mock.gateway.model.response.internaltransfer;

import com.br.sellers.fitbank.mock.gateway.model.response.BasicResponseModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class InternalTransferResponseModel extends BasicResponseModel {

    @SerializedName("DocumentNumber")
    private Long documentNumber;

    @SerializedName("InternalTransfers")
    private String internalTransfers;

}

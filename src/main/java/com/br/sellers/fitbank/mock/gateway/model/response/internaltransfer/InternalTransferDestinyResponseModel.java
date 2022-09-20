package com.br.sellers.fitbank.mock.gateway.model.response.internaltransfer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class InternalTransferDestinyResponseModel {

    @SerializedName("Success")
    private boolean success;

    @SerializedName("Identifier")
    private Long identifier;

    @SerializedName("DocumentNumber")
    private Long documentNumber;

    @SerializedName("Message")
    private String message;
}

package com.br.sellers.fitbank.mock.gateway.model.request;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BasicRequestModel {

    @SerializedName("Method")
    private String method;

    @SerializedName("PartnerId")
    private Long partnerId;

    @SerializedName("BusinessUnitId")
    private Long businessUnitId;

}

package com.br.sellers.fitbank.mock.gateway.model.response;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BasicResponseModel {

    @SerializedName("Success")
    private boolean success;

    @SerializedName("Message")
    private String message;

    @SerializedName("Validation")
    private Object[] validation;

}

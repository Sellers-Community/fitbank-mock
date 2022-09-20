package com.br.sellers.fitbank.mock.gateway.model.response.card.request;

import com.br.sellers.fitbank.mock.gateway.model.response.BasicResponseModel;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestCardResponseModel extends BasicResponseModel {

    @SerializedName("IdentifierCard")
    private String identifierCard;

}

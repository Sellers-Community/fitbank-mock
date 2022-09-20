package com.br.sellers.fitbank.mock.gateway.model.response.account;

import com.br.sellers.fitbank.mock.gateway.model.response.BasicResponseModel;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreateAccountResponseModel extends BasicResponseModel {

    @SerializedName("Identifier")
    private Long identifier;

}

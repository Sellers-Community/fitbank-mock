package com.br.sellers.fitbank.mock.gateway.model.request.card.request;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CardHolderContactRequestModel {

    @SerializedName("Mail")
    private String mail;

    @SerializedName("Phone")
    private String phone;
}

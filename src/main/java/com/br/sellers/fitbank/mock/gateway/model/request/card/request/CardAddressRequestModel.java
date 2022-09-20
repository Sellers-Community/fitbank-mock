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
public class CardAddressRequestModel {

    @SerializedName("Line")
    private String line;

    @SerializedName("Number")
    private String number;

    @SerializedName("Complement")
    private String complement;

    @SerializedName("Reference")
    private String reference;

    @SerializedName("Neighborhood")
    private String neighborhood;

    @SerializedName("ZipCode")
    private String zipCode;

    @SerializedName("City")
    private String city;

    @SerializedName("State")
    private String state;

    @SerializedName("Country")
    private String country;
}

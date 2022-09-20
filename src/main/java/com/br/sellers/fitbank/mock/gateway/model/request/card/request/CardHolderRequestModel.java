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
public class CardHolderRequestModel {

    @SerializedName("FullName")
    private String fullName;

    @SerializedName("HolderTaxNumber")
    private String holderTaxNumber;

    @SerializedName("Nationality")
    private String nationality;

    @SerializedName("MotherName")
    private String motherName;

    @SerializedName("BirthDate")
    private String birthDate;

    @SerializedName("MaritalStatus")
    private Integer maritalStatus;

    @SerializedName("Gender")
    private Integer gender;

    @SerializedName("CardHolderContact")
    private String cardHolderContact;

}

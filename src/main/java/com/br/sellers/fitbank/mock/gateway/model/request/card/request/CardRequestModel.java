package com.br.sellers.fitbank.mock.gateway.model.request.card.request;

import com.br.sellers.fitbank.mock.gateway.model.request.BasicRequestModel;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CardRequestModel extends BasicRequestModel {

    @SerializedName("UsageType")
    private Integer usageType;

    @SerializedName("IdentifierProduct")
    private String identifierProduct;

    @SerializedName("ConsumeType")
    private Integer consumeType;

    @SerializedName("CardHolderContact")
    private CardHolderContactRequestModel cardHolderContact;

    @SerializedName("CardOwner")
    private CardOwnerRequestModel cardOwner;

    @SerializedName("CardHolder")
    private CardHolderRequestModel cardHolder;

    @SerializedName("CardDeliveryAddress")
    private CardAddressRequestModel cardDeliveryAddress;

    @SerializedName("BillingAddress")
    private CardAddressRequestModel billingAddress;


}

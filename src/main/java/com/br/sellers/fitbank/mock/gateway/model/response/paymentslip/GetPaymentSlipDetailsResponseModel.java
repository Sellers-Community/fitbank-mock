package com.br.sellers.fitbank.mock.gateway.model.response.paymentslip;

import com.br.sellers.fitbank.mock.gateway.model.response.BasicResponseModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetPaymentSlipDetailsResponseModel extends BasicResponseModel {

    @SerializedName("Boleto")
    private GetPaymentSlipDetailsItensResponseModel boleto;

}

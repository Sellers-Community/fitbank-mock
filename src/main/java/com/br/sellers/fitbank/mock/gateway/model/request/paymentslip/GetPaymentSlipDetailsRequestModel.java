package com.br.sellers.fitbank.mock.gateway.model.request.paymentslip;

import com.br.sellers.fitbank.mock.gateway.model.request.BasicRequestModel;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetPaymentSlipDetailsRequestModel extends BasicRequestModel {

    @SerializedName("MktPlaceId")
    private Long mktPlaceId;

    @SerializedName("DocumentNumber")
    private String documentNumber;

}

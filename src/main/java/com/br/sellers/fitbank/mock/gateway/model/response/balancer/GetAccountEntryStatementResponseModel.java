package com.br.sellers.fitbank.mock.gateway.model.response.balancer;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GetAccountEntryStatementResponseModel {

    @SerializedName("InternalIdentifier")
    private Long internalIdentifier;

    @SerializedName("Details")
    private String description;

    @SerializedName("Subtype")
    private Integer subtype;

    @SerializedName("EntryDate")
    private String entryDate;

    @SerializedName("EntryValue")
    private BigDecimal entryValue;

    @SerializedName("UsedGuaranteed")
    private Boolean usedGuaranteed;

    @SerializedName("GuaranteedValue")
    private BigDecimal guaranteedValue;

    @SerializedName("ReceiptUrl")
    private String receiptUrl;

    @SerializedName("DocumentNumber")
    private String documentNumber;

    @SerializedName("Type")
    private String type;

}

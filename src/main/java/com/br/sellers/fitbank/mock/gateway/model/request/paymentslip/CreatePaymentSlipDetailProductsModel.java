package com.br.sellers.fitbank.mock.gateway.model.request.paymentslip;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePaymentSlipDetailProductsModel {

    //-------- SELLER - QUEM EMITE O BOLE
    @SerializedName("SellerPersonType")
    private int sellerPersonType;

    @SerializedName("SellerName")
    private String sellerName;

    @SerializedName("SellerTaxNumber")
    private String sellerTaxNumber;

    @SerializedName("Bank")
    private String bank;

    @SerializedName("BankBranch")
    private String bankBranch;

    @SerializedName("BankAccount")
    private String bankAccount;

    @SerializedName("BankAccountDigit")
    private String bankAccountDigit;


    //------ RECEIVE ----------------
    @SerializedName("ReceiverPersonType")
    private int receiverPersonType;

    @SerializedName("ReceiverName")
    private String receiverName;

    @SerializedName("ReceiverTaxNumber")
    private String receiverTaxNumber;

    @SerializedName("ReceiverBank")
    private String receiverBank;

    @SerializedName("ReceiverBankBranch")
    private String receiverBankBranch;

    @SerializedName("ReceiverBankAccount")
    private String receiverBankAccount;

    @SerializedName("ReceiverBankAccountDigit")
    private String receiverBankAccountDigit;

    //-----------------------------------------------------

    @SerializedName("Reference")
    private Long reference;

    @SerializedName("ProductCode")
    private Long productCode;

    @SerializedName("ProductName")
    private String productName;

    @SerializedName("ProductQty")
    private BigDecimal productQty;

    @SerializedName("ProductValue")
    private BigDecimal productValue;

}

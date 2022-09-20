package com.br.sellers.fitbank.mock.gateway.model.request.paymentslip;

import com.br.sellers.fitbank.mock.gateway.model.request.BasicRequestModel;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePaymentSlipRequestModel extends BasicRequestModel {

    @SerializedName("MktPlaceId")
    private Long mktPlaceId;

    @SerializedName("GroupTemplate")
    private Long groupTemplate;

    @SerializedName("CustomerName")
    private String customerName; // Player name

    @SerializedName("CustomerTaxNumber")
    private String customerTaxNumber; // player cpf cnpj

    @SerializedName("CustomerMail")
    private String customerMail;

    @SerializedName("CustomerPhone")
    private String customerPhone;

    @SerializedName("Neighborhood")
    private String neighborhood;

    @SerializedName("City")
    private String city;

    @SerializedName("State")
    private String state;

    @SerializedName("ZipCode")
    private String zipCode;

    @SerializedName("AddressLine1")
    private String addressLine1;

    //---------------------------------------------

    //----
    // Emissor
    @SerializedName("SupplierTaxNumber")
    private String supplierTaxNumber;

    @SerializedName("SupplierFullName")
    private String supplierFullName;

    @SerializedName("SupplierTradingName")
    private String supplierTradingName;

    @SerializedName("SupplierLegalName")
    private String supplierLegalName;

    @SerializedName("SupplierMail")
    private String supplierMail;

    @SerializedName("SupplierPhone")
    private String supplierPhone;

    //----
    @SerializedName("SupplierBank")
    private String supplierBank;

    @SerializedName("SupplierBankBranch")
    private String supplierBankBranch;

    @SerializedName("SupplierBankAccount")
    private String supplierBankAccount;

    @SerializedName("SupplierBankAccountDigit")
    private String supplierBankAccountDigit;

    //---------------------------------------------

    @SerializedName("RateValue")
    private BigDecimal rateValue; // Débito feito no fornecedor por boleto.

    @SerializedName("RateSent")
    private Boolean rateSent;

    @SerializedName("ExternalNumber")
    private String externalNumber;

    @SerializedName("Identifier")
    private String identifier;

    @SerializedName("DueDate") // data de vencimento
    private String dueDate;

    @SerializedName("TotalValue") // valor do boleto
    private BigDecimal totalValue;

    @SerializedName("Products")
    private List<CreatePaymentSlipDetailProductsModel> products;

}

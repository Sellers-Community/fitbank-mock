package com.br.sellers.fitbank.mock.service.internaltransfer;

import com.br.sellers.fitbank.mock.gateway.model.request.BasicRequestModel;
import com.br.sellers.fitbank.mock.gateway.model.request.internaltransfer.InternalTransferDestinyRequestModel;
import com.br.sellers.fitbank.mock.gateway.model.request.internaltransfer.InternalTransferMultiRequestModel;
import com.br.sellers.fitbank.mock.gateway.model.response.BasicResponseModel;
import com.br.sellers.fitbank.mock.gateway.model.response.internaltransfer.InternalTransferDestinyResponseModel;
import com.br.sellers.fitbank.mock.gateway.model.response.internaltransfer.InternalTransferResponseModel;
import com.br.sellers.fitbank.mock.service.ServiceBaseImpl;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class CreateInternalTransferMultipleService extends ServiceBaseImpl {

    @Override
    protected BasicRequestModel toObject(String body) {
        return new Gson().fromJson(body, InternalTransferMultiRequestModel.class);
    }

    @Override
    protected BasicResponseModel createResponse() {
        return new InternalTransferResponseModel();
    }

    @Override
    protected void sucess(BasicRequestModel request, BasicResponseModel response) {
        InternalTransferMultiRequestModel model = (InternalTransferMultiRequestModel) request;
        InternalTransferResponseModel modelResponde = (InternalTransferResponseModel) response;

        int value = new Random().nextInt(5000);
        modelResponde.setDocumentNumber(new Long(value));
        List<InternalTransferDestinyResponseModel> internalTransfers = new ArrayList<>();

        for (InternalTransferDestinyRequestModel internalTransfer : model.getInternalTransfers()) {
            internalTransfers.add(create(internalTransfer));
        }

        modelResponde.setInternalTransfers(new Gson().toJson(internalTransfers));
//        modelResponde.setInternalTransfers(internalTransfers);
    }

    @Override
    protected void validadeFields(BasicRequestModel request, Map<String, Object> errors) {
        InternalTransferMultiRequestModel model = (InternalTransferMultiRequestModel) request;

        validadeField(model.getInternalTransfers(), "InternalTransfers", "InternalTransfers é obrigatório", errors);

        if (model.getInternalTransfers() != null) {
            for (InternalTransferDestinyRequestModel internalTransfer : model.getInternalTransfers()) {
                validadeField(internalTransfer.getIdentifier(), "Identifier", "Identifier é obrigatório", errors);
            }
        }
    }

    private InternalTransferDestinyResponseModel create(InternalTransferDestinyRequestModel internalTransfer) {
        InternalTransferDestinyResponseModel internalTransferDestinyResponseModel = new InternalTransferDestinyResponseModel();
        internalTransferDestinyResponseModel.setIdentifier(new Long(internalTransfer.getIdentifier()));
        int value = new Random().nextInt(5000);
        internalTransferDestinyResponseModel.setDocumentNumber(new Long(value));
        internalTransferDestinyResponseModel.setSuccess(true);
        return internalTransferDestinyResponseModel;
    }

}

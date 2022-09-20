package com.br.sellers.fitbank.mock.service;

import com.br.sellers.fitbank.mock.gateway.model.request.BasicRequestModel;
import com.br.sellers.fitbank.mock.gateway.model.response.BasicResponseModel;
import com.google.gson.Gson;
import lombok.extern.log4j.Log4j2;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

@Log4j2
public abstract class ServiceBaseImpl implements ServiceBase {

    private static final String TIMEOUT = "TIMEOUT";

    protected abstract BasicRequestModel toObject(String body);

    protected abstract BasicResponseModel createResponse();

    protected abstract void sucess(BasicRequestModel request, BasicResponseModel response);

    public BasicResponseModel execute(String body, String simulate) {

        log.debug("Início do execute ");

        BasicRequestModel model = toObject(body);
        BasicResponseModel modelResponde = createResponse();
        modelResponde.setSuccess(true);

        log.debug("Validando basicos");
        validadeFieldBasic(modelResponde, model);

        if (!modelResponde.isSuccess()) {
            log.debug("Retorno por sucess = false");
            return modelResponde;
        }

        Map<String, Object> errors = new HashMap<>();
        validadeFields(model, errors);

        boolean validateError = errors.size() > 0;
        modelResponde.setSuccess(!validateError);

        if (validateError) {
            errorReturn(modelResponde, errors);
        } else {
            modelResponde.setSuccess(true);
            sucess(model, modelResponde);
        }

        simulate(simulate, modelResponde);

        if (errors != null) {
            for (String item : errors.keySet()) {
                log.debug(errors.get(item));
            }
        }

        return modelResponde;
    }

    protected void validadeFieldBasic(BasicResponseModel modelResponde, BasicRequestModel model) {
        if (model.getBusinessUnitId() == null || model.getPartnerId() == null) {
            modelResponde.setSuccess(false);
            errorReturn(modelResponde, "ISE0024 - As credenciais não foram informadas corretamente.");
        }
    }

    protected void validadeFields(BasicRequestModel request, Map<String, Object> errors) {

    }

    protected void validadeField(Object value, String field, String message, Map<String, Object> errors) {
        if (StringUtils.isEmpty(value)) {
            errors.put(field, message);
        }
    }

    protected void errorReturn(BasicResponseModel modelResponde) {
        errorReturn(modelResponde, "Erro generico. Avalie todos os campos obrigatorios da documentação");
    }


    protected void errorReturn(BasicResponseModel modelResponde, Map<String, Object> errors) {
        String json = new Gson().toJson(errors);

        log.debug(json);

        Object[] itens = new Gson().fromJson("[" + json + "]", Object[].class);
        modelResponde.setValidation(itens);
        modelResponde.setMessage("ISE0014 - Informações enviadas estão inválidas. Veja a propriedade Validation do json para mais detalhes");
    }

    protected void errorReturn(BasicResponseModel modelResponde, String message) {
        modelResponde.setValidation(new Object[]{});
        modelResponde.setMessage(message);
    }

    protected void simulate(String simulate, BasicResponseModel modelResponde) {
        if( TIMEOUT.equals(simulate) ){
            log.debug("Simulação de timeout ligada. 1 minuto travado");
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                // ignorado explicitamente
                // Muito cuidado ao fazer isso em qualquer projeto
            }
        }
    }
}

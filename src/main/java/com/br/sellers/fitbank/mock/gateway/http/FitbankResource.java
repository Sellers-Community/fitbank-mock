package com.br.sellers.fitbank.mock.gateway.http;

import com.br.sellers.fitbank.mock.factory.IdenytifyRequestFactory;
import com.br.sellers.fitbank.mock.gateway.model.response.BasicResponseModel;
import com.br.sellers.fitbank.mock.service.ServiceBase;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Objects;

/**
 * Único endpoint do servidor.
 * A definição de qual serviço executar fica dentro do json recebido por request.
 */
@Log4j2
@RestController
public class FitbankResource {

    /**
     * Endpoint principal.
     *
     * @param request
     * @param simulate
     * @return
     * @throws IOException
     */
    @PostMapping(value = "main/execute")
    public ResponseEntity<BasicResponseModel> main(HttpServletRequest request,
                                                   @RequestHeader(value = "SIMULATE_SCENARIO", defaultValue = "") String simulate) throws IOException {
        String requestBody = ResourceHelper.requestBody(request);
        log.debug(requestBody);

        ServiceBase instance = IdenytifyRequestFactory.getInstance(requestBody);
        if (Objects.isNull(instance)) {
            return ResponseEntity.badRequest().build();
        }

        BasicResponseModel response = instance.execute(requestBody, simulate);
        return ResponseEntity.ok(response);
    }
}

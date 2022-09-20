package com.br.sellers.fitbank.mock.gateway.http;

import com.br.sellers.fitbank.mock.factory.IdenytifyRequestFactory;
import com.br.sellers.fitbank.mock.gateway.model.response.BasicResponseModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Único endpoint do servidor.
 * A definição de qual serviço executar fica dentro do json recebido por request.
 */
@Log4j2 // Anotação do Lombok
@RestController // Anotação do Spring Boot
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

        // Esse código abaixo tem o objetivo de coletar o requestbody que foi recebido.
        // Mas porque fazer isso e não usar o @RequestBody?
        // Porque o servidor utiliza apenas 1 endpoint para todos os serviços.
        // Sendo assim, é mais simples pegar o json completo e depois converter no objeto correto.
        StringBuilder builder = new StringBuilder();
        try (BufferedReader in = request.getReader()) {
            char[] buf = new char[4096];
            for (int len; (len = in.read(buf)) > 0; )
                builder.append(buf, 0, len);
        }

        String requestBody = builder.toString();

        log.debug(requestBody);

        BasicResponseModel response = IdenytifyRequestFactory.getInstance(requestBody).execute(requestBody, simulate);
        return ResponseEntity.ok(response);
    }

}

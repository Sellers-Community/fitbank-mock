package com.br.sellers.fitbank.mock.gateway.http;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;

public final class ResourceHelper {

    private ResourceHelper() { }

    /**
     * Esse código abaixo tem o objetivo de coletar o requestbody que foi recebido.
     * Mas porque fazer isso e não usar o @RequestBody ?
     * Porque o servidor utiliza apenas 1 endpoint para todos os serviços.
     * Sendo assim, é mais simples pegar o json completo e depois converter no objeto correto.
     *
     * @param request
     * @return RequestBody
     * @throws IOException
     */
    public static String requestBody(final HttpServletRequest request) throws IOException {
        final StringBuilder builder = new StringBuilder();
        try (BufferedReader in = request.getReader()) {
            char[] buf = new char[4096];
            for (int len; (len = in.read(buf)) > 0;) {
                builder.append(buf, 0, len);
            }
        }

        return builder.toString();
    }
}

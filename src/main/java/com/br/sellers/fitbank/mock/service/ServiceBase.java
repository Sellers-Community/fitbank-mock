package com.br.sellers.fitbank.mock.service;

import com.br.sellers.fitbank.mock.gateway.model.response.BasicResponseModel;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface ServiceBase {
    BasicResponseModel execute(String body, String simulate) throws JsonProcessingException;
}

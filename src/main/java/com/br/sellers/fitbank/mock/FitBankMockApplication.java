package com.br.sellers.fitbank.mock;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Este é a classe principal de um projeto Spring Boot.
 * É com ela que o serviço sobe.
 *
 * Este projeto tem como objetivo simular o servidor da fitbank.
 * Para isso, temos apenas 1 endpoint, que fica na classe "FitbankResource".
 *
 */
@SpringBootApplication
@Log4j2
public class FitBankMockApplication {

    public static void main(String[] args) {
        SpringApplication.run(FitBankMockApplication.class, args);
    }

}

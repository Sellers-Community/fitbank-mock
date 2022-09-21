## Fitbank Mock

![Sellers](https://img.shields.io/badge/project-%20Sellers%20Developer%20Community%20-orange) <br>
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) <br>
![author](https://img.shields.io/badge/author-Marcelo%20Vieira-success)

## Problema a ser resolvido
A Fitbank (https://fitbank.com.br/) é um banco como serviço que é amplamente usado.
Mas durante a integração, é muito complicado usar o ambiente de homologação, por ficar muito offline.
Muito dos testes acabam sendo feito em produção, não podendo testar muitos dos cenáros de circuit breaker.

## Solução
Este projeto aberto, tem o objetivo de colaorativamente, criar um mock da api da Fitbank, para ser usar e exporado no desenvolvimento 
dos projetos.

## Quem pode colaborar?
Todos. Basta pedir para ser adicionado na organização (https://github.com/Sellers-Community) e seguir as issues abertas.

## Leitura obrigatória para todos os colaboradores
* A versão do Java é 1.8;
  * Está sendo usado o Java 1.8 por uma compatibilidade com a Sellers. Mas estámos planejamento uma migração para o Java 11 ou um mais novo.
* Não remover comentários do código. Todo o projeto está sendo preparado para estudantes iniciantes em programação e Java.

## Serviços atendidos hoje
```
    public static final String CREATE_ACCOUNT = "CreateAccount";
    public static final String GET_ACCOUNT_ENTRY = "GetAccountEntry";
    public static final String GENERATE_PAYMENT_SLIP = "GenerateBoleto";
    public static final String GET_PAYMENT_SLIP_ID = "GetBoletoById";
    public static final String INTERNAL_TRANSFER_SIMPLE = "InternalTransfer";
    public static final String INTERNAL_TRANSFER_MULTIPLE = "MultipleInternalTransfers";
    public static final String MONEY_TRANSFER = "MoneyTransfer";
    public static final String GET_MONEY_TRANSFER = "GetMoneyTransferOutById";
    public static final String REQUEST_CARD = "RequestCard";
```

### Testar
Basta fazer a requisição com o bady.

```
POST http://localhost:8031/main/execute
```

```
{
  "Method": "CreateAccount",
  "PartnerId": 0,
  "BusinessUnitId": 0,
  "Mail": "1984346",
  "Phone": "1984346",
  "Nickname": "Nickname",
  "Name": "Name",
  "TaxNumber": "TaxNumber",
  "Bank": "Bank",
  "BankBranch": "BankBranch",
  "BankAccount": "BankAccount",
  "BankAccountDigit": "BankAccountDigit"
}
```
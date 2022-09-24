## FitBank Mock

![Sellers](https://img.shields.io/badge/project-%20Sellers%20Developer%20Community%20-orange) <br>
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) <br>
![author](https://img.shields.io/badge/author-Marcelo%20Vieira-success)

## Problema a ser resolvido
O FitBank (https://fitbank.com.br/) é um banco como serviço que é amplamente usado. 
Contudo, durante a integração, é muito complicado usar o ambiente de homologação, por ficar bastante tempo offline.
Muitos dos testes acabam sendo feitos em produção, não podendo testar vários dos cenáros de circuit breaker.

## Solução
Este projeto aberto tem o objetivo de, colaborativamente, criar um mock da API do FitBank para ser usada e explorada no desenvolvimento de projetos.

## Quem pode colaborar?
Todos. Basta pedir para ser adicionado na organização [Sellers Developer Community](https://github.com/Sellers-Community) e seguir as [issues](https://github.com/Sellers-Community/fitbank-mock/issues) abertas.

## Leitura obrigatória para todos os colaboradores
* A versão do Java é a 1.8;
  * Está sendo usado o Java 1.8 por uma compatibilidade com a Sellers, mas estamos planejando uma migração para o Java 11 ou mais recente.
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

## Testar
Basta fazer uma requisição com o seguinte body:

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
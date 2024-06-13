# Projeto de Exemplo: Tratamento de Exceções em Java

Este projeto demonstra a implementação de tratamento de exceções em Java, com foco na programação defensiva. A classe `Account` inclui métodos para depósito e saque, com validações para limites de saque e saldo insuficiente.

## Índice

- [Descrição](#descrição)
- [Funcionalidades](#funcionalidades)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Como Executar](#como-executar)
- [Exemplo de Uso](#exemplo-de-uso)

## Descrição

Este projeto foi criado como parte de um estudo sobre tratamento de exceções em Java. Ele ilustra como usar a programação defensiva para tratar erros comuns, como tentativa de saque acima do saldo disponível ou acima do limite permitido.

## Funcionalidades

- Criação de contas com número, titular, saldo inicial e limite de saque.
- Depósito de valores na conta.
- Saque de valores com tratamento de exceções para:
  - Exceder o limite de saque.
  - Saldo insuficiente.
  - Número da conta inválido.

## Estrutura do Projeto

```plaintext
src/
├── application/
│   └── Program.java
├── model/
│   ├── entities/
│   │   └── Account.java
│   └── exception/
│       └── AccountLimitException.java
```

## Como Executar

git clone https://github.com/MatheusCMoraes/praticandoExcecoes.git
cd praticandoExcecoes

## Compile os arquivos Java

javac src/application/Program.java -d bin

## Execute o programa

java -cp bin application.Program

## Exemplo de Uso

```plaintext
Enter account data
Number: 123
Holder: John Doe
Initial balance: 500.00
Withdraw limit: 300.00

Enter amount for withdraw: 100.00
New balance: 400.00
```

```plaintext
Se o valor do saque exceder o saldo ou o limite, uma mensagem de erro será exibida:
```
```plaintext
Enter amount for withdraw: 400.00
Withdraw error: Not enough balance

Enter amount for withdraw: 350.00
Withdraw error: The amount exceeds withdraw limit.
```

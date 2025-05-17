
# 🏦 LAB - Banco Digital (POO em Java)

Este projeto é uma implementação de um **banco digital simples**, proposto como desafio no curso da [DIO (Digital Innovation One)](https://www.dio.me/) para aplicar os conceitos de **Programação Orientada a Objetos (POO)** em Java.

## 💡 Desafio Original (DIO)

> "Um banco digital oferece aos seus clientes dois tipos de contas (corrente e poupança), com funcionalidades como **depósito**, **saque**, **transferência** entre contas da própria instituição e operações automatizadas, como aplicação de rendimento e cobrança de taxa de manutenção."

Durante o desenvolvimento, o projeto também foi estendido com funcionalidades extras, como histórico de transações, taxa de manutenção e rendimento mensal para conta poupança.

---

## 📁 Estrutura do Projeto

```
LAB-BANCO-DIGITAL-OO/
│
├── bin/                       # Arquivos compilados (.class)
├── lib/                       # (pasta atualmente vazia ou removida)
├── src/
│   └── com/bancodigital/
│       ├── exception/         # Exceções customizadas (ex: saldo insuficiente)
│       ├── model/             # Modelos principais: Conta, Cliente, Transacao etc.
│       ├── repository/        # Repositório em memória do banco
│       ├── service/           # Serviços como geração de relatórios
│       └── Main.java          # Classe principal para testes ou execução
├── .vscode/                   # Configurações do VS Code
├── README.md                  # Este arquivo
```

---

## 📌 Funcionalidades Implementadas

### Conta Corrente (`ContaCorrente`)
- Saque, depósito, transferência
- Impressão de extrato
- Cobrança de taxa de manutenção

### Conta Poupança (`ContaPoupanca`)
- Saque, depósito, transferência
- Impressão de extrato
- Aplicação de rendimento mensal (juros)

### Outras funcionalidades:
- Histórico de operações com data/hora (`Transacao`)
- Sistema de exceções personalizadas
- Geração de relatório geral (`RelatorioBanco`)
- Repositório de contas em memória (`BancoRepository`)

---

## ⚙️ Conceitos de POO Aplicados

### ✅ Abstração
A classe `Conta` é uma abstração comum para as contas bancárias, contendo atributos e métodos compartilhados entre `ContaCorrente` e `ContaPoupanca`.

### ✅ Encapsulamento
Todos os atributos das classes estão encapsulados com modificadores de acesso adequados e acesso controlado por métodos públicos (`getters/setters`).

### ✅ Herança
As classes `ContaCorrente` e `ContaPoupanca` estendem a classe abstrata `Conta`, reutilizando e especializando comportamentos.

### ✅ Polimorfismo
As contas são manipuladas através do tipo genérico `Conta`, permitindo o uso de listas e operações de forma polimórfica.

---

## ✅ Tecnologias Utilizadas

- Java 17+
- IDE: VSCode (com extensão para Java)

---

## 👨‍💻 Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/EduardoReis2020/LAB-BANCO-DIGITAL-OO.git
```

2. Compile e execute o projeto
```bash
cd LAB-BANCO-DIGITAL-OO
javac -d bin src/com/bancodigital/**/*.java
java -cp bin com.bancodigital.Main
```
---

## 📚 Autor e Créditos

Desenvolvido por [Eduardo Reis](https://github.com/EduardoReis2020) como parte do desafio da Digital Innovation One.
Mentoria: *Criando um Banco Digital com Java e Orientação a Objetos*

---

## 📄 Licença

Este projeto é de livre uso educacional.

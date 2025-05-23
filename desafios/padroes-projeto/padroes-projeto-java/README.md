# Explorando Padrões de Projetos na Prática com Java

Este projeto foi desenvolvido como parte de um desafio de projeto do curso **Trilha Java** da plataforma [DIO](https://www.dio.me/), baseado no repositório original: [digitalinnovationone/lab-padroes-projeto-java](https://github.com/digitalinnovationone/lab-padroes-projeto-java).

## Descrição

Repositório com as implementações dos padrões de projeto explorados no Lab "Explorando Padrões de Projetos na Prática com Java". Especificamente, este projeto explora alguns padrões utilizando Java puro:

- **Singleton**
- **Strategy/Repository**
- **Facade**

## Arquitetura e Organização do Projeto

O projeto segue uma arquitetura simples, separando cada padrão de projeto em seu respectivo pacote. A estrutura de diretórios é a seguinte:

```
src/
└── designs/
   ├── facade/
   │   ├── Facade.java
   ├── singleton/
   │   ├── SingletonEager.java
   │   ├── SingletonLazy.java
   │   └── SingletonLazyHolder.java
   ├── strategy/
   │   ├── Comportamento.java
   │   ├── ComportamentoAgressivo.java
   │   ├── ComportamentoDefensivo.java
   │   ├── ComportamentoNormal.java
   │   └── Robo.java
   ├── subsistema1/
   │   └── CrmService.java
   ├── subsistema2/
   │   └── CepApi.javaS
   └── Main.java
```

### Descrição das Classes

#### Pacote: `singleton`
- **SingletonLazy**: Implementação do padrão Singleton com inicialização preguiçosa (Lazy).
- **SingletonEager**: Implementação do padrão Singleton com inicialização ansiosa (Eager).
- **SingletonLazyHolder**: Implementação do Singleton utilizando o Holder, garantindo thread safety e lazy loading.

#### Pacote: `strategy`
- **Comportamento**: Interface que define o contrato para os comportamentos do robô.
- **ComportamentoNormal**: Implementação de comportamento normal do robô.
- **ComportamentoDefensivo**: Implementação de comportamento defensivo do robô.
- **ComportamentoAgressivo**: Implementação de comportamento agressivo do robô.
- **Robo**: Classe que representa o robô, permitindo alterar seu comportamento em tempo de execução (Strategy).

#### Pacote: `facade`
- **Facade**: Implementa o padrão Facade, simplificando a interação com um subsistema complexo de cadastro de clientes e endereços.

#### Pacote: `subsistema1`
- **CrmService**: Simula um serviço de CRM responsável por gravar informações de clientes.

#### Pacote: `subsistema2`
- **CepApi**: Simula uma API de consulta de CEP, retornando informações de localização.

#### Raiz: `src`
- **Main**: Classe principal para execução e demonstração dos padrões implementados.

## Como clonar e executar o projeto

1. **Clone o repositório:**
   ```sh
   git clone https://github.com/EduardoReis2020/padroes-projeto-java.git
   cd padroes-projeto-java
   ```

2. **Abra o projeto no Visual Studio Code ou na IDE de sua preferência.**

3. **Compile e execute:**
   - Se estiver usando o VS Code com a extensão Java, basta clicar em "Run" na classe `Main.java`.
   - Ou, via terminal:
     ```sh
     cd src/main/java
     javac one/digitalinnovation/gof/Main.java
     java one.digitalinnovation.gof.Main
     ```

## Autor

Eduardo dos Reis Souza  
[GitHub: EduardoReis2020](https://github.com/EduardoReis2020)
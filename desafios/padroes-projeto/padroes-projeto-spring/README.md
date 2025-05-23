# Padrões de Projeto Spring

Este projeto foi desenvolvido como parte de um desafio de projeto do curso **Trilha Java** da plataforma [DIO](https://www.dio.me/).  
Baseado no código: [digitalinnovationone/lab-padroes-projeto-spring](https://github.com/digitalinnovationone/lab-padroes-projeto-spring)

## Descrição

O objetivo deste projeto é explorar e implementar padrões de projeto na prática com Java e Spring Framework.  
Foram aplicados os seguintes padrões:

- **Singleton**
- **Strategy/Repository**
- **Facade**

O projeto expõe uma API REST para cadastro e consulta de clientes, integrando com o serviço ViaCEP para consulta de endereços.

---

## Arquitetura

O projeto segue uma arquitetura baseada em camadas, utilizando os principais recursos do Spring Boot:

- **Controller:** Camada de exposição da API REST.
- **Service:** Camada de regras de negócio e integração com serviços externos.
- **Repository:** Camada de persistência de dados (JPA).
- **Model:** Entidades de domínio.
- **Feign Client:** Integração com API externa (ViaCEP).

---

## Organização de Diretórios

```
src/
 └── main/
     ├── java/
     │   └── com/designs/padroes_projeto_spring/
     │        ├── controller/
     │        │    └── ClienteRestController.java
     │        ├── model/
     │        │    ├── Cliente.java
     │        │    └── Endereco.java
     │        ├── repository/
     │        │    ├── ClienteRepository.java
     │        │    └── EnderecoRepository.java
     │        ├── service/
     │        │    ├── ClienteService.java
     │        │    └── ViaCepService.java
     │        └── PadroesProjetoSpringApplication.java
     └── resources/
          └── application.properties
```

---

## Descrição das Classes

- **PadroesProjetoSpringApplication.java**  
  Classe principal, responsável por iniciar a aplicação Spring Boot.

- **controller/ClienteRestController.java**  
  Exposição dos endpoints REST para operações de CRUD de clientes.

- **model/Cliente.java**  
  Entidade que representa o cliente.

- **model/Endereco.java**  
  Entidade que representa o endereço do cliente.

- **repository/ClienteRepository.java**  
  Interface JPA para operações de persistência de clientes.

- **repository/EnderecoRepository.java**  
  Interface JPA para operações de persistência de endereços.

- **service/ClienteService.java**  
  Interface que define as operações de negócio para clientes.

- **service/ViaCepService.java**  
  Feign Client para integração com a API ViaCEP, responsável por buscar dados de endereço a partir do CEP.

---

## Como clonar e executar o projeto

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/EduardoReis2020/padroes-projeto-spring.git
   cd padroes-projeto-spring
   ```

2. **Compile o projeto:**
   ```bash
   mvn clean install
   ```

3. **Execute a aplicação:**
   ```bash
   mvn spring-boot:run
   ```
   ou rode a classe `PadroesProjetoSpringApplication` pela sua IDE.

4. **Acesse a API e documentação:**
   - API: [http://localhost:8080/clientes](http://localhost:8080/clientes)
   - Swagger UI: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)  
     ou [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

---

## Autor

Eduardo dos Reis Souza  
[https://github.com/EduardoReis2020](https://github.com/EduardoReis2020)
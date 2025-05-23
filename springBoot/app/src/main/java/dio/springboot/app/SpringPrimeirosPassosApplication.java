package dio.springboot.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.google.gson.Gson;

@SpringBootApplication
public class SpringPrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPrimeirosPassosApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ConversorJson conversor) throws Exception {
		return args -> {
			String json = "{ \"cep\": \"12345678\", \"logradouro\": \"Rua Exemplo\", \"bairro\": \"Bairro Exemplo\", \"localidade\": \"Cidade Exemplo\", \"uf\": \"SP\" }";
			ViaCepResponse response = conversor.converter(json);
			System.out.println("Dados do CEP: " + response);
		};
	}

	@Bean
	public Gson gson() {
		return new Gson();
	}

}

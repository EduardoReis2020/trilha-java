package dio.primeiros_passos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {

    @Autowired
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("o resultado da soma é: " + calculadora.somar(5, 3));
        // Aqui você pode adicionar a lógica que deseja executar ao iniciar o aplicativo
    }

}

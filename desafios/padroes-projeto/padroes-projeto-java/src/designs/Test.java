package designs;

import designs.facade.Facade;
import designs.singleton.SingletonEager;
import designs.singleton.SingletonLazy;
import designs.singleton.SingletonLazyHolder;
import designs.strategy.Comportamento;
import designs.strategy.ComportamentoAgressivo;
import designs.strategy.ComportamentoDefensivo;
import designs.strategy.ComportamentoNormal;
import designs.strategy.Robo;

public class Test {
    public static void main(String[] args) {
        // Testando os Singletons
        // SingletonLazy
        SingletonLazy singletonLazy = SingletonLazy.getInstancia();
        System.out.println(singletonLazy);
        singletonLazy = SingletonLazy.getInstancia();
        System.out.println(singletonLazy);
        // SingletonEager
        SingletonEager singletonEager = SingletonEager.getInstancia();
        System.out.println(singletonEager);
        singletonEager = SingletonEager.getInstancia();
        System.out.println(singletonEager);
        // SingletonLazyHolder
        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(singletonLazyHolder);
        singletonLazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(singletonLazyHolder);

        // Testando o Strategy
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();

		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Eduardo", "449000-0000");
    }
}

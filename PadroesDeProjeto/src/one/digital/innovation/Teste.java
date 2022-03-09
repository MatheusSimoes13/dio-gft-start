package one.digital.innovation;

import one.digital.innovation.facade.Facade;
import one.digital.innovation.singleton.SingletonEager;
import one.digital.innovation.singleton.SingletonLazy;
import one.digital.innovation.singleton.SingletonLazyHolder;
import one.digital.innovation.strategy.Comportamento;
import one.digital.innovation.strategy.ComportamentoAgressivo;
import one.digital.innovation.strategy.ComportamentoDefensivo;
import one.digital.innovation.strategy.ComportamentoNormal;
import one.digital.innovation.strategy.Robo;

public class Teste {

	public static void main(String[] args) {
		
		//Testes singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		//////Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setStrategy(defensivo);
		robo.mover();
		robo.mover();
		robo.setStrategy(agressivo);
		robo.mover();
		
		//////Facade
		
		
		Facade facade = new Facade();
		facade.migrarCliente("Matheus", "11230230");
	}

}

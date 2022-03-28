package model;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class ModelGorjetaTest extends TestCase{
	
	private final ModelGorjeta modelGorjeta = new ModelGorjeta();
	
	@BeforeEach
	void init() {
		modelGorjeta.setNumeroPessoa(2);
		modelGorjeta.setValorServico(200.0);
		modelGorjeta.setPorcentagem(10.0);
	}
	
	@Test
	void calcularGorjeta() {
		assertEquals(20.0, modelGorjeta.calcularGorjeta());
	}
	
	@Test
	void calcularCadaPessoa () {
		assertEquals(110.0, modelGorjeta.calcularCadaPessoa());
	}
	
	@Test
	void calcularTotal () {
		assertEquals(220.0, modelGorjeta.calcularTotal());
	}

}

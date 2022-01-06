package api.tistech;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import api.tistech.service.TerceiroInteiroService;

public class TerceiroInteiroServiceTest {

	@Autowired
	TerceiroInteiroService terceiroInteiroService;
	
	@Before
	public void setUp() throws Exception {
		terceiroInteiroService = new TerceiroInteiroService();
	}

	@Test
	public void testZeros() {
		int a = 0, b = 0, c = 0;
		
		Assert.assertEquals(c, terceiroInteiroService.criaTerceiroInteiro(a, b));
	}
	
	@Test
	public void testApenasUmValorA() {
		int a = 5555, b = 0, c = 5555;
		
		Assert.assertEquals(c, terceiroInteiroService.criaTerceiroInteiro(a, b));
	}
	
	@Test
	public void testApenasUmValorB() {
		int a = 0, b = 5555, c = 5555;
		
		Assert.assertEquals(c, terceiroInteiroService.criaTerceiroInteiro(a, b));
	}
	
	@Test
	public void testLimite() {
		int a = 10256, b = 512, c = -1;
		
		Assert.assertEquals(c, terceiroInteiroService.criaTerceiroInteiro(a, b));
	}
	
	@Test
	public void testExeploExercicio() {
		int a = 10256, b = 5, c = 150256;
		
		Assert.assertEquals(c, terceiroInteiroService.criaTerceiroInteiro(a, b));
	}
	
}

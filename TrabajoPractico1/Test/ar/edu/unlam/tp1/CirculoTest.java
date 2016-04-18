package ar.edu.unlam.tp1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CirculoTest {

	
	
	@Test
	public void crearUnCirculoConRadio2() 
	{
		Circulo CirculoRadio2 = new Circulo(2);
		assertEquals(2,CirculoRadio2.getRadio(),0.01);

	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		
		Circulo CirculoRadio3Punto7 = new Circulo(3.7);
		assertEquals(3.7,CirculoRadio3Punto7.getRadio(),0.01);

	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		
		Circulo CirculoRadio5 = new Circulo(5);
		assertEquals(5.0,CirculoRadio5.getRadio(),0.01);
		
	
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		
		Circulo CirculoRadio10Punto9 = new Circulo(10.9);
		assertEquals(10.9,CirculoRadio10Punto9.getRadio(),0.01);
		
	
	}
	
	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es615Punto73() {
	
		Circulo perimetroDelCirculo1 =new Circulo(9.8);
		assertNotEquals (615.63,perimetroDelCirculo1.perimetro());
		
	}
	
	@Test
	public void crearUnCirculoConRadio16Punto6Es865Punto67() {
		Circulo perimetroCirculo2 = new Circulo(16.6);
		assertNotEquals(865.67,perimetroCirculo2.perimetro());
	}
}
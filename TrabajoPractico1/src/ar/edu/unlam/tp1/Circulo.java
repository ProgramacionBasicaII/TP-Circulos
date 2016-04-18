package ar.edu.unlam.tp1;

public class Circulo {
	
	final double pi= Math.PI;
	
	private double radio;
	
	
	public Circulo(double radio)
	{
		this.radio= radio;
	}
	
	
	public double getRadio()
	{
		return this.radio;
		
	}

	public double perimetro()
	{
		return 2*this.pi*this.radio;
	}
	
	
	
	
}

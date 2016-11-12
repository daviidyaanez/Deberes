package Punto;

public class Circulo {
	private Punto centro;
	private double radio;
	
	public Circulo(Punto p, double r)
	{
		centro= p;
		radio= r;
	}
	
	public Circulo()
	{
		centro= new Punto();
		radio=10;	
	}
	
	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	@Override
	public String toString()
	{
		return "Centro:" +centro +"," + " Radio:" +radio;
	}
	
	
	
	
}

package Punto;

public class Cuadrado {

	
	private Punto pto1,pto2,pto3,pto4;

	public Cuadrado() {
		super();
		
		this.pto1 = new Punto();
		this.pto2 = new Punto(1,0);
		this.pto3 = new Punto(1,1);
		this.pto4 = new Punto(0,1);
	}

	public Cuadrado(Punto pto1, Punto pto2, Punto pto3, Punto pto4) {
		super();
		this.pto1 = pto1;
		this.pto2 = pto2;
		this.pto3 = pto3;
		this.pto4 = pto4;
	}

	public Punto getPto1() {
		return pto1;
	}

	public void setPto1(Punto pto1) {
		this.pto1 = pto1;
	}

	public Punto getPto2() {
		return pto2;
	}

	public void setPto2(Punto pto2) {
		this.pto2 = pto2;
	}

	public Punto getPto3() {
		return pto3;
	}

	public void setPto3(Punto pto3) {
		this.pto3 = pto3;
	}

	public Punto getPto4() {
		return pto4;
	}

	public void setPto4(Punto pto4) {
		this.pto4 = pto4;
	}

	@Override
	public String toString() {
		return "[" + pto1 + "," + pto2 + "," + pto3
				+ "," + pto4 + "]";
	}
		
}

package Punto;

public class Linea {
	private Punto pto1,pto2;

	public Linea(Punto pto1, Punto pto2) {
		super();
		this.pto1 = pto1;
		this.pto2 = pto2;
	}

	public Linea() {
		super();
		
		this.pto1 = new Punto();
		this.pto2 = new Punto(1, 0);
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

	@Override
	public String toString() {
		return "[" + pto1 + "," + pto2 + "]";
	}
	
	
}

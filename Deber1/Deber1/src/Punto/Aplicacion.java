package Punto;

public class Aplicacion {

public static void main(String args[]){
		
		Punto p = new Punto();
		Circulo cir = new Circulo();
		Linea lin = new Linea();
		Cuadrado cuad = new Cuadrado();
	
		
		p.setX(3);
		p.setY(2);
		
		cir.setCentro(new Punto(3,2));
		cir.setRadio( 10);
		
		cuad.setPto1(new Punto(2,1));
		cuad.setPto2(new Punto(2,7));
		cuad.setPto3(new Punto(8,7));
		cuad.setPto4(new Punto(8,1));
		
		
		System.out.println("Punto: "+p);
		System.out.println("Circulo: "+cir);
		System.out.println("Linea: "+lin);
		System.out.println("Cuadrado: "+cuad);
	
		
	}
	
	
	
	
}

package Punto;

public class Aplicacion {

public static void main(String args[]){
		
		Punto p = new Punto();
		Circulo cir = new Circulo();
		Linea lin = new Linea();
		Cuadrado cuad = new Cuadrado();
	//	Triangulo tri= new Triangulo();
	//	Rectangulo rec= new Rectangulo();
		
		p.setX(3);
		p.setY(2);
		
		cir.setCentro(new Punto(3,2));
		cir.setRadio( 10);
		
		cuad.setPto1(new Punto(2,1));
		cuad.setPto2(new Punto(2,7));
		cuad.setPto3(new Punto(8,7));
		cuad.setPto4(new Punto(8,1));
		
		/*tri.setPto1(new Punto(6,1));
		tri.setPto2(new Punto(10,1));
		tri.setPto3(new Punto(8,5));
		
		rec.setPto1(new Punto(1,0));
		rec.setPto2(new Punto(4,0));
		rec.setPto3(new Punto(1,3));
		rec.setPto4(new Punto(4,3));*/
		
		
		System.out.println("Punto: "+p);
		System.out.println("Circulo: "+cir);
		System.out.println("Linea: "+lin);
		System.out.println("Cuadrado: "+cuad);
	//	System.out.println("Triangulo: "+tri);
	//	System.out.println("Rectangulo: "+rec);
		
	}
	
	
	
	
}

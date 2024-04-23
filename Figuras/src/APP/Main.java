package APP;

import APP.Circulo;
import APP.Rectangulo;
import APP.Triangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dos rectangulos
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo(2,3);
		//Un circulo	
		Circulo c1= new Circulo (3);
		//Un triangulo
		Triangulo t1=new Triangulo(5,5);
		
		//calculo de areas de rectangulo
		double area1=r1.area();
		double perimetro2=r2.perimetro();
		
		//calculo de area de circulo
		double radio3=c1.getArea();
		
		//calculo de area de tirangulo
		double triangulo4=t1.area();
		
		System.out.println("El area del rectangulo 1 es "+area1);
		System.out.println("El perimetro del rectangulo 2 es "+perimetro2);
		System.out.println("El area del circulo es "+radio3);
		System.out.println("El area del triangulo es "+triangulo4);
	}

}
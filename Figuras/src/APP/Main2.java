package APP;

public class Main2 {

	public static void main(String[] args) {
		// TRIANGULO
		
				//Crear un tirnagulo de base 1 y altura 2
				Triangulo t1 = new Triangulo (1,2);
				//Calcular Area
				double areaTriangulo=t1.area();
				//Mostrar
				System.out.println(areaTriangulo);
				//Cambiar su base de 1 a 2
				t1.setBase(2);
				//Calcular Area
				areaTriangulo=t1.area();
				//Mostrarla
				System.out.println(areaTriangulo);
				
				// CIRCULO
				//Crear un circulo de radio 2
				Circulo c1=new Circulo (2);
				//Calcular Area
				double areaCirculo = c1.getArea();
				//Cambiar su Radio valor 3
				c1.setRadio(3);
				//Calcular su perimetro
				double perimetroCirculo =c1.getArea();
				//Mostrarlo
				System.out.println(perimetroCirculo);
				
			}

		}

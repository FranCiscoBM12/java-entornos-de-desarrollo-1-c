package util;

public class Algoritmos {
	/**
	 * Devuelve el sumatorio del numero especificado
	 * 
	 * @param numero  	el numero del que queremos calcular la sumatoria
	 * @return  		el sumatorio del numero especificado
	 */
	public static int sumatorio (int numero){
		if(numero < 0 ) {
			throw new IllegalArgumentException("El número debe ser igual o superior a 0");
		}
		int suma=0;
		
		for (int i = 1; i <= numero; i++){
			suma=suma+i;
			
		}
		
		return suma;
		
	}
	/**
	 * Devuelve el factorial del numero especificado
	 * 
	 * @param numero  	el numero del que queremos calcular el factorial
	 * @return  		el factorial del numero especificado
	 */
	public static int factorial (int numero){
		int fact=1;
		
		for (int i = 1; i <= numero; i++){
			fact=fact*i;
			
		}
		
		return fact;
		
	}

}

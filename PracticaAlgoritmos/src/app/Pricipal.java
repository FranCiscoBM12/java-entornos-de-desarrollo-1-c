package app;
import util.Algoritmos;
import java.util.Random;

public class Pricipal {

	public static void main(String[] args) {
		Random random = new Random();
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10) + 1;
        }

        System.out.println("Array de números aleatorios:");
        for (int num : numeros) {
        }
		
        int[] resultadoFibonacci = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            resultadoFibonacci[i] = Algoritmos.fibonacci(numeros[i]);
        }

        System.out.println("Array de números de Fibonacci:");
        for (int num : resultadoFibonacci) {
        }
        
        int[] resultadoFactorial = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            resultadoFactorial[i] = Algoritmos.factorial(numeros[i]);
        }

        System.out.println("Array de números factorial:");
        for (int num : resultadoFactorial) {

        }
        
        boolean[] resultadoPrimos = new boolean[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            resultadoPrimos[i] = Algoritmos.esPrimo(numeros[i]);
        }

        System.out.println("Array de resultados de números primos:");
        for (boolean esPrimo : resultadoPrimos) {
        }
	
	}

}

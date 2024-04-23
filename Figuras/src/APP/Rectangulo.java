package APP;

import java.util.*;

/**
 * @author Medac Tarde
 * 
 * Clase Rectangulo .Permite crar rectangulos y calcular su area y perimetro
 */
public class Rectangulo extends Figura {
	 private int base;
	 private int altura;
	    
	/**
	 * Constructor por defecto . Crea un rectangulo con base y altura 1, en metros
	 */
    public Rectangulo() {
    	this.base=1;
    	this.altura=1;
    }
   

    /**
     * Constructor que crea un rectangulo con la base y la altura especificadas, en metros
     * 
     * @param base		la base del rectangulo, en metors
     * @param altura		la altura del rectangulo, en metros
     */
    public Rectangulo(int Base, int Altura) {
        // TODO implement here
    	this.base=1;
    	this.altura=1;
    }
    
    private int getBase() {
        // TODO implement here
        return this.base;
    }

    
    public void setBase(int Base) {
        // TODO implement here
    	this.base=base;
    }

    
    public int getAltura() {
        // TODO implement here
        return this.altura;
    }

    
    public void setAltura(int Altura) {
        // TODO implement here
    	this.altura=altura;
    }
    
    /**
     * @see APP.Figura#area
     */
	@Override
	public double area() {
		return this.base * this.altura;
	}
	
	/**
	 * @see APP.Figura#perimetro
	 */
	@Override
	public double perimetro() {
		return 2*base + 2*altura;
	}
    
}
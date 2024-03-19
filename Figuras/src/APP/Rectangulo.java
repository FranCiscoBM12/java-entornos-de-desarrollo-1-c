package APP;

import java.util.*;

/**
 * 
 */
public class Rectangulo {

    /**
     * Default constructor
     */
    public Rectangulo() {
    }

    /**
     * 
     */
    private int base;

    /**
     * 
     */
    private int altura;

    /**
     * @return
     */
    public void Rectangulo(int Base, int Altura) {
        // TODO implement here
    }
    
    private int getBase() {
        // TODO implement here
        return this.base;
    }

    /**
     * @param Base
     */
    public void setBase(int Base) {
        // TODO implement here
    	this.base=base;
    }

    /**
     * @return
     */
    
    public int getAltura() {
        // TODO implement here
        return this.altura;
    }

    /**
     * @param Altura
     */
    public void setAltura(int Altura) {
        // TODO implement here
    	this.altura=altura;
    }

    /**
     * @param Base 
     * @param Altura
     */
    

    /**
     * @return
     */
    public int getArea() {
        // TODO implement here
        return this.altura * this.base;
    }
    
    public int getPerimetro() {
    	return 0;
    }
    
    
}
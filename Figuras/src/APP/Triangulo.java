package APP;


import java.util.*;

/**
 * 
 */
public class Triangulo extends Figura {

    /**
     * Default constructor
     * @param j 
     * @param i 
     */
    public Triangulo(int i, int j) {
    }

    /**
     * 
     */
    public int base;

    /**
     * 
     */
    public int altura;

    /**
     * @return
     */
    

    /**
     * @param Base 
     * @param Altura
     */
    public void Triangulo(int Base, int Altura) {
        // TODO implement here
    	this.altura=1;
    	this.base=1;
    }

    /**
     * @return
     */
    public int getBase() {
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

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.base*this.altura;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
    
   
}
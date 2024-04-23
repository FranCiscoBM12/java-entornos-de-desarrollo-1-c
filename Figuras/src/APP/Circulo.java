package APP;


import java.util.*;

/**
 * 
 */
public class Circulo {

    /**
     * Default constructor
     * @param i 
     */
    public Circulo(int i) {
    }

    /**
     * 
     */
    public int radio;

    /**
     * @param radio
     */
    public void circulo(int radio) {
        // TODO implement here
    	this.radio=1;
    }

    /**
     * @return
     */
    public int getRadio() {
        // TODO implement here
        return this.radio;
    }

    /**
     * @param radio
     */
    public void setRadio(int radio) {
        // TODO implement here
    	this.radio=radio;
    }

    /**
     * @return
     */
    public double getArea() {
        // TODO implement here
        return 2*(Math.PI*radio);
    }

    /**
     * @return
     */
    
}
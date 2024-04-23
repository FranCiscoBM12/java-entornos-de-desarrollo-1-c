package Models;

public class Person {
    private String nombre;
    private String apellidos;
    private int Edad;
    
    public Person(String nombre, String apellidos, int Edad) {
    	if(Edad <0 || Edad > 130) {
        	throw new IllegalArgumentException("La edad no puede ser menor que 0 o mayor a 130");
        }
    	this.nombre= nombre;
    	this.apellidos= apellidos;
    	this.Edad= Edad;
    }
    /**
     * @return Devuelve el nombre
     */
    public String getNombre() {
        // TODO implement here
        return nombre;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
    	this.nombre= nombre;
    }

    /**
     * @return Devuelve el apellido
     */
    public String getApellidos() {
        // TODO implement here
        return apellidos;
    }

    /**
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
    	this.apellidos= apellidos;
    }

    /**
     * @return Devuelve la edad
     */
    public int getEdad() {
        
        return Edad;
    }

    /**
     * @param Edad
     */
    public void setEdad(int Edad) {
    	this.Edad= Edad;
    }
    
    /**
     * 	Devuelve si la persona es menor, mayor de edad o jubilado
     * @return		si la persona es menor,mayor de edad o jubilado
     */
    public String MostrarEdad() {
    	String frase = "";
    	if(Edad<18) {
    		frase = "Menor de edad";
    	}
    	else if(Edad>=18 || Edad <65) {
    		frase = "Mayor de edad";
    	}
    	else if (Edad >=65){
    		frase = "Jubilado";
    	}
    	return frase;
    }
    
}

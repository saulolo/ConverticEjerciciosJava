
package Cine;

/* @author: Saulolo */
public class Crispetas {
    
    //Atributos
    private int tamano;

    
    //Constructor
    public Crispetas(int tamano) {
        this.tamano = tamano;
    }
    
    
    //getter and setter
    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    
        //metodos
    public double precio(){
        if (tamano == 1) {
            return 4000;
        }
        if (tamano == 2) {
            return 5000;
        }
        return 7000;
    }

}

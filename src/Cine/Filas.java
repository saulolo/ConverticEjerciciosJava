
package Cine;

/* @author: Saulolo */
public class Filas {
    
    private int fila;
    
    
    //Constructor
    public Filas(int fila) {
        this.fila = fila;
    }
    
    //getter and setter
    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    //metodos
    public double precio(){
        if (fila >= 1 && fila <= 2) {
            return 10000;
        }
        if (fila >= 3 && fila <= 5) {
            return 20000;
        }
        return 18000;
    }
    
}

package cinema;

/* @author: Saulolo */
public class Asiento {

    private int numero;
    private char letra;
    private boolean disponible;
    private int precio;

    //Constructor
    public Asiento(int numero, char letra, int precio) {
        this.numero = numero;
        this.letra = letra;
        this.disponible = true;
        this.precio = precio;
    }

    public String getNombre() {
        return String.valueOf(letra) + numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}

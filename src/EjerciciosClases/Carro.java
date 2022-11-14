
package EjerciciosClases;

/*@author Saulolo*/
public class Carro {
    
    // Atributos
    String color;
    String marca;
    int numeroPuertas; // siempre con los atributos con minuscula
    Integer numeroPuesto;
    String modelo;
    boolean encendido;

    // Metodos
    int acelerar(int km) {
        return km * 2;
    }
    void arrancar(boolean estadoArranque) {  // void es porque no devuelve nada
        encendido = estadoArranque;
    }
    void  imprimirObjeto(){
        System.out.println(toString());
    }
    

    @Override
    public String toString() {
        return "Carro{" + "color=" + color + 
                ", marca=" + marca + 
                ", numeroPuertas=" + numeroPuertas + 
                ", numeroPuesto=" + numeroPuesto + 
                ", modelo=" + modelo + ", "
                + "encendido=" + encendido + '}';
    }
    
    
}

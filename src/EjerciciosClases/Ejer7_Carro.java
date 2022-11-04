
package EjerciciosClases;

/*@author Saulolo*/
public class Ejer7_Carro {
    
    // Caracteristicas
    
    String color;
    String marca;
    int numeroPuertas; // siempre con los atributos con minuscula
    String modelo;
    boolean encendido;

    // Metodo
    int acelerar(int km) {
        return km * 2;
    }

    void arrancar(boolean estadoArranque) {  // void es porque no devuelve nada
        encendido = estadoArranque;
    }
}

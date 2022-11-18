package Herencia;

/*@author Saulolo*/

public class Animal {
    
    //Atributos
    private String especie;
    private String Genero;
    private int numeroPatas;
    private String tamanio;

    //Constructores
    public Animal(String especie, String Genero, int numeroPatas, String tamanio) {
        this.especie = especie;
        this.Genero = Genero;;
        this.numeroPatas = numeroPatas;
        this.tamanio = tamanio;
    }
    
    //Metodos
    public void comunicacion(){
        System.out.println("comunicandose");
    }
    public void desplazamiento(){
        System.out.println("comunicandose");
    }

    
    
    
    
    
    
    
    

}

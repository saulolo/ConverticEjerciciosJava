
package EjerciciosClases;

/*@author Saulolo*/
public class Carro {
    
    // Atributos
    private String color;
    private String marca;
    private int numeroPuertas; // siempre con los atributos con minuscula
    private Integer numeroPuesto;
    private String modelo;
    private boolean encendido;
    
    public Carro() {
        
    }
    

    public Carro(String color) {
        this.color = color;
    }
    
    
    
    

    public Carro(String color, String marca, int numeroPuertas) {
        this.color = color;
        this.marca = marca;
        this.numeroPuertas = numeroPuertas;
    }

    public Carro(String color, String marca, int numeroPuertas, Integer numeroPuesto, String modelo, boolean encendido) {
        this.color = color;
        this.marca = marca;
        this.numeroPuertas = numeroPuertas;
        this.numeroPuesto = numeroPuesto;
        this.modelo = modelo;
        this.encendido = encendido;
    }
    
    
    
    
    
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public Integer getNumeroPuesto() {
        return numeroPuesto;
    }

    public void setNumeroPuesto(Integer numeroPuesto) {
        this.numeroPuesto = numeroPuesto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    
    
    

    // Metodos
    int acelerar(int km) {
        return km * 2;
    }
    public void arrancar(boolean estadoArranque) {  // void es porque no devuelve nada
        encendido = estadoArranque;
    }
    public void  imprimirObjeto(){
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

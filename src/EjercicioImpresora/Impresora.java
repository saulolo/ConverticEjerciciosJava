package EjercicioImpresora;

/*@author Saulolo*/

public class Impresora {
    
    private String nombre;
    private String marca;
    private EstadoEncendido encendido;
    

    public Impresora(String nombre) {
        this.nombre = nombre;
        this.encendido = new Apagadoanalogo();
    }

    public Impresora(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
        this.encendido = new Apagadodigital();
    }
    
    public EstadoEncendido encender(){
        return encendido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public EstadoEncendido getEncendido() {
        return encendido;
    }

    public void setEncendido(EstadoEncendido encendido) {
        this.encendido = encendido;
    }
    
    

}

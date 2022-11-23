package cinema;



/* @author: Saulolo */
public class Crispetas2 {

    private String tamanio;
    private String cantidad;
    private float precio;

    public Crispetas2(String tamanio) {
        this.tamanio = tamanio;
        totalCrispetas();
    }

    public float totalCrispetas() {
        // G,G,P,M
        String[] size = tamanio.split(",");
        float totalCrispetas = 0;

        for (int i = 0; i < size.length; i++) {
            String each = size[i];
            precio = each.equals("G") ? 8000 : each.equals("M") ? 4000 : 2000;
            if (each.equals("G")) {
                totalCrispetas += precio;
                
            } else if (each.equals("M")) {
                totalCrispetas += precio;
            } else {
                totalCrispetas += precio;
            }
        }
        return totalCrispetas;
    }

    /**
     * @return String return the tamanio
     */
    public String getTamanio() {
        return tamanio;
    }

    /**
     * @param tamanio the tamanio to set
     */
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    /**
     * @return String return the cantidad
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return float return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

}

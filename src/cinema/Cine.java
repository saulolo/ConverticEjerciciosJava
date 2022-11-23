package cinema;

/* @author: Saulolo */

public class Cine {

    public static Cine cine;
    private Asiento[][] asientos;

    // Atributos Asiento(int numero, char letra, int precio)
    // Atributos Crispetas(int size, int precio)
    // Precio entrada cine
    int P1 = 10_000;
    int P2 = 20_000;
    int P3 = 18_000;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    // Constructor de cine
    public Cine() {
        asientos = new Asiento[9][9];
        generarAsientos();
    }

    private void generarAsientos() {
        for (int f = 0; f < asientos.length; f++) {
            char letra = (char) (65 + f);
            int precio = f < 2 ? P1 : f < 5 ? P2 : P3;
            for (int c = 0; c < asientos[f].length; c++) {
                asientos[f][c] = new Asiento((c + 1), letra, precio);
            }
        }
    }

    public String verAsientos() {
        String info = "";
        for (int f = 0; f < asientos.length; f++) {
            for (int c = 0; c < asientos[f].length; c++) {
                info += asientos[f][c].isDisponible() ? ANSI_GREEN : ANSI_RED;
                info += asientos[f][c].getNombre() + " ";
                info += ANSI_RESET;
            }
            info += "\n";
        }
        return info;
    }

    public boolean ventaSillas(String seleccionados)   {
        
    
        // A1,A2, ...
        String comprados = "";
        String[] sillas = seleccionados.split(",");
        for (int i = 0; i < sillas.length; i++) {
            try {
                
           
            if (reservarSilla(sillas[i])) {
                comprados += sillas[i];
            } else {
                liberar(comprados);
                 
                    return false;
                }
            } catch (SillaNoDisponible e) {
            }
        }
        return true;
    }
    
    public boolean reservarSilla(String espacio)  throws SillaNoDisponible {
            
            
        for (int f = 0; f < asientos.length; f++) {
            for (int c = 0; c < asientos[f].length; c++) {
                if (asientos[f][c].getNombre().equals(espacio)) {
                    if (asientos[f][c].isDisponible()) {
                        asientos[f][c].setDisponible(false);
                        return true;
                    } else {
                        throw new SillaNoDisponible();
                        //return false;
                    }
                }
            }
        }
        return false;
    }

    private void liberar(String comprados) {
        // A1,A2,...
        String[] sillas = comprados.split(",");
        for (int i = 0; i < sillas.length; i++) {
            liberarSilla(sillas[i]);
        }
    }

    private void liberarSilla(String silla) {
        for (int f = 0; f < asientos.length; f++) {
            for (int c = 0; c < asientos[f].length; c++) {
                if (silla.equals(asientos[f][c].getNombre())) {
                    asientos[f][c].setDisponible(true);
                }
            }
        }
    }

    public int facturaCine() {
        int totalCine = 0;
        for (int f = 0; f < asientos.length; f++) {
            for (int c = 0; c < asientos[f].length; c++) {
                if (!asientos[f][c].isDisponible()) {
                    totalCine += asientos[f][c].getPrecio();
                }
            }
        }
        return totalCine;
    }
    /*
     * public boolean tienda(int pequeña, int mediana, int grande) {
     * float total_tienda = 0;
     * 
     * float[] tem = crispetas[1].precio;
     * total_tienda = (int) (pequeña * tem[1]);
     * 
     * tem = crispetas[2].precio;
     * total_tienda = (int) (mediana * tem[2]);
     * 
     * tem1 = (int) cantidad[3];
     * tem2 = crispetas[3].precio;
     * total_tienda = (int) (tem1 * tem2[3]) + total_tienda;
     * 
     * return total_tienda;
     * }
     */

}

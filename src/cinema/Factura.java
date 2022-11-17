package cinema;

import java.text.DecimalFormat;

/* @author: Saulolo */
public class Factura {

    Cine sillasCine;
    Crispetas2 crispetas;

    public Factura(String sillas, String size) {
        sillasCine = new Cine();
        crispetas = new Crispetas2(size);
        sillasCine.ventaSillas(sillas);
        float total1 = sillasCine.facturaCine();
        float total2 = crispetas.totalCrispetas();
        float total = total1 + total2;
        DecimalFormat formatea = new DecimalFormat("###,###.#");
        System.out.println("El valor total a pagar es de:          " + formatea.format(total));
    }

}

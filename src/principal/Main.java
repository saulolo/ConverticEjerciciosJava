package principal;

import java.text.DecimalFormat;

import cinema.Cine;
import cinema.Crispetas2;
import cinema.Factura;

/* @author: Saulolo */
public class Main {

    public static void main(String[] args) {

        Cine cine = new Cine();

        String sillasSeleccionadas = "A2,A4,A3,A1";
        String tipoCrispetas = "P,G,M,M";

        cine.ventaSillas(sillasSeleccionadas);
        System.out.println(cine.verAsientos());

        DecimalFormat formatea = new DecimalFormat("###,###");

        System.out.println("---------------------------------------------------------");
        cine.ventaSillas(sillasSeleccionadas);
        System.out.println("El valor total de las entradas es de:  " + formatea.format(cine.facturaCine()));

        System.out.println("---------------------------------------------------------");

        Crispetas2 crispetas21 = new Crispetas2(tipoCrispetas);
        System.out.println("El valor total de las crispetas es de:  " + formatea.format(crispetas21.totalCrispetas()));

        System.out.println("=========================================================");

        Factura facturar = new Factura(sillasSeleccionadas, tipoCrispetas);

        System.out.println("=========================================================");

        /* System.out.println("SILLAS ADICIONALES");
         cine.ventaSillas("A1,A2,A3,A4,A5,A6,A7");
        System.out.println(cine.verAsientos());
         //cine.ventaSillas("D1,D2,D3,D4,D5,D6,D7");
         * //cine.ventaSillas("I1,I2,I3,I4,I5,I6,I7");
         * System.out.println(cine.verAsientos());
         * 
         * System.out.println(cine.factura());
         * 
         * // System.out.println(cine.tienda(1,2,3));
         * 
         * System.out.println();
         */
    }

}

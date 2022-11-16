package Cine;

import java.util.Scanner;
import org.xml.sax.SAXException;

/* @author: Saulolo */

/*Realizar un programa que permita calcular el valor total a pagar por una noche
de cine con sus amigos El valor de las entradas varía según la fila elegida para
ver la película:
- Fila 1-2: $10000
- Fila 3-5: $20000
- Fila 6-7: $18000
La crispetas cuestán:
- Pequeñas: 4000
- Medianas: 5000
- Grandes: 7000
Solo los miércoles aplica un descuento del 20% sobre las entradas y el 3% sobre 
las crispetas.*/

public class CineMain {
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el dia de cine: ");
        int dia = input.nextInt();
        
        System.out.println("Ingrese la fila del 1 - 7: ");
        int fila = input.nextInt();
        
        System.out.println("Ingrese tamaño de las crispetas: ");
        int tamano = input.nextInt();
        
        Filas objFila = new Filas(fila);
        Crispetas objCrispetas = new Crispetas(tamano);
        
        double valor = 0;
        if (dia == 3) {
            valor = (objFila.precio() * 0.80);
            valor += (objCrispetas.precio() * 0.97);
        } else {
            valor = objFila.precio();
            valor += objCrispetas.precio();
        }
        
        System.out.println("El valor a pagar es => " + valor + " $.");
        

        
        
        
    }

}

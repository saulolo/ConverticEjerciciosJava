package Ejer9_DescompNum;

import java.util.Scanner;

/* @author: Saulolo */
public class PrincipalDescom {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int numEntrada;
        
        /*Escribir un programa que permita identificar cuántas décimas, 
        centésimas y milésimas tiene un número entero ingresado por el usuario*/
        
        System.out.println("DESCOMPOSICIÓN DE UN NUMERO");
        System.out.println("---------------------------");
        
        System.out.println("Ingresa un número máximo de 4 cifras: ");
        numEntrada = input.nextInt();
        
        //Objeto
        FormulaModulo ObjModulo = new FormulaModulo();
        ObjModulo.posicion(numEntrada);
        
        System.out.println(ObjModulo.posicion(numEntrada));
        
        
    }

}

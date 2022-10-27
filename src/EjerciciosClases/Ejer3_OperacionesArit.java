package EjerciciosClases;

import java.util.Scanner;

public class Ejer3_OperacionesArit {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        /*Escriba un algoritmo, que dado dos valores A y B, encuentre: 
        [+, -, /, *, %, √, √(AB - (2/3)), (A^3 * (3/4))/(B^2 -(1/5))]
       */
        
        int num1;
        int num2;
        int operacion;
        int suma;
        int resta;
        int division;
        int multiplicacion;
        int modulo;
        double raiz;
        double divPotencia;
        
        
        System.out.println("Ingrese el número A: ");
        num1 = entrada.nextInt();
        
        System.out.println("Ingrese el número B: ");
        num2 = entrada.nextInt();
        
        System.out.println("Ingrese la operación ariemética a realizar [1.Suma |"
                + "2.Resta | 3.División | 4.Multiplicación | 5.Módulo | 6.Raíz"
                + " Cuadrada | 7.√((A*B)-(2/3)) | 8.((A^3)*(3/4))/((B^2)*(1/5))]: ");
        operacion = entrada.nextInt();
        
        switch (operacion) {
            case 1:
                suma = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + suma);
                break;
            case 2:
                resta = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resta);
                break;
            case 3:
                if (num2 == 0) {
                    System.out.println("La división por 0 no esta definida.");
                }else {
                    division = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + division);
                }
                break;
            case 4:
                multiplicacion = num1 * num2;
                System.out.println(num1 + " X " + num2 + " = " + multiplicacion);
                break;
            case 5:
                modulo = num1 % num2;
                System.out.println(num1 + " % " + num2 + " = " + modulo);
                break;
            case 6:
                raiz = Math.sqrt(num1);
                System.out.println("√" + num1 + " = " + raiz);
                break;
            case 7:
                raiz = Math.sqrt(num1*num2 - (2/3));
                System.out.println("√((A*B)-(2/3))"  + " = " + raiz);
                break;
            case 8:
                divPotencia = (Math.pow(num1, 3) * (3 / 4)) / 
                        (Math.pow(num2, 2) * (1 /5 ));
                System.out.println("((A^3)*(3/4))/((B^2)*(1/5))"  + " = " + divPotencia);
                break;
            default:
                 System.out.println("Opción no válida");
                break;
        }
        
    }
    
}

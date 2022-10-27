
package EjerciciosClases;

import java.util.Scanner;

/* @author: Saulolo */

public class Ejer4_UnionNumerosParImpar {
    
    public static void main(String[] args) {
        
        /*Construir un algoritmo que almacene una cantidad de n números pares y
        otra cantidad de números impares ingresados por el usuario. Se deben
        unir ambas cantidades de números encontrados de manera intercalada y
        mostar su resultado.*/
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("UNIÓN DE NÚMEROS PARES E IMPARES");
        System.out.println("--------------------------------");
        
        int diemnsionPares;
        int diemnsionImpares;
        
        //Arreglo Par
        System.out.println("Ingrese la dimensión del arreglo Par: ");
        diemnsionPares = input.nextInt();
        
        int pares[] = new int[diemnsionPares];
        
        System.out.println("Ingrese los números Pares a almacenar en el arreglo: ");
        
        for (int i = 0; i < diemnsionPares; i++) {
            System.out.println((i + 1) + ". Ingrese el número Par: ");
            pares[i] = input.nextInt();
        }
        System.out.println("los números Pares ingresados son: ");
        for (int i = 0; i < diemnsionPares; i++) {
            System.out.print(pares[i] + " , ");   
        }
        System.out.println(" ");
        System.out.println("===================================");
        System.out.println(" ");
        
         //Arreglo Impar
        System.out.println("Ingrese la dimensión del arreglo Impar: ");
        diemnsionImpares = input.nextInt();
        
        int impares[] = new int[diemnsionImpares];
        
        System.out.println("Ingrese los números Impares a almacenar en el arreglo: ");
        
        for (int j = 0; j < diemnsionImpares; j++) {
            System.out.println((j + 1) + ". Ingrese el número Impar: ");
            impares[j] = input.nextInt();
        }
        System.out.println("los números Impares ingresados son: ");
        for (int j = 0; j < diemnsionImpares; j++) {
            System.out.print(impares[j] + " , ");
            
        }

    }
}

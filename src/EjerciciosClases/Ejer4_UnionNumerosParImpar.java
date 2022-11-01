
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


        int j = 0;
        int k = 0;
        int l = 0;
        int npar = 2;
        int inpar = 4;
        
        //Arreglo Par
        int pares[] = new int[npar];
        
        

        System.out.println("Ingrese los números Pares a almacenar en el arreglo: ");
        //Rellenar el areglo Pares
        for (int i = 0; i < npar; i++) {
            System.out.println("Ingrese el número Par " + (i + 1) + ":");
            pares[i] = input.nextInt();
        }
        //Muestra los números almacebados en el areglo Pares
        System.out.println("los números Pares ingresados son: ");
        for (int i = 0; i < npar; i++) {
            System.out.print(pares[i] + " , ");
        }
        System.out.println(" ");
        System.out.println("=================================================");
        System.out.println(" ");

        //Arreglo Impar
        int impares[] = new int[inpar];

        System.out.println("Ingrese los números Impares a almacenar en el arreglo: ");
        //Rellenar el areglo Impares
        for (int i = 0; i < inpar; i++) {
            System.out.println("Ingrese el número Impar: " + (i + 1) + ":");
            impares[i] = input.nextInt();
        }

        //Muestra los números almacebados en el areglo Impares
        System.out.println("los números Impares ingresados son: ");
        for (int i = 0; i < inpar; i++) {
            System.out.println(impares[i] + " , ");
        }

        System.out.println(" ");
        System.out.println("=================================================");
        System.out.println(" ");

        //Union de ambos vectores
        int sumaNumeros[] = new int[npar+inpar];

        for (j = 0; j < (inpar+npar); j++) {
            if(j < npar)
            {
                sumaNumeros[k]=pares[j+l];
                k++;
            }
            if(j < inpar)
            {
                sumaNumeros[k]=impares[j+l];
                k++;
            }
        }
        
        System.out.println("La suma de los números pares e impares ingresados es: " + (k + 1) + ":");
        for (k = 0; k < (inpar+npar); k++) {
            System.out.println("Posición # "+ k+" : "+sumaNumeros[k]);
            
        }

    }
    
}

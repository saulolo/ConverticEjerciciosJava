
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
       
        
        //Arreglo Par        
        int pares[] = new int[6];
        
        System.out.println("Ingrese los números Pares a almacenar en el arreglo: ");
        //Rellenar el areglo Pares
        for (int i = 0; i < 6; i++) {
            System.out.println("Ingrese el número Par " + (i + 1) + ":");
            pares[i] = input.nextInt();
        }
        //Muestra los números almacebados en el areglo Pares
        System.out.println("los números Pares ingresados son: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(pares[i] + " , ");   
        }
        System.out.println(" ");
        System.out.println("=================================================");
        System.out.println(" ");
        
         //Arreglo Impar
        int impares[] = new int[6];
        
        System.out.println("Ingrese los números Impares a almacenar en el arreglo: ");
        //Rellenar el areglo Impares
        for (int i = 0; i < 6; i++) {
            System.out.println("Ingrese el número Par: " + (i + 1) + ":");
            impares[i] = input.nextInt();
        }
        
        //Muestra los números almacebados en el areglo Impares
        System.out.println("los números Impares ingresados son: ");
        for (int i = 0; i < 6; i++) {
            System.out.println(impares[i] + " , ");
             }
        
        System.out.println(" ");
        System.out.println("=================================================");
        System.out.println(" ");    
        
        //Union de ambos vectores   
        int sumaNumeros[] = new int[12];
        
        while (j < 6) { 
            for(l=0;l<1;l++)
            {
                sumaNumeros[k]=pares[j+l];
                k++;
            }
            for(l=0;l<1;l++)
            {
                sumaNumeros[k]=impares[j+l];
                k++;
            }
            j=j+1;
            
        }
        System.out.println("La suma de los números pares e impares ingresados es: ");
        for (k = 0; k < 12; k++) {
            System.out.println(sumaNumeros[k]);
            
            //PULIR: - pedir dimension por usuario.
            //       - Intercalar el orden del arreglo 
            
        }

    }
    
}

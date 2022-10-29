package EjerciciosClases;

import java.util.Scanner;

/*@author Saulolo*/

public class Ejer5_ContarOvejas {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        /*//Se requiere construir un programa que cuente las ovejas que está 
        soñando una persona.*/
        
        
        
        System.out.println("CONTANDO OVEJAS");
        System.out.println("---------------");
        
        int contador = -1;
        String answer;
        
        do {
            System.out.println("Sigues dormido: ");
            answer = input.next();

                contador = contador + 1;
                System.out.println("La cantidad de ovejas contadas es de: " + contador);
        } while (answer.equals("si"));       
        
    }

}

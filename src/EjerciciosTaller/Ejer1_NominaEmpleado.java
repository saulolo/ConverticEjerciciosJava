package EjerciciosTaller;

import java.util.Scanner;

public class Ejer1_NominaEmpleado {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        /*Construir un algoritmo que permite calcular el salario a pagar de un 
        empleado, a partir del valor de hora y las horas trabajadas.*/
        
        System.out.println("SALARIO EMPLEADO");
        System.out.println("----------------");

        int valorHora;
        int horaTrabajada;
        int salario;

        System.out.println("Ingrese el valor de la hora");
        valorHora = entrada.nextInt();

        System.out.println("Ingrese la cantidad de horas laboradas");
        horaTrabajada = entrada.nextInt();

        salario = valorHora * horaTrabajada;

        System.out.println("El salario a pagar es de: " + salario + " $");

    }

}

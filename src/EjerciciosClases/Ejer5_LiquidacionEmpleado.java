package EjerciciosClases;

import java.util.Scanner;

/*@author Saulolo*/

public class Ejer5_LiquidacionEmpleado {
    
    public static void main(String[] args) {
        
        /*La temporal "El Trabajo SAS" requiere generar la liquidación de los 7 
        empleados que terminan su contrato. La liquidación se compone de prima, 
        cesantías, intereses a las cesantías y vacaciones. Tener en cuenta:
        Prima: ((salario + auxilioTransporte) * diasLaborados) / 360
        Cesantías: (salario * diasLaborados) / 360 
        Intereses cesantías: (cesantías * 12%) / diasLaborados
        Vacaciones: (salario * diasLaborados) / 720
        Se debe mostrar en pantalla el valor de la liquidación y los valores de 
        cada rubro por cada empleado.
        requiere saber cuál fue el 3 empleado con mejor liquidación
        */
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("LIQUIDACION EMPLEADOS");
        System.out.println("---------------------");
        
        int salario = 0;
        final int auxilioTransporte = 117000;
        int diasLaborados = 0;
        int prima;
        int cesantias;
        double interesesCesantias;
        double vacaciones;
        String nombre;
        int mayor = 0;
        int posicion = 0;
        double liquidacion;
        
        String tamanioEmpleados;
        int tamanoLiquidacio;
        
        
        String empleados[] = new String[7];
        double liquidacionEmpledo[] = new double[7];
        
        
        for (int i = 0; i < 7; i++) {
            
            System.out.println("Ingrese el nombre del empleado # " + (i + 1) + " :");
            nombre = input.next();
            empleados[i] = nombre;
            
            System.out.println("Ingrese el salario: ");
            salario = input.nextInt();

            System.out.println("Ingrese dias laborados: ");
            diasLaborados = input.nextInt();
            
            prima = ((salario + auxilioTransporte) * diasLaborados) / 360;
            System.out.println("Prima = " + prima + " $");
            
            cesantias = (salario * diasLaborados) / 360;
            System.out.println("Cesantias: " + cesantias + " $");
            
            interesesCesantias = (cesantias * 0.12) / diasLaborados;
            System.out.println("Intereses de las Cesantias: " + interesesCesantias + " $");
            
            vacaciones = (salario * diasLaborados) / 720;
            System.out.println("Vacaciones: " + vacaciones + " $" );
            
            liquidacion = prima + cesantias + interesesCesantias + vacaciones;
            
            System.out.println("La liquidación de " + nombre + " es de " + liquidacion);
            liquidacionEmpledo[i] = liquidacion;
            
        }
        
        for (int i = 0; i < 7; i++) {
            System.out.print(empleados[i] + " , "); 
        }
        
         for (int i = 0; i < 7; i++) {
            System.out.print(liquidacionEmpledo[i] + " , "); 
        }
        
         
         
         //Metodo burbuja
         
    }

}

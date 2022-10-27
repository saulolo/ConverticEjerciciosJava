package EjerciciosClases;

public class Ejer2_NumerosConsecutivos {

    public static void main(String[] args) {

        /*Ejercicio, escribir los números consecutivamente desde 100 hasta 10000.*/
        
        System.out.println("NÚMERO CONSECUTIVOS");
        System.out.println("-------------------");
        
        
        System.out.println("MÉTODO: FOR");

        int i;

        System.out.println("Los números del 100 al 1000 son: ");
        for (i = 100; i <= 10000; i++) {
            System.out.println(i + 1);
        }
        
        
        System.out.println("                   ");
        System.out.println("===================");
        System.out.println("MÉTODO: CICLO WHILE");
        
        int j = 100;
        
        while(j < 10000){
            System.out.println(j+1);
            j++;
        }
        
        
        System.out.println("                      ");
        System.out.println("======================");
        System.out.println("MÉTODO: CICLO DO WHILE");
        
        int k = 100;
        
        do{
            System.out.println(k+1);
            k++;
        } while (k<10000);
        
    }

}

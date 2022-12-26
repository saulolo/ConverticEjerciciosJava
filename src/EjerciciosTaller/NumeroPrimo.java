package EjerciciosTaller;

/* @author: Saulolo */

public class NumeroPrimo {
    
    public static void main(String[] args) {
        
        int  cont = 0;
        int numero = 3;
        
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                cont = cont + 1;
            }
        }
        if (cont != 2) {
             System.out.println("Numero no es primo"); 
        }else{
            System.out.println("Es numero no es primo");
        
        }
    }

}

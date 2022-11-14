package EjerciciosClases;

import java.util.Scanner;

public class Ejer1_Traductor {
    
    public static void main(String[] args) {
        
        /*Crear un programa que permita traducir de ingles a español y de
        español a ingles el nombre de los siguientes colores: Amarillo, Azul,
        Rojo, Verde, Naranjado, Morado, Rosado. Solo para los colores Rojo y 
        Morado el usuario debe de identificar cual es la traducción correcta
        a portugues: Rojo (Rosso, Rouge, [Vermelho], Rojo), Morado (Dimorare,
        Demeurer, [Roxal], Morado). Las opciones encerradas en "[]" son las
        correctas.*/
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("TRADUCTOR");
        System.out.println("---------");
        
        int idioma;
        String color;
        int traduccion;
        
        System.out.println("Ingrese el idioma a traducir, [1.Ingles | 2.Español"
                + "| 3.Portugues]: ");
        idioma = entrada.nextInt();
        

        switch (idioma) {
            case 1:
                System.out.println("Ingrese el color a traducir [amarillo, azul,"
                        + " rojo, verde, naranjado, morado o rosado]: ");
                 color = entrada.next();
                switch (color) {
                    case "amarillo":
                        System.out.println("yellow");
                        break;
                    case "azul":
                        System.out.println("blue");
                        break;
                    case "rojo":
                        System.out.println("red");
                        break;
                    case "verde":
                        System.out.println("green");
                        break;
                    case "naranjado":
                        System.out.println("orange");
                        break;
                    case "morado":
                        System.out.println("purple");
                        break;
                    case "rosado":
                        System.out.println("pimk");
                        break;
                    default:
                        System.out.println("Opción no válida, ingrese de nuevo "
                            + "el color");
                        break;
                }
                break;  
            case 2:
                System.out.println("Enter the color to translate [yellow, blue, red,"
                + "green, orange, purple or pimk]: ");
                color = entrada.next();
                switch (color) {
                    case "yellow":
                        System.out.println("amarillo");
                        break;
                    case "blue":
                        System.out.println("azul");
                        break;
                    case "red":
                        System.out.println("rojo");
                        break;
                    case "green":
                        System.out.println("verde");
                        break;
                    case "orange":
                        System.out.println("naranjado");
                        break;
                    case "purple":
                        System.out.println("morado");
                        break;
                    case "pimk":
                        System.out.println("rosado");
                        break;
                    default:
                        System.out.println("Invalid option, please re-enter "
                            + "the color");
                        break;
                }
                break;
            case 3:
                System.out.println("Ingrese el color a traducir [rojo o morado] "
                + "y dentro de las opciones desplegadas, elija la correcta ");
                color = entrada.next();
                switch (color) {
                    case "rojo":
                        System.out.println("Ingrese la traducción correcta"
                                + "[1.Rosso | 2.Rouge | 3.Vermelho | 4.Rojo]: ");
                        traduccion = entrada.nextInt();
                        
                        if (traduccion == 3) {
                            System.out.println("¡¡FELICITACIONES!! Opción correcta");
                        }
                        else {
                            System.out.println("¡¡FALLASTE!!, Opción incorrecta");}
                        
                        break;
                    case "morado":
                        System.out.println("Ingrese la traducción correcta"
                                + "[1.Dimorare | 2.Demeurer | 3.Roxal | 4.Morado]: ");
                        traduccion = entrada.nextInt();
                        
                        if (traduccion == 3) {
                            System.out.println("¡¡FELICITACIONES!! Opción correcta");
                        }
                        else {
                            System.out.println("¡¡FALLASTE!!, Opción incorrecta");}
                        break;
                    default:
                        System.out.println("Opción no válida, ingrese de nuevo "
                            + "el color");
                        break;
                }
            default:
                System.out.println("Opção inválida, digite novamente o idioma");
                break;
                
        }
    }
    
}

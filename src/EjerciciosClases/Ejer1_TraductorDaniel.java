package EjerciciosClases;

import java.util.Scanner;

public class Ejer1_TraductorDaniel {
    
    public static void main(String[] args) {
        
        String color;
        int idioma;


        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);

        System.out.println("Ingrese el idioma que desea ver la traducción: 1. Español e Ingles 2. Portugues"  );
        idioma = entrada.nextInt();

        System.out.println("Ingrese el color: "  );
        color = entrada1.next();


        if (idioma == 1){
            switch (color){

                case "Amarillo":
                    System.out.println("Yellow");
                    break;
                case "Yellow":
                    System.out.println("Amarillo");
                    break;


                case "Azul":
                    System.out.println("Blue");
                    break;
                case "BLue":
                    System.out.println("Azul");
                    break;


                case "Rojo":
                    System.out.println("Red");
                    break;
                case "Red":
                    System.out.println("Rojo");
                    break;


                case "Verde":
                    System.out.println("Green");
                    break;
                case "Green":
                    System.out.println("Verde");
                    break;


                case "Morado":
                    System.out.println("Violet");
                    break;
                case "Violet":
                System.out.println("Morado");
                break;


                case "Rosa":
                    System.out.println("Pink");
                    break;
                case "Pink":
                    System.out.println("Rosa");
                    break;


                default:
                    System.out.println("Opción no valida");
                    break;

            }

        } else {

            switch (color){

                    case "Rojo":
                    case "Red":
                        System.out.println("1.Rosso , 2.Rouge , 3.Vermeloh ");
                        idioma = entrada.nextInt();

                    if (idioma == 3){
                        System.out.println("La respuesta es correcta: Vermeloh " );
                    }

                    else {
                        System.out.println("La respuesta es incorrecta " );
                    }
                        break;


                    case "Morado":
                    case "Violet":
                        System.out.println("1. Dimorare , 2.Demeurer , 3.Roxa ");
                        idioma = entrada.nextInt();

                        if (idioma == 3){
                            System.out.println("La respuesta es correcta: Roxa " );
                        }

                        else {
                            System.out.println("La respuesta es incorrecta " );
                        }
                        break;

            }
        }
    }
}
        
        
        
    
    


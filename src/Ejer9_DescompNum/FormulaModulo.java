package Ejer9_DescompNum;

/* @author: Saulolo */

public class FormulaModulo {
    
    //Atributos
    int uni;
    int dec;
    int cen;
    int mil;
    
    //Metodo
    public String posicion(int numIngresado){
        uni = numIngresado % 10;
        numIngresado = numIngresado / 10;
        dec = numIngresado % 10;
        numIngresado = numIngresado / 10;
        cen = numIngresado % 10;
        mil = numIngresado / 10;
        
        return "Unidades: " + uni + " Decenas: " + dec + " Centenas: " + cen + 
                " Unidades de mil: " + mil; 

    }

}

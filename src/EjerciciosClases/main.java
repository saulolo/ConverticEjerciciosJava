package EjerciciosClases;

/*@author Saulolo*/

public class main {
    
    public static void main(String[] args) {
        Integer algo = 0;
        Integer algo2 = 3;
        int otroValor = algo;
        Integer sum  = Integer.sum(algo2,algo);
       
        Carro carro1 = new Carro();
        carro1.color = "Negro";
        Carro carro2 = new Carro();
        carro2.color = "Blanco";
        
        
        carro2.color.length();
       
        
        char[] chars = carro2.color.toCharArray();
        
        
        carro2.arrancar(true);
         
        carro1.imprimirObjeto();
        carro2.imprimirObjeto();
        System.out.println();
        
        CreadorCarros creador = new CreadorCarros();
        Carro carro = creador.construirCarro();
        System.out.println(carro);

        
        
        


    }
}
        

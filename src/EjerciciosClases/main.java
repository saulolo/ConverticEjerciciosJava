package EjerciciosClases;

/*@author Saulolo*/

public class main {
    
    public static void main(String[] args) {
        Integer algo = 0;
        Integer algo2 = 3;
        int otroValor = algo;
        Integer sum  = Integer.sum(algo2,algo);
        Carro carro3 = new Carro();
        Carro carro1 = new Carro("Negro");
        Carro carro2 = new Carro("Blanco");
        carro2.arrancar(true);
        Carro carro4 = new Carro("Verde");
        Carro carro5 = new Carro("Azul" + "Mazda" + 5);
        
        carro1.imprimirObjeto();
        carro2.imprimirObjeto();
        System.out.println();
        
        
        CreadorCarros creador = new CreadorCarros();
        Carro carro = creador.construirCarro();
        System.out.println(carro);

    }
}
        

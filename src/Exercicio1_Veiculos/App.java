package Exercicio1_Veiculos;

public class App{
    public static void main(String args[]){
        Placa p1 = new Placa("Brasil","ABC1R23");
        
        Veiculo v = new Veiculo(p1);
        Veiculo v2 = new Veiculo(p1);
        v2.setPais("Brasil");

        System.out.println(v.toString());
        System.out.println("-------------------------------------------------------------------");
        System.out.println(v2.toString());

        // System.out.println("Dados do veiculo antes de abastecer:");
        // System.out.println(v);
        // System.out.println("----------------");

        // v.abastece(65);
        // System.out.println("Dados do veiculo depois de abastecer:");
        // System.out.println(v);
        // System.out.println("----------------");

        // v.dirige(250);
        // System.out.println("Dados do veiculo depois de percorrer 250Km:");
        // System.out.println(v);
        // System.out.println("----------------");
         }
}
package Exercicio1_Veiculos;

import java.util.Scanner;

public class App{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Placa p[]  = new Placa[5];
        Boolean stats = true;
        p[0] = new Placa("Brasil","ABC1R23");
        p[1] = new Placa("Argentina","DEF1R24");
        p[2] = new Placa("Alemanha","GHI1R25");
        p[3] = new Placa("Portugal","JKL1R26");
        p[4] = new Placa("Chile","MNO1R27");
        
        Veiculo v [] =  new Veiculo[5];
        v[0] = new Veiculo(p[0]);
        v[1] = new Veiculo(p[1]);
        v[2] = new Veiculo(p[2]);
        v[3] = new Veiculo(p[3]);
        v[4] = new Veiculo(p[4]);

        String placa = "";
        
        System.out.println("Selecione uma opção: \n1)Abastecer\n2)Dirigir\n3)Fim");
        int option = Integer.parseInt(in.nextLine());

        switch(option){

            case 1 : 
            System.out.println("Digite a placa do veículo:");
            placa = in.nextLine();
            System.out.println("Quantidade em litros a ser abastecida: ");
            double litros = in.nextDouble();
            for(int i = 0; i<v.length;i++){
                if(placa.equals(v[i].getPlaca().getCodigo())){
                    v[i].abastece(litros);
                    System.out.println(v[i].toString());
                    stats = false;
                }
                else if((i==v.length-1)&&stats) System.out.println("Veículo não encontrado.");
            }
            break;

            case 2:
            System.out.println("Digite a placa do veículo que irá dirigir: ");
            placa = in.nextLine();
            System.out.println("Distancia a ser percorrida: ");
            double distancia = in.nextDouble();
            for(int i = 0; i<v.length;i++){
                if(placa.equals(v[i].getPlaca().getCodigo())){
                    v[i].dirige(distancia);
                    System.out.println(v[i].toString());
                    stats = false;
                }
                else if((i==v.length-1)&&stats) System.out.println("Veículo não encontrado.");
            }
            break;

            case 3:
            for(int i = 0; i<v.length;i++){

                System.out.println(v[i].toString());

            }
            break;

        }

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
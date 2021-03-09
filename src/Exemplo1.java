import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = in.nextLine();
        System.out.println("Digite sua matrícula: ");
        int matricula = in.nextInt();
        System.out.println("Ola " + nome + ".");

        Aluno aluno = new Aluno(nome, matricula);
        System.out.println(aluno.toString());

    }
}

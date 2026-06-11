import java.util.Scanner;

public class nomesobrenome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int idade = input.nextInt();
        System.out.println("Informe seu nome: ");
        input.nextLine();
        String nome = input.nextLine();
        System.out.println("Informe seu sobrenome; ");
        String sobrenome = input.nextLine();
        String nome_sobre = nome + " " + sobrenome;
        System.out.println("Seu nome e sobrenome é: " + nome_sobre);


    }
}

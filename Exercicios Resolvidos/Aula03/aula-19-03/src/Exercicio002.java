import java.util.Scanner;
// Exercício 02 - Faça um programa para obter do usuário a quantidade de canetas em estoque e a quantidade de canetas vendidas no dia,
//ao final do dia o programa deverá informar quantas canetas realmente temos em estoque.
public class Exercicio002 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a Quantidade De Canetas em Estoque: ");
        int canetas = leitor.nextInt();
        System.out.println("Informe a Quantidade De Canetas Vendidas");
        int vendas = leitor.nextInt();
        int estoque = canetas-vendas;
        System.out.println("Ao Final Do Dia, Seu Estoque é: " + estoque + " Canetas");


    }
}

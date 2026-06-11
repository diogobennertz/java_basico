import java.util.Scanner;
//Exercício 10 – Faça um programa que calcule a comissão de um vendedor sobre uma
//venda, considerando a taxa de comissão fornecida pelo usuário.
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o Valor da Venda: ");
        Double venda = leitor.nextDouble();
        System.out.println("Informe a Porcentagem de Comissão");
        Double comissao = leitor.nextDouble();
        Double salarioFinal = (venda * (comissao/100));
        System.out.println("A comissão é : " + salarioFinal );

        leitor.close();
    }
}

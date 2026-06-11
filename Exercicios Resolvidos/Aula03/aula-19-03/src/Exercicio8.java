import java.util.Scanner;
//Exercício 08 – Faça um programa para ler o valor de um modelo de carro vendido, a
//quantidade total vendida e informe ao usuário o valor final das vendas.
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o Valor Do Carro: ");
        Double carro = leitor.nextDouble();
        System.out.println("Informe a Quantidade de Veiculos Vendidos");
        Double quantidade = leitor.nextDouble();
        Double valor = carro * quantidade;
        System.out.println("O valor vendido é : " + valor );

        leitor.close();
    }
}

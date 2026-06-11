import java.util.Scanner;
//1. Faça um programa que receba a idade de várias pessoas e calcule a média.
// O programa deve parar de pedir a idade quando o usuário digitar a idade -1.

public class Exemplo1 {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        int idade = 0;
        int soma = 0;
        int i = 0;
        while (idade != -1){
            System.out.println("Digite sua idade: ");
            idade = leitor.nextInt();

            if (idade !=-1) {
                i++;
                soma += idade;
            }
        }
        double media = soma/i;
        System.out.printf("A média de idades é: %.2f", media );
    }
}

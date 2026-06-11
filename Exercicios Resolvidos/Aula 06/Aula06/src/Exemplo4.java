import java.util.Scanner;

public class Exemplo4 {
//4. Faça um programa que leia uma sequência de números inteiros até que o usuário digite o número 0.
// O programa deve calcular a soma de todos os números digitados e imprimir o resultado.

    static void main() {
        Scanner leitor = new Scanner(System.in);
        int verifica = 1;
        double soma = 0;
        while (verifica!=0){
            System.out.println("Informe o número que deseja somar (0-Sair)");
            verifica = leitor.nextInt();
            soma += verifica;
        }
        System.out.println("A Soma dos Números é de: " + soma);
    }
}

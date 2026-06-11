import java.util.Scanner;

public class VetoreseMatrizes {
//Crie um programa que:
//Crie um vetor de 5 posições
//Peça para o usuário digitar 5 números
//Mostre todos os números digitados
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[]numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe O " + (i+1) +" Número: ");
            numeros[i] = leitor.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+ " Número Digitado: " + numeros[i]);
        }

    }
}
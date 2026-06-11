import java.util.Scanner;
//Crie um programa que:
//Receba 5 notas
//Guarde em um vetor
//Mostre:
//soma das notas
//média das notas
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[]notas = new int[5];
        double soma_notas = 0;
        double media_notas = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe a " + (i+1) + " Nota: ");
            notas[i] = leitor.nextInt();
            soma_notas = notas[i] + soma_notas;
        }
        media_notas = soma_notas/5;
        System.out.println("A Soma das Notas: " + soma_notas);
        System.out.println("A Média das Notas: " + media_notas);
    }
}

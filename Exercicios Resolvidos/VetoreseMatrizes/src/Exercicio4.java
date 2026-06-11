import java.util.Scanner;
//Crie um programa que:
//Receba 5 números
//Guarde em um vetor
//Mostre os números em ordem inversa
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Informe o " + (i+1) + " Numero: ");
            numeros[i] = leitor.nextInt();
        }
        for (int i = 4; i > 0; i--) {
            System.out.println((i+1) + " Numero Informado foi: " + numeros[i]);
        }
    }
}

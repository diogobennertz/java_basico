import java.util.Scanner;
//Crie um programa que:
//Receba 10 números
//Guarde em um vetor
//Mostre:
//maior número digitado
public class Exercicio0002 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[]numeros = new int[10];
        int maior_numero =0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o " + (i+1) + " Valor: ");
            numeros[i] = leitor.nextInt();
            if (numeros[i]>maior_numero){
                maior_numero = numeros[i];
            }
        }
        System.out.println("Maior Número Digitado: " + maior_numero);
    }
}

import java.util.Scanner;
//Faça um programa que:
//leia 10 números
//mostre:
//maior
//menor
//média
//quantos são pares
//quantos são ímpares
public class ExercicioExtra {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[]numeros = new int[10];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        double media = 0;
        int qnt_pares = 0;
        int qnt_impares = 0;
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("Informe o " + (i+1) + " Número: ");
            numeros[i] = leitor.nextInt();
            if (numeros[i]>maior){
                maior = numeros[i];
            } else if (numeros[i]<menor) {
                menor = numeros[i];
            }
            media = numeros[i] + media;
            if (numeros[i]%2==0){
                qnt_pares++;
            }else {
                qnt_impares++;
            }
        }
        System.out.println("O Maior: " + maior);
        System.out.println("O Menor: " + menor);
        System.out.println("A Média: " + media/ numeros.length);
        System.out.println("Os Pares: " + qnt_pares);
        System.out.println("Os Impares: " + qnt_impares);

    }
}

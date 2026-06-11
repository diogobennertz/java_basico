import java.util.Scanner;
//Exercício 04 – Faça um programa para ler dois números fornecidos pelo usuário e
//mostra a multiplicação (*) destes números.
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o Primeiro Numero: ");
        int numero1 = leitor.nextInt();
        System.out.println("Informe o Segundo Numero");
        int numero2 = leitor.nextInt();
        int multiplica = numero1 * numero2;
        System.out.println("A Multiplicação é : " + multiplica );

        leitor.close();
    }
}

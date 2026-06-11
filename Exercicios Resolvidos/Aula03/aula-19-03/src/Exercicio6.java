import java.util.Scanner;
//Exercício 06 – Faça um programa para ler dois números fornecidos pelo usuário e
//mostrar a divisão (/) desses números.
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o Primeiro Numero: ");
        int numero1 = leitor.nextInt();
        System.out.println("Informe o Segundo Numero");
        int numero2 = leitor.nextInt();
        int divide = numero1 / numero2;
        System.out.println("A Divisão é : " + divide );

        leitor.close();
    }
}

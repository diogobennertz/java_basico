import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe Sua Idade: ");
        int idade = leitor.nextInt();

        if (idade >= 18) {
            System.out.println("Você pode dirigir!");
        } else {
            System.out.println("Você não pode dirigir!");
        }
        System.out.println("Informe um número inteiro: ");
        int numero = leitor.nextInt();
        if (numero % 2 == 0) {
            System.out.println("É Par!");
        } else {
            System.out.println("É Impar!");
        }
    }
}

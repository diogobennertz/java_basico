import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {

        Scanner  leitor = new Scanner(System.in);
        int idade;
        System.out.print("Informe sua idade: ");
        idade = leitor.nextInt();

        System.out.println("Nova idade: " + idade);

        ///
        leitor.close();
    }
}
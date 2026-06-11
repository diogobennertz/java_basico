import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main3 {
    public static void main(String[] args) {
        Scanner  leitor = new Scanner(System.in);
        System.out.println("Informe a Cidade que você mora:");
        String cidade = leitor.nextLine();

        System.out.println("Informe o numero da sua casa");
        int numero_casa = leitor.nextInt();

        System.out.println("Informe sua altura");
        double altura = leitor.nextDouble();

        System.out.println("Sua cidade é: " + cidade + " o número da casa é: " + numero_casa + " e você tem: " + altura + " de altura" );

        leitor.close();

        }
    }

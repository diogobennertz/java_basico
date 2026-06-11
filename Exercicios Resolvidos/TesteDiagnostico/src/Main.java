import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe Um Número Para Fazer a Tabuada: ");
        int numero = leitor.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "*" + i + " = " + numero*i);
        }



        }
    }
import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        int i = palavra.length() - 1; // Começa no índice da última letra

        System.out.print("Palavra invertida: ");

        // Estrutura do-while solicitada
        do {
            if (i >= 0) {
                System.out.print(palavra.charAt(i));
            }
            i--;
        } while (i >= 0);

        System.out.println(); // Pula uma linha no final
        scanner.close();
    }
}

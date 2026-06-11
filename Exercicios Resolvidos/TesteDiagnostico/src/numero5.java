import java.util.Scanner;

public class numero5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double total_canal4 = 0;
        double total_canal5 = 0;
        double total_canal7 = 0;
        double total_canal12 = 0;
        int canal = 1;
        int audiencia = 0;
        int i = 0;
        double audiencia_total = 0;
        while (canal != 0) {
            System.out.println("Informe o Numero do Canal: ");
            System.out.println("|| 4 - 5 - 7 - 12 ||");
            System.out.println("||    0 - Sair    ||");
            canal = leitor.nextInt();
            if (canal == 4) {
                System.out.println("Quantas Pessoas Assistindo? ");
                audiencia = leitor.nextInt();
                total_canal4 = audiencia + total_canal4;
            } else if (canal == 5) {
                System.out.println("Quantas Pessoas Assistindo? ");
                audiencia = leitor.nextInt();
                total_canal5 = audiencia + total_canal5;
            } else if (canal == 7) {
                System.out.println("Quantas Pessoas Assistindo? ");
                audiencia = leitor.nextInt();
                total_canal7 = audiencia + total_canal7;
            } else if (canal == 12) {
                System.out.println("Quantas Pessoas Assistindo? ");
                audiencia = leitor.nextInt();
                total_canal12 = audiencia + total_canal12;
            }
            i++;
        }
        audiencia_total = total_canal4 + total_canal7 + total_canal5 + total_canal12;
        System.out.println("Media Canal 4: " + (total_canal4 * 100) / audiencia_total + "%");
        System.out.println("Media Canal 5: " + (total_canal5 * 100) / audiencia_total + "%");
        System.out.println("Media Canal 7: " + (total_canal7 * 100) / audiencia_total + "%");
        System.out.println("Media Canal 12: " + (total_canal12 * 100) / audiencia_total + "%");
    }
}

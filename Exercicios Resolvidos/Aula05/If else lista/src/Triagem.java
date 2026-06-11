import java.util.Scanner;

public class Triagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a temperatura: ");
        double temp  = sc.nextDouble();
        System.out.println("Informe a Pressão Sintolica: ");
        int    press = sc.nextInt();
        System.out.println("Informe o nivel de dor: ");
        int    dor   = sc.nextInt();

        if (dor < 0 || dor > 10) {
            System.out.println("Dados inválidos!");
            return;
        }

        String urgencia;
        if (temp > 39.5 || press > 180 || dor >= 9) {
            urgencia = "🔴 VERMELHO — Emergência";
        } else if (temp > 38.5 || press > 160 || dor >= 7) {
            urgencia = "🟠 LARANJA — Muito urgente";
        } else if (temp > 37.5 || press > 140 || dor >= 4) {
            urgencia = "🟡 AMARELO — Urgente";
        } else {
            urgencia = "🟢 VERDE — Pouco urgente";
        }

        System.out.printf("Temp: %.1f°C | Pressão: %d | Dor: %d%n",
                temp, press, dor);
        System.out.println(urgencia);
    }
}
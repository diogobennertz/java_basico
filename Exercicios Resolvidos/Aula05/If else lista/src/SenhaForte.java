import java.util.Scanner;

public class SenhaForte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        String senha = sc.next();

        boolean temTamanho  = senha.length() >= 8;
        boolean temNumero   = senha.matches(".*[0-9].*");
        boolean temMaiuscula = senha.matches(".*[A-Z].*");
        boolean temEspecial = senha.matches(".*[!@#$%&*].*");

        int criterios = 0;
        if (temTamanho)   criterios++;
        if (temNumero)    criterios++;
        if (temMaiuscula) criterios++;
        if (temEspecial)  criterios++;

        String forca;
        if (criterios == 4) {
            forca = "🟢 Muito Forte";
        } else if (criterios == 3) {
            forca = "🟡 Forte";
        } else if (criterios >= 2) {
            forca = "🟠 Média";
        } else {
            forca = "🔴 Fraca";
        }

        System.out.printf("Tamanho >= 8: %b%n", temTamanho);
        System.out.printf("Tem número:   %b%n", temNumero);
        System.out.printf("Tem maiúscula:%b%n", temMaiuscula);
        System.out.printf("Tem especial: %b%n", temEspecial);
        System.out.println("Força: " + forca);
    }
}
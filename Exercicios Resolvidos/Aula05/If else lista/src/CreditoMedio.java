import java.util.Scanner;

public class CreditoMedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe Sua Idade: ");
        int idade = sc.nextInt();
        System.out.println("Informe sua Renda");
        double renda = sc.nextDouble();
        System.out.println("Informe Seu Score");
        int score = sc.nextInt();

        if (renda >= 10.000 && score >= 800) {
            System.out.println("Credito Platinum Liberado!");
        } else if (renda >= 5.000 && score >= 600) {
            System.out.println("Credito Gold Liberado!");
        } else if (idade >= 18 && renda >= 1.500 && score >= 300) {
            System.out.println("Credito Básico Liberado!");
        } else {
            System.out.println("Crédito Negado!");
        }
        sc.close();
    }
}

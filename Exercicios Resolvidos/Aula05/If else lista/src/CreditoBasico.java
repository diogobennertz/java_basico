import java.util.Scanner;

public class CreditoBasico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe Sua Idade: ");
        int idade = sc.nextInt();;
        System.out.println("Informe Sua Renda");
        double renda = sc.nextDouble();
        if (idade >= 18 && renda >= 1500) {
               System.out.println("Credito Basico Liberado!");
          } else {
              System.out.println("Credito Basico Negado!");
           }
        sc.close();
    }
}

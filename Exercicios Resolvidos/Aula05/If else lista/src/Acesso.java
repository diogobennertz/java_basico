import java.util.Scanner;

public class Acesso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe Sua Idade: ");
        int idade = sc.nextInt();
        System.out.println("Informe seu código");
        String codigo = sc.next();
        System.out.println("Informe se for estudante (true) se não (false)");
        boolean estudante = sc.nextBoolean();
        boolean acesso = idade >= 18 && codigo.equals("VIP2024");
        boolean desconto = estudante || idade >= 60;

        if (acesso) {
            System.out.println("Acesso liberado!");
        } else {
            System.out.println("Acesso negado.");
        }
        if (desconto) {
            System.out.println("Desconto de 20% aplicado.");
        }
    }
}
import java.util.Scanner;

public class CaixaRegistradora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o total da compra: ");
        double total  = sc.nextDouble();
        System.out.println("Informe o tipo de cliente (normal, vip, estudante): ");
        String tipo   = sc.next();

        double pct = 0.0;
        if (tipo.equals("vip")) {
            pct = 0.20;
        } else if (tipo.equals("estudante")) {
            pct = 0.10;
        }
        if (total > 100) {
            pct += 0.05; // desconto extra
        }

        double desc  = total * pct;
        double final_ = total - desc;

        System.out.printf("Original: R$ %.2f%n", total);
        System.out.printf("Desconto: R$ %.2f%n", desc);
        System.out.printf("Total:    R$ %.2f%n", final_);
    }
}
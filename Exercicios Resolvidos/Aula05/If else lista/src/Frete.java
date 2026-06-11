import java.util.Scanner;

public class Frete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor: ");
        double valor  = sc.nextDouble();
        System.out.println("Informe o peso: ");
        double peso   = sc.nextDouble();
        System.out.println("Informe o Estado(UF): ");
        String estado = sc.next().toUpperCase();

        double frete;
        if (valor > 500) {
            frete = 0; // frete grátis
        } else if (peso <= 1) {
            frete = 15;
        } else if (peso <= 5) {
            frete = 25;
        } else {
            frete = 40;
        }

        double aliquota;
        if (estado.equals("SP")) {
            aliquota = 0.12;
        } else if (estado.equals("RJ")) {
            aliquota = 0.15;
        } else {
            aliquota = 0.10;
        }

        double imposto = valor * aliquota;
        double total   = valor + frete + imposto;

        System.out.printf("Produto: R$ %.2f%n", valor);
        System.out.printf("Frete:   R$ %.2f%n", frete);
        System.out.printf("Imposto: R$ %.2f (%.0f%%)%n", imposto, aliquota*100);
        System.out.printf("Total:   R$ %.2f%n", total);
    }
}
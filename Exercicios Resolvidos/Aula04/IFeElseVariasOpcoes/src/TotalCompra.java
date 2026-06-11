import java.util.Scanner;

public class TotalCompra {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantas Maças Foram Vendidas?");
        int macas = leitor.nextInt();

        if (macas<12){
            System.out.println("O Valor a Pagar é: R$" + macas*1.30);
        }
        else {
            System.out.println("O Valor a Pagar é: R$" + macas*1.0);
        }
    }
}

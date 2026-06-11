import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota (0-10): ");
        double nota = sc.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida!");
        } else if (nota >= 9.0) {
            System.out.println("Conceito A");
        } else if (nota >= 7.0) {
            System.out.println("Conceito B");
        } else if (nota >= 5.0) {
            System.out.println("Conceito C");
        } else {
            System.out.println("Reprovado");
        }
    }
}
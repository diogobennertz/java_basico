import java.util.Scanner;

public class Exercicio1scan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira a altura do usuario1: ");
        double altura1 = input.nextDouble();
        System.out.print("Insira a altura do usuario2: ");
        double altura2 = input.nextDouble();
        double diferencaAltura = altura1-altura2;
        System.out.println("A diferença de altura é: " + diferencaAltura + " Metros");

    }
}

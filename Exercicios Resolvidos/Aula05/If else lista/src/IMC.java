import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Altura (m): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        String classe;

        if (imc < 18.5) {
            classe = "Abaixo do peso";
        } else if (imc < 25.0) {
            classe = "Peso normal";
        } else if (imc < 30.0) {
            classe = "Sobrepeso";
        } else {
            classe = "Obesidade";
        }

        System.out.printf("IMC: %.1f → %s%n", imc, classe);
    }
}
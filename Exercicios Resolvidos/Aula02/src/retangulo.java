import java.util.Scanner;

public class retangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a base do retangulo: ");
        double base = input.nextDouble();
        System.out.print("Informe a altura do retangulo: ");
        double altura = input.nextDouble();
        double area = base*altura;
        System.out.println("O area é: " + area);
        double perimetro = (base*2)+(altura*2);
        System.out.println("O perimetro é: " + perimetro);
    }
}

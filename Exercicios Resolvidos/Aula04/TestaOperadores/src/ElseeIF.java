import java.util.Scanner;

public class ElseeIF {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a nota 1 do aluno: ");
        double nota1 = leitor.nextDouble();

        System.out.println("Informe a nota 2 do aluno: ");
        double nota2 = leitor.nextDouble();

        System.out.println("Informe a nota 3 do aluno: ");
        double nota3 = leitor.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Parabéns! Você foi Aprovado com a media: " + media);
        } else if (media >= 5 && media < 7) {
            System.out.println("Você ficou em exame com média:" + media);
        } else if (media < 5) {
            System.out.println("Você Reprovou Com Média: " + media);
        }

    }
}

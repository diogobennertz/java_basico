import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //Exercício 01 - Faça um programa para ler 3 notas e calcular a média desse aluno

        System.out.println("Informe a Primeira Nota: ");
        Double primeiraNota = leitor.nextDouble();
        System.out.println("Informe a Segunda Nota: ");
        Double segundaNota = leitor.nextDouble();
        System.out.println("Informe a Terceira Nota: ");
        Double terceiraNota = leitor.nextDouble();

        Double media = (primeiraNota+segundaNota+terceiraNota)/3;
        System.out.println("Sua média foi de: " + media);
        if (media>7)
        {
            System.out.println("Parabéns Você Foi Aprovado!");
        }
        else
        {
            System.out.println("Infelizmente você reprovou");
        }
        leitor.close();


    }
}

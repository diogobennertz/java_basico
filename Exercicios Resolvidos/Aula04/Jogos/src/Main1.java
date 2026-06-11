import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main1 {
    public static void main(String[] args) {
    //Desafio 1: O Jogo da Adivinhação (Clássico)
        //• A Lógica: O programa gera um número aleatório (usando
        //Random rnd = new Random();
        //rnd.nextInt(100);) entre 0 e 99.
        //• A Regra: Usando um laço de repetição, o usuário dá seus palpites. O
        //programa usa if/else para responder "MAIOR" se o palpite for baixo, ou
        //"MENOR" se o palpite for alto, até que ele acerte e encerre o laço.

        Scanner leitor = new Scanner(System.in);
        Random rnd = new Random();
        int numero = rnd.nextInt(100);

        System.out.println("| Bem Vindo Ao Jogo!      |");
        System.out.println("| Tente Advinhar O Número!|");
        int tentativa = leitor.nextInt();

        if (tentativa!= numero){
            while (tentativa !=numero){
                System.out.println("Errado, Tente Novamente!");
                tentativa = leitor.nextInt();
           }
            System.out.println("Você Acertou!");
        }
        else{
            System.out.println("Você Acertou!");
        }


        leitor.close();
    }
}
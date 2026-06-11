import java.util.Scanner;

public class Xuxa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //Desafio 3: A Canção dos Patinhos da Xuxa (For Decrescente)
        //• A Lógica: Introduzir o conceito de decremento (--) no for.
        //• A Regra: O aluno entra com uma quantidade de patinhos. O laço diminui de
        //1 em 1 iterativamente imprimindo o verso da música: "n patinhos foram
        //passear... Mas só n-1 patinhos voltaram de lá".
        System.out.println("Informe o Numero de Patinhos: ");
        int numero = leitor.nextInt();
        for (int i = numero; i > 0 ; i--) {
            System.out.println(numero + " Patinhos Foram Passear Mas Só " + (i-1) + " Voltaram de Lá.." );

        }
        }
    }


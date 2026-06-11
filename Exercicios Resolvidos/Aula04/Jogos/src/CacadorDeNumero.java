import java.util.Scanner;

public class CacadorDeNumero {
    public static void main(String[] args) {
        //Desafio 2: O Caçador de Números (Matemática com if)
        //• A Lógica: Construir um laço for que gere todos os números entre 1000 e 1999.
        //• A Regra: Dentro do laço, colocar uma instrução if testando se o número,
        //quando dividido por 11, possui o resto igual a 5 (usando o operador de
        //módulo %). Se sim, imprime o número na tela.
        Scanner leitor = new Scanner(System.in);
        for (int i = 1000; i < 1999 ; i++) {
            if (i%11==5){
                System.out.println(i);
            }

        }

        leitor.close();
    }
}

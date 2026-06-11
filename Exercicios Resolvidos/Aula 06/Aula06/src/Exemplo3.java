import java.util.Enumeration;
import java.util.Scanner;

public class Exemplo3 {
    //3. Faça um programa que peça ao usuário para digitar um número positivo e,
    // em seguida, imprima todos os números de 0 até o número digitado utilizando a estrutura de repetição do-while.
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um Numero Positivo: ");
        int numero = leitor.nextInt();
        int i = 0;
        if (numero >= 0 ){
           do {
               System.out.println(i);
               i++;
           }while (numero>=i);
        }
        else{
            System.out.println("Número Inválido, Informe um Número Positivo!");
        }


    }

}

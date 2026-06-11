import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class AdvinhaNumero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Tente Advinhar o Numero");
        double numero = leitor.nextDouble();
        if (numero == 2){
            System.out.print("Acertou! Era 2!");
        }
        else {
            while (numero!=2){
               if (numero>2) {
                    System.out.print("O Número é Menor Que: " + numero + "Tente Novamente!");
                    numero = leitor.nextDouble();
                }
                else if (numero<2){
                    System.out.print("O Número É Maior Que: " + numero + " Tente Novamente!");
                    numero = leitor.nextDouble();
                }


            }

                System.out.print("Acertou! Era 2");
        }
        leitor.close();
    }
}


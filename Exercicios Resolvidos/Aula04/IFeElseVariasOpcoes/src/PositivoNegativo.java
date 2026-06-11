import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe Um Número: ");
        int numero = leitor.nextInt();

        if (numero<0){
            System.out.println("Número Negativo");
        }
        else{
            System.out.println("Numero Positivo");
        }

        leitor.close();
    }
}

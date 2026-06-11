import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o Numero Para Verificar Se É Impar Ou Par: ");
        double numero = leitor.nextDouble();

        if (numero%2==0){
            System.out.println("É Par!");
        }
        else {
            System.out.println("É Impar");
        }
        leitor.close();
    }
}
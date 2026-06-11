import java.util.Scanner;

public class numero2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe Um Valor: ");
        int numero1 = leitor.nextInt();
        System.out.println("Informe Outro Valor: ");
        int numero2 = leitor.nextInt();
        System.out.println("Informe Outro Valor: ");
        int numero3 = leitor.nextInt();
        System.out.println("Em Ordem Lida: ");
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);
        System.out.println("Em Ordem Crescente: ");
        if (numero1 > numero2 && numero1>numero3 && numero2>numero3){
            System.out.println(numero1);
            System.out.println(numero2);
            System.out.println(numero3);
        }
        else if (numero2 > numero1 && numero2>numero3 && numero3>numero1){
            System.out.println(numero2);
            System.out.println(numero3);
            System.out.println(numero1);
        }
        else if (numero3 > numero1 && numero3>numero2 && numero2>numero1){
            System.out.println(numero3);
            System.out.println(numero2);
            System.out.println(numero1);
        }
        System.out.println("Em Ordem Decrescente: ");
        if (numero1 < numero2 && numero1<numero3 && numero2<numero3){
            System.out.println(numero1);
            System.out.println(numero2);
            System.out.println(numero3);
        }
        else if (numero2 < numero1 && numero2<numero3 && numero3<numero1){
            System.out.println(numero2);
            System.out.println(numero3);
            System.out.println(numero1);
        }
        else if (numero3 < numero1 && numero3<numero2 && numero2<numero1){
            System.out.println(numero3);
            System.out.println(numero2);
            System.out.println(numero1);
        }
    }
}

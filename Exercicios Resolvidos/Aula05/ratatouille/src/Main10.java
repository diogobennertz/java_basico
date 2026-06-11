import java.sql.SQLOutput;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double  saldo = 1000.00;
        double valorSaque = 0.00;
        int codigo = 0;
        double valorDeposito =0.0;
        int cemRatatouilles = 40;
        int cinquentaRatatouilles = 40;
        int vinteRatatouilles = 30;
        int cincoRatatouilles = 15;
        int doisRatatouilles = 15;

        while (codigo!=4) {
            System.out.println("| ======= Bem Vindo Ao RatoBank! ======= |");
            System.out.println("| =======    Caixa Eletrônico    ======= |");
            System.out.println("|   1 - Consultar Saldo;                 |");
            System.out.println("|   2 - Realizar Saque;                  |");
            System.out.println("|   3 - Realizar Depósito;               |");
            System.out.println("|   4 - Sair                             |");
            System.out.println("==========================================");
            System.out.println("Informe a Opção Desejada: ");
            codigo = leitor.nextInt();
            switch (codigo) {
                case 1:
                    System.out.println("Seu Saldo é de " + saldo + " ratatouilles");
                    break;
                case 2:
                    System.out.println("Informe o Valor do Saque: ");
                    valorSaque = leitor.nextDouble();
                    if (valorSaque>saldo){
                        System.out.println("Valor Indispónivel! Valor Disponível para Saque: " + saldo);
                    }else{
                        System.out.println("Saque de " + valorSaque + " efetuado.");
                    }
                    saldo = saldo-valorSaque;
                    break;
                case 3:
                    System.out.println("Valor á Ser Depositado: ");
                    valorDeposito = leitor.nextDouble();
                    if (valorDeposito < 0){
                        System.out.println("Valor Inválido! Digite Um Valor Positivo a Ser Depositado: ");
                        valorDeposito = leitor.nextDouble();
                    }
                    saldo = saldo + valorDeposito;
                    break;
                case 4:
                    break;
            }

        }
    }
}
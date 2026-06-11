import java.util.Scanner;

public class SalarioVendas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe Seu Salário");
        double salario = leitor.nextDouble();
        System.out.println("Informe o Valor das Vendas");
        double vendas = leitor.nextDouble();

        if (vendas<=1500){
            salario = salario + (vendas*0.03);
            System.out.println("Seu Salario Ficou em : R$" + salario);
        }
        else{
            double sobra = salario-1500;
            double comissao_1500 = 1500 + (vendas*0.03);
            double comissa_sobra = sobra * 0.05;
            System.out.println("Seu Salario com a Comissão Até 1500: R$" + comissao_1500 + " e seu salario com a Comissao do Resto: R$" + comissa_sobra);
        }

    }
}

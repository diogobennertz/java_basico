import java.util.Scanner;
//Exercício 09 – Faça um programa que calcule e exiba o novo salário de um funcionário,
//considerando um aumento percentual fornecido pelo usuário.
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o Seu Salário: ");
        Double salario = leitor.nextDouble();
        System.out.println("Informe a Porcentagem do Aumento");
        Double aumento = leitor.nextDouble();
        Double salarioFinal = (salario * (aumento/100))+salario;
        System.out.println("O Salario Final é : " + salarioFinal );

        leitor.close();
    }
}

import java.util.Scanner;

public class CreditoAvancado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = "";
        System.out.println("Informe Sua Idade: ");
        int idade = sc.nextInt();
        System.out.println("Informe sua Renda");
        double renda = sc.nextDouble();
        if (renda<0){
            System.out.println("Dados Inválidos!");
            return;
        }
        System.out.println("Informe Seu Score");
        int score = sc.nextInt();
        if (score<0 || score>1000) {
            System.out.println("Dados Inválidos!");
            return;
        }
        double juros = 0;
        if (score>= 700) {
            juros = 1.5;
        }
        else {
            juros = 2.9;
        }
        if (renda >= 10.000 && score >= 800) {
        double limite = renda * 3.0;
            msg = "===== ANÁLISE DE CRÉDITO =====\n"
        +"Renda:  R$" + renda +" | Score: " + score + "\n"
        +"Cartão: PLATINUM \n"
        +"Limite: R$ " + limite + "\n"
        +"Juros:  "+ juros + " a.m. \n"
        +"============================== \n";
        } else if (renda >= 5.000 && score >= 600) {
            double limite = renda * 3.0;
            msg = "===== ANÁLISE DE CRÉDITO =====\n"
                    +"Renda:  R$" + renda +" | Score: " + score + "\n"
                    +"Cartão: Gold \n"
                    +"Limite: R$ " + limite + "\n"
                    +"Juros:  "+ juros + " a.m. \n"
                    +"============================== \n";
        } else if (idade >= 18 && renda >= 1.500 && score >= 300) {
            double limite = renda * 3.0;
            msg = "===== ANÁLISE DE CRÉDITO =====\n"
                    +"Renda:  R$" + renda +" | Score: " + score + "\n"
                    +"Cartão: Basico \n"
                    +"Limite: R$ " + limite + "\n"
                    +"Juros:  "+ juros + " a.m. \n"
                    +"============================== \n";
        } else {
            System.out.println("Crédito Negado!");
        }

        System.out.println(msg);
        sc.close();
    }
}

import java.util.Scanner;

public class questao4 {
    //Cada espectador de um cinema respondeu a um questionário no qual constava
    //sua idade e a sua opinião em relação ao filme:
    //• ótimo - 3
    //• bom - 2
    //• regular – 1
    //Faça um programa que receba a idade e a opinião de 15 espectadores e que
    //calcule e mostre:
    //• A média das idades das pessoas que responderam ótimo;
    //• A quantidade de pessoas que respondeu regular;
    //• A percentagem de pessoas que respondeu bom entre todos os espectadores
    //analisados.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
    int idade = 0;
    double media_otimo = 0.0;
    int nota = 0;
    int qtd_regular = 0;
    double qtd_bom = 0;
    int qtd_otimo = 0;
        for (int i = 0; i < 16; i++) {
            System.out.println("Informe Sua Idade: ");
            idade = leitor.nextInt();
            System.out.println("|Informe A Nota Do Filme:    |");
            System.out.println("|1-Regular | 2-Bom | 3-Ótimo |");
            nota = leitor.nextInt();
            if ( nota == 1) {
                qtd_regular++;
            } else if (nota == 2) {
               qtd_bom++;
            }else {
                media_otimo = idade + media_otimo;
                qtd_otimo++;
            }
        }
        if (qtd_otimo==0){
            System.out.println("A Média de Idades das Pesoas Que Disseram Ótimo: 0");
        }else {
            System.out.println("A Média de Idades das Pesoas Que Disseram Ótimo: " + media_otimo / qtd_otimo);
        }
        System.out.println("A quantidade de pessoas que respondeu regular: "+ qtd_regular);
        System.out.println("A porcentagem de pessoas que respondeu bom entre todos os espectadores: " + (qtd_bom*100)/15 + "%");
        leitor.close();
    }
}

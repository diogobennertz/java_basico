import java.util.Scanner;

public class numero4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double media_idade = 0;
        int j = 0;
        int k = 0;
        for (int i = 0; i < 15; i++) {
            System.out.println("Informe Sua Idade: ");
            int idade = leitor.nextInt();
            System.out.println("Informe a Nota do Filme: ");
            System.out.println("|| Ótimo - 3 || Bom - 2 || Regular - 1 ||");
            int opcao = leitor.nextInt();
            if (opcao == 3) {
                media_idade = idade + media_idade;
                j++;
            } else if (opcao == 2) {
                k++;
            }
        }
        System.out.println("A Média das Idades que Responderam Ótimo: " + media_idade / j);
        System.out.println("A Quantidade de Pessoas que Respondeu Regular: " + ((j + k) - 15)*-1);
        System.out.println("A Porcentagem de Pessoas que Respondeu Bom: " + (k*100)/15 + "%");
    }
}

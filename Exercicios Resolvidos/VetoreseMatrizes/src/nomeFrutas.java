import java.util.Scanner;

public class nomeFrutas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] nomes = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o Nome da " + (i+1) + " Fruta:");
            nomes[i]= leitor.nextLine();
        }
        System.out.println("Foram Informadas as Frutas: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(nomes[i]);
        }
        for (String letras : nomes){
            System.out.println(letras);
        }
    }
}

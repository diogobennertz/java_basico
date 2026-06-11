import java.util.Scanner;

public class numero3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int desconto = 0;
        int i =5;
        System.out.println("Tabela de Descontos: ");
        while (desconto<25){
            desconto = ((i *100)-500)/100;
            System.out.println(" || R$" + i*100 + " Desconto de: " + desconto + "% || " );
            i++;
        }
    }
}

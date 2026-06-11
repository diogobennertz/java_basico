import java.util.Scanner; // Scanner Sendo Importado!

public class Main7 { //Declara a Main!
    public static void main(String[] args) { //Estrutura a Main!
        Scanner leitor = new Scanner(System.in); //Chamdo a Classe Scanner Para Entrada de Dados!
        int codigo = 1; //Declaro a Variável de Verificação do While!

        while (codigo != 0){ //Abro a Estrutura do While!
            System.out.println("Informe o Código do Aluno(0 para sair)!"); //Imprime Para o Usuário Entrar Com os Dados!
            codigo = leitor.nextInt(); //Chama o Código para Ser Reescrito Conforme a Entrada do Usuário!
            if (codigo == 0){ //Abre If para Caso o Usuário Queira Sair, Ele Sai!
                break; //Quebra o While (Saí Da Repetição).
            }
            System.out.println("Informe a Primeira Nota: "); //Imprime Para o Usuário Entrar Com os Dados!
            double nota1 = leitor.nextInt(); //Chama Váriavel Para Entrar Os Dados.
            System.out.println("Informe a Segunda Nota: "); //Imprime Para o Usuário Entrar Com os Dados!
            double  nota2 = leitor.nextInt(); //Chama Váriavel Para Entrar Os Dados.
            System.out.println("Informe a Terceira Nota: "); //Imprime Para o Usuário Entrar Com os Dados!
            double nota3 = leitor.nextInt(); //Chama Váriavel Para Entrar Os Dados.
            double media = (nota1 + nota2 + nota3)/3; //Calcula a Média Conforme a Entrada do Usuário.
            if (media>=7) { //Se Média Maior Igual 7, Aprovado!
                System.out.println("A média foi de " + media + " Aprovado!"); //Imprime A Média e Mensagem de Aprovação.
            }
            else{ //Caso NÂO Seja Igual o Se Acima ↑
                System.out.println("A média foi de " + media + " Reprovado!"); //Imprime A Média e Mensagem de Reprovação.
            }
         }//Acaba a Estrutura do While.
        System.out.println("O Programa Foi Finalizado!"); //Mensagem de Programa Finalizado para O Usuário se Localizar.
    }
}
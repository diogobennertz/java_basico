public class Exemplo2 {
    static void main() {
        //2. Faça um programa que imprima os números pares entre 1 e 50 utilizando a estrutura de repetição while.
        int contador = 0;

        while (contador <= 50){

            if (contador % 2 == 0){
                System.out.printf("Numero par: %d\n",contador);
            }
            contador++;
        }
    }
}

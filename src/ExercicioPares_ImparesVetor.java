import java.util.Scanner;

public class ExercicioPares_ImparesVetor {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero = 20;
        int vetor[] = new int[numero];

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Insira o numero para a posição " + (i + 1));
            numero = teclado.nextInt();
            vetor[i] = numero;
        }

        System.out.println(" ---- VALORES INSERIDOS ----");

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(" Na posição [" + (i+1) + "] o valor é " + vetor[i]);
        }

        System.out.println("*******************************************");
        System.out.println("---- VALOR(ES) PAR(ES) ----");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0){
                int[] par = new int[vetor.length];
                System.out.println(" Na posição [" + (i+1) + "] o valor " + vetor[i] + " é par");
            }
        }

        System.out.println("*******************************************");
        System.out.println("---- VALOR(ES) IMPAR(ES) ----");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 1){
                int[] impar = new int[vetor.length];
                System.out.println(" Na posição [" + (i+1) + "] o valor " + vetor[i] + " é impar");
            }
        }


    }

}


/*Faça um Programa que leia 20 números inteiros e armazene-os num vetor.
 **Armazene os números pares no vetor PAR e os números IMPARES no vetor impar.
 **Imprima os três vetores.
 */
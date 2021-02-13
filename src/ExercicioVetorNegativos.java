import java.util.Scanner;

public class ExercicioVetorNegativos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int tamanho;

        System.out.println("Qual o tamanho da lista que deseja?");
        tamanho = teclado.nextInt();

        int vetor[] = new int[tamanho];
        int numero;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira os valores que deseja: ");
            numero = teclado.nextInt();
            vetor[i] = numero;
        }

        System.out.println("********** VALORES NEGATIVOS **********");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                int[] negativo = new int[vetor.length];
                System.out.println("Na posição [" + (i + 1) + "] o valor " + vetor[i] + " é negativo");
            }
        }


    }


}


///////////////////////////////////////////////
//  Exercício 4: Crie um método que recebe um array de inteiros e retorna a quantidade de elementos
//do array que são números negativos.
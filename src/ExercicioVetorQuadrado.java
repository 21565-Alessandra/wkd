import java.util.Scanner;

public class ExercicioVetorQuadrado {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int valores = 10;
        int vetor[] = new int[valores];
        double[] quadrado = new double[valores];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira o " + (i + 1) + "º numero que deseja calcular o valor ao quadrado: ");
            valores = teclado.nextInt();
            vetor[i] = valores;

            quadrado[i] = valores * valores;

            System.out.println("O valor ao quadrado do numero " + valores + " é " + quadrado[i]);

        }

        /*for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira o " + (i + 1) + "º numero que deseja calcular o valor ao quadrado: ");
            valores = teclado.nextInt();
            vetor[i] = valores;
            }

        for (int i = 0; i < vetor.length; i++) {
          quadrado[i] = valores * valores;

          System.out.println("O valor ao quadrado do numero " + valores + " é " + quadrado[i]);
          }

          // >>>>>> aqui eu queria imprimir os numeros primeiros e depois mostrar o valor ao quadrado de cada, mas a conta deu 1.0 pra todos

          */


    }
}




//*Receba 10 números e calcule o quadrado deles e mostre o resultado na tela
//*N faz a soma não. Faz só os quadrados e tals
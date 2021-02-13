import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ExercicioMaiorMenor {

    public static void main(String[] args) {

        int[] valores = new int[10];

        for (int i = 0; i < valores.length; i++) {

            System.out.println("Digite os valores que deseja: ");
            valores[i] = new Scanner(System.in).nextInt();

        }

        valorMaiorMenor(valores);
        //valorMaior(valorA, valorB, valorC); // soh vai colocar tipo (int/double) quando for declaracao de variaveis ou assinatura
    }

    public static void valorMaior(int valorA, int valorB, int valorC) {

        if (valorA > valorB && valorA > valorC) {
            System.out.println("O número: " + valorA + " é o maior valor inserido");
        }
        else if (valorB > valorA && valorB > valorC) {
            System.out.println("O número: " + valorB + " é o maior valor inserido");
        }
        else if (valorC > valorA && valorC > valorB){
            System.out.println("O número: " + valorC + " é o maior valor inserido");
        }
        else {
            System.out.println("Nao ha valor maior entre esses numeros");
        }

    }

    public static void valorMaiorMenor(int valores[]){

        int max = IntStream.of(valores).max().orElse(Integer.MIN_VALUE);
        int min = IntStream.of(valores).min().orElse(Integer.MAX_VALUE);

        System.out.println("O valor maior identificado foi: " + max + " e o menor valor identificado foi: " + min + ".");
    }
}

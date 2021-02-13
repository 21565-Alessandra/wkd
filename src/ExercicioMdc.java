import java.util.Random;

public class ExercicioMdc {

    public static void main(String[] args) {

        int a;
        int b;

        Random aleatorio = new Random();
        a = aleatorio.nextInt(10);
        b = aleatorio.nextInt(10);

        int resposta = mdc(a, b);

        System.out.println("O valor a " + a + " e o valor b " + b + " e resposta " + resposta);

    }

    public static int mdc(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

}


////////////////////////////////////
//Desafio: Escreva um programa em Java que recebe dois inteiros
//e retorna o MDC, máximo divisor comum. --  com método/função
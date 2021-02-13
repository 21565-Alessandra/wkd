import java.util.Scanner;

public class ExercicioNotaDaProvaComMetodo {

        public static void main(String[] args){

            int nota;

            Scanner teclado = new Scanner(System.in);

            System.out.println("Digite uma Nota: ");

            nota = teclado.nextInt();

            situacao(nota);
        }

    public static void situacao(double nota) {
        if (nota <= 0 && nota >= 100) {
            System.out.println("Valor invalido");
        } else if (nota == 0) {
            System.out.println("Sua nota é igual a E (Burro!)");
        } else if (nota >= 1 && nota <= 35) {
            System.out.println("Sua nota equivale à D (Limitado!");
        } else if (nota >= 36 && nota <= 60) {
            System.out.println("Sua nota equivale a C de Cristo");
        } else if (nota >= 61 && nota <= 85) {
            System.out.println("Sua nota equivale a B");
        } else {
            System.out.println("Sua nota equivale a A =D");
        }

    }

}





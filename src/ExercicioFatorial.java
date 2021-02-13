import java.util.Scanner;

public class ExercicioFatorial {

    public static void main(String[] args) {

        int numero;
        int fatorial = 1;


        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero");
        numero = teclado.nextInt();

        if (numero == 0){
            fatorial = 1;
        }
        else {
            for (int inicial = numero; inicial >= 1; inicial--) {
                fatorial = fatorial * inicial;

            }
        }
        System.out.println("Fatorial de "+ numero + " é " + fatorial);


    }


}







//3)	Crie um algoritmo que exiba o fatorial de qualquer número.
//Ex: Fatorial de 3 é: 3 x 2 x 1 = 6;
//Fatorial de 5 é: 5 x 4 x 3 x 2 x 1 = 120;
//Dica: Use o - - , ao invés do ++, do maior para o menor.

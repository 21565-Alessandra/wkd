import java.util.Scanner;

public class ExercicioAdivinhaIdade {

    public static void main(String[] args) {

        int[] anos = new int[10];

        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < anos.length; i++){
            System.out.println("Digite o ano de nascimento: ");
            anos[i] = teclado.nextInt();
        }

        calculaIdade(anos);

    }

    public static void calculaIdade(int[] anos){

        int[] idade = new int[10];

        for(int i = 0; i < anos.length; i++){
            idade[i] = 2021 - anos[i];
        }

        for(int i = 0; i < idade.length; i++){
            System.out.println("Idade é " + idade[i]);
        }

    }
}

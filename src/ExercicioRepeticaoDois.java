import java.util.Scanner;

public class ExercicioRepeticaoDois {

    public static void main(String[] args) {

        int numeros = 0;
        int x;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite um numero");
            x = teclado.nextInt(); // x = 50; pra testar debug
            if (x >= 0 && x <= 100){
                System.out.println("O numero " + x + " esta entre 0 e 100");
            }
            else {
                System.out.println("Este numero nao esta entre 0 e 100");
            }
        } //sempre chaves depois de chapolin
        while (numeros < 20);


    }
}
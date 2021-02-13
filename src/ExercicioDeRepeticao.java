import java.util.Scanner;

public class ExercicioDeRepeticao {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;
        System.out.println("Qual o numero limite da sua contagem?");
        numero = teclado.nextInt(); //numero = 100; para testar debug defina um valor antes pois nao funciona com teclado.nextInt...

        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) // porcentagem significa resto de divisao
            {
                System.out.println(i);
            }

        }

        System.out.println("______________________________");

        int x = 0;

        while(x <= numero){
            if (x % 2 != 0)
                System.out.println(x);
            x++;
        }

    }
}

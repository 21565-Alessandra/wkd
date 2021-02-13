import java.util.Scanner;

public class ExercicioEquacaoSegundoGrau {

    public static void main(String[] args) {

        int a, b, c;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor a: ");
        a = teclado.nextInt();
        System.out.println("Digite o valor b: ");
        b = teclado.nextInt();
        System.out.println("Digite o valor c: ");
        c = teclado.nextInt();

        double delta = calculaDelta(a, b, c);
        //System.out.println(delta);

        double x1, x2;
        x1 = calculaX(delta, b, a, "soma");
        x2 = calculaX(delta, b, a, "subtracao");
        System.out.println("O valor delta: " + delta + ". O valor X1: " + x1 + ". E o valor X2: " + x2);
    }

    public static double calculaDelta(int a, int b, int c){

        double delta;

        delta = Math.pow(b,2) - 4 * a * c;
        return delta;
    }

    public static double calculaX(double delta, int b, int a, String operacao){

        double x;

        if (operacao.equals("soma")){
            x = (-b + Math.sqrt(delta)) / (2 * a); //sqrt = raiz  e  pow = potencia
        }
        else{
            x = (-b - Math.sqrt(delta)) / (2 * a);
        }
        return x;

    }
}

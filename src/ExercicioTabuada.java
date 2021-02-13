import java.util.Scanner;

public class ExercicioTabuada {

    public static void main(String[] args) {

        double valor;
        double resultado = 0.0;
        int opcao;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha o tipo de tabuada que deseja: ");

        System.out.println("Digite 1 para soma (+)");
        System.out.println("Digite 2 para subtração (-)");
        System.out.println("Digite 3 para divisão (/)");
        System.out.println("Digite 4 para multiplicação (x)");

        opcao = teclado.nextInt();

        System.out.println("Digite um valor que deseja ser calculado");

        valor = teclado.nextDouble();

        switch (opcao) {
            case 1:
                for (int inicial = 0; inicial <= 10; inicial++) {
                    resultado = valor + inicial;
                    System.out.println(valor + "+" + inicial + "=" + resultado);}
                break;

            case 2:
                for (int inicial = 10; inicial >= 0; inicial--) {
                    resultado = valor - inicial;
                    System.out.println(valor + "-" + inicial + "=" + resultado);}
                break;

            case 3:
                for (int inicial = 0; inicial <= 10; inicial++) {
                    resultado = valor / inicial;
                    System.out.println(valor + "/" + inicial + "=" + resultado);}
                break;

            case 4:
                for (int inicial = 0; inicial <= 10; inicial++) {
                    resultado = valor * inicial;
                    System.out.println(valor + "X" + inicial + "=" + resultado);}
                break;

            default:
                System.out.println("Valor invalido");
        }




    }


}




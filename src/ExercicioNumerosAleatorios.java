import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ExercicioNumerosAleatorios {

    public static void main(String[] args) {

        int dado1 = dados();
        int dado2 = dados();
        int dado3 = dados();

        System.out.println("Seus numeros aleatórios são: ");
        System.out.println(dado1);
        System.out.println(dado2);
        System.out.println(dado3);

        valorMax(dado1, dado2, dado3); //esse dado1/2/3 refere-se a variavel iniciada nessa classe main
                                        //os valores na assinatura do metodo tem o mesmo nome pra nao confundir
                                        //mas la na assinatura do metodo poderia ser x1/2/3
                                        //na assinatura tem que ter o mesmo numero de variaveis que as criadas na classe main
                                        //E as variaveis tem que ser do mesmo tipo (int, double);
        valorMin(dado1, dado2, dado3);
        paresImpares(dado1, dado2, dado3);
    }

    public static int dados() {

        Integer[] numeros = new Integer[6];

        //Gerar 5 numeros Aleatórios
        Random radom  = new Random();

        for(int i=0;i< numeros.length; i++) {
            int numeroTmp = radom.nextInt(6);

            /**
             * Transforma o array Integer para ArrayList e
             * utilzia o método contains para verificar
             * se o valor já existe
             */
            boolean contains = Arrays.asList(numeros).contains(numeroTmp);

            /* Caso exista informa ao usuáiro */
            if (!contains && numeroTmp  > 0) {
                numeros[i] = numeroTmp;
                return numeroTmp;
            }

        }
        /*Integer[] dados = new Integer[50];

        Random aleatorio1 = new Random();
        int dado = 0;


        do {
            dado = aleatorio1.nextInt(6);
            int finalDado = dado;
           // boolean contains = IntStream.of(dados).anyMatch(x -> x == finalDado);
        }
        while (dado == 0); // um "=" eh atribuicao, dois "==" eh comparacao.

        return dado;


         */
return 0;
    }

    public static void valorMax(int dado1, int dado2, int dado3){

        if(dado1 > dado2 && dado1 > dado3){
            System.out.println("O maior valor identificado foi: " + dado1);
        }
        else if (dado2 > dado1 && dado2 > dado3){
            System.out.println("O maior valor identificado foi: " + dado2);
        }
        else if (dado3 > dado1 && dado3 > dado2){
            System.out.println("O maior valor identificado foi: " + dado3);
        }
        else {
            System.out.println(" ");
        }

    }

    public static void valorMin(int dado1, int dado2, int dado3){

        if(dado1 < dado2 && dado1 < dado3){
            System.out.println("O menor valor identificado foi: " + dado1);
        }
        else if (dado2 < dado1 && dado2 < dado3){
            System.out.println("O menor valor identificado foi: " + dado2);
        }
        else if (dado3 < dado1 && dado3 < dado2){
            System.out.println("O menor valor identificado foi: " + dado3);
        }
        else {
            System.out.println(" ");
        }

    }

    public static void paresImpares(int dado1, int dado2, int dado3) {

        if (dado1 % 2 == 0) {//porcentagem significa resto de divisao
            System.out.println("O valor " + dado1 + " é um número par.");
        } else {
            System.out.println("O valor " + dado1 + " é um número ímpar.");
        }

        if (dado2 % 2 == 0) {
            System.out.println("O valor " + dado2 + " é um número par.");
        } else {
            System.out.println("O valor " + dado2 + " é um número ímpar.");
        }

        if (dado3 % 2 == 0) {
            System.out.println("O valor " + dado3 + " é um número par.");
        } else {
            System.out.println("O valor " + dado3 + " é um número ímpar.");
        }

    }
}

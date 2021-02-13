import java.util.Arrays;
import java.util.Random;

public class TesteRandom {

    public static void main(String[] args) {

        //Vetor
        Integer[] numeros = new Integer[50];

        //Gerar 5 numeros Aleatórios
        Random radom  = new Random();

        for(int i=0;i<50; i++) {
            int numeroTmp = radom.nextInt(20);

            /**
             * Transforma o array Integer para ArrayList e
             * utilzia o método contains para verificar
             * se o valor já existe
             */
            boolean contains = Arrays.asList(numeros).contains(numeroTmp);

            /* Caso exista informa ao usuáiro */
            if (contains) {
                System.out.println(numeroTmp+" repetido");
            }
            /**
             * Caso não exista adiciona o valor na variável
             * indicada e exibe o valor para o usuário
             */
            else {
                numeros[i] = numeroTmp;
                System.out.println(">"+numeroTmp);
            }
        }
    }
}


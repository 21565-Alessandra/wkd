import java.util.Scanner;

public class ExercicioNumerosContador {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero, contadorPar = 0, contadorImpar = 0, contadorPositivo = 0, contadorNegativo = 0;

        for (int i = 0; i < 5; i++){ // iniciaalizador; condicao; incremento
            System.out.println("Digite um numero: ");
            numero = teclado.nextInt();

            if(numero % 2 == 0) {
                contadorPar++;
            }
            else{
                contadorImpar++; // ++ eh quando soma mais 1
            }

            if(numero < 0) {
                contadorNegativo++;
            }
            if(numero > 0){
                contadorPositivo++; // ++ nesse caso eh pra dizer que eh para adicionar mais um na lista de contador positivo,
                // pq esse numero vai se encaixar nessa categoria
            }
        }

        System.out.println(contadorPar + " valor(es) par(es)");
        System.out.println(contadorImpar + " valor(es) impar(es)");
        System.out.println(contadorPositivo + " valor(es) positivo(s)");
        System.out.println(contadorNegativo + " valor(es) negativo(s)");
    }
}

//3 valor(es) par(es)
//2 valor(es) impar(es)
//1 valor(es) positivo(s)
//3 valor(es) negativo(s)

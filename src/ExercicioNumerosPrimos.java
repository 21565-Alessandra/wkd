public class ExercicioNumerosPrimos {

    public static void main(String[] args) {

        int numero = 2;

        for (int i = 2; i <= 10; i++) {

            if (ehPrimos(i)) {

                System.out.println("O valor: " + i + " eh um numero primo.");

            }

        }

    }

    public static boolean ehPrimos(int numero) {

        for (int i = 2; i <= numero; i++) {

            if (numero % i == 0) {
                return false;
            }

        }
    return true;

    }
}
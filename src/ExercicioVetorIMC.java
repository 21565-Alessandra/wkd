import java.util.Scanner;

    public class ExercicioVetorIMC {

            public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);

                int pessoas = 0;
                System.out.println("Insira quantas pessoas voce deseja calcular o IMC: ");
                pessoas = new Scanner(System.in).nextInt();

                int vetor[] = new int[pessoas]; //vetor eh sempre como int?
                double[] imc = new double[pessoas];
                String[] nome = new String[pessoas];
                double peso;
                double altura;



                for (int i = 0; i < vetor.length; i++) {
                    System.out.println("Digite o nome da pessoa " + (i + 1)); //tem como fazer sem pedir nome ou ID de cada pessoa?
                    nome[i] = new Scanner(System.in).nextLine();
                    System.out.println("Digite o peso da pessoa " + (i + 1));
                    peso = new Scanner(System.in).nextDouble();
                    System.out.println("Digite a altura da pessoa " + (i + 1));
                    altura = new Scanner(System.in).nextDouble();

                    imc[i] = peso/(altura*altura);

                    System.out.println("O IMC da pessoa " + (i + 1) + " é " + imc[i]);


                }


            }
    }









    ///////////////////////////////////////////////
    // Receba o peso e altura de 10 pessoas e mostre o IMC de cada uma delas







    /*    public static void main(String[] args){
        double weight, height;
        double BMI;

        Scanner kb = new Scanner(System.in);

        System.out.print(" Please input your weight in kg: ");
        weight = kb.nextDouble();

        System.out.print(" Please input your height in meters: ");
        height = kb.nextDouble();

        BMI = weight/(height*height);

        System.out.format(" Your BMI is %.2f\n", BMI);
    }
}

     */

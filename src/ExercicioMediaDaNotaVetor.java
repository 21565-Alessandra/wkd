import java.util.Scanner;

public class ExercicioMediaDaNotaVetor {

    public static void main(String[] args) {

        int tamanho = 0;

        System.out.println("Insira quantos alunos voce deseja calcular as notas: ");
        tamanho = new Scanner(System.in).nextInt();

        String[] aluno = new String[tamanho];
        //double media = 0.0;
        double[] media = new double[tamanho];
        double nota_1;
        double nota_2;
        double nota_3;
        double soma = 0.0;


        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1));
            aluno[i] = new Scanner(System.in).nextLine();
            System.out.println("Digite a primeira nota do aluno " + (i + 1));
            nota_1 = new Scanner(System.in).nextDouble();
            System.out.println("Digite a segunda nota do aluno " + (i + 1));
            nota_2 = new Scanner(System.in).nextDouble();
            System.out.println("Digite a terceira nota do aluno " + (i + 1));
            nota_3 = new Scanner(System.in).nextDouble();

            soma = nota_1 + nota_2 + nota_3;
            media[i] = soma / 3.0;

            System.out.println("A media do aluno " + aluno[i] + " é " + media[i]);

        }


        for (int i = 0; i < tamanho; i++) {
            if (media[i] <= 4) {
                System.out.println("O aluno " + aluno[i] + " está !!!REPROVADO!!! ");
            } else if (media[i] > 4 && media[i] <= 7) {
                System.out.println("O aluno " + aluno[i] + " está ---RECUPERAÇÃO--- ");
            } else {
                System.out.println("O aluno " + aluno[i] + " está ***APROVADO*** ");
            }


        }
    }

}

//Faça um Programa que peça 3 notas de quantos alunos o professor desejar, calcule e armazene
//num vetor a média de cada aluno, se a nota dele for <= 4 ele está reprovado, se a nota > 4 e <= 7 recuperação,
// e > 7 aprovado.

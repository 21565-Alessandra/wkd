import java.util.Scanner;

public class ExercicioIdade {

    public static void main(String[] args) {

        final int N = 10;
        int[] idade=new int[N];
        int total = 0, acimaDaMedia = 0, abaixoDaMedia = 0;
        int maxIdade = 0, minIdade = 0;

        Scanner teclado =new Scanner(System.in);

        for( int i= 0; i < idade.length; i++ )
        {
            System.out.print("Insira a idade do aluno " + (i+1) + " : ");
            idade[i] = teclado.nextInt();
            total += idade[i];
            if(i==0){
                maxIdade=minIdade=idade[i];
            }
            else{
                if(idade[i] > maxIdade)
                    maxIdade = idade[i];
                else if (idade[i] < maxIdade)
                    maxIdade = idade[i];
            }
        }
        double average = (double)total/N;
        System.out.println("A media de idade de " + N + " pessoas é: " + average);
        System.out.println("Idade maxima é: " + maxIdade);
        System.out.println("Idade minima é: " + minIdade);

        for( int i= 0; i < idade.length; i++ )
        {
            //Compare if heights[i] is below or above average,
            //if  heights[i] is greater than average, the increase aboveAveCounter by 1
            //if  heights[i] is below than average, the increase belowAveCounter by 1
            if (idade[i]>=average)
                acimaDaMedia++;
            else
                abaixoDaMedia++;
        }
    }


}


//2)	Leia a idade de 10 pessoas e exiba a média das idades.
//Dica ( x += idade) -> x = x + idade. Depois do laço é calculado a média.

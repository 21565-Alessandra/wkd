import java.util.Scanner;

public class ExercicioSalario {

    public static void main(String[] args) {

        int tamanho = 0;

        System.out.println("Insira quantos funcionarios voce deseja consultar o salario: ");
        tamanho = new Scanner(System.in).nextInt();

        String[] funcionario = new String[tamanho];
        double[] salario = new double[tamanho];
        double aliquota_inss = 0.0;
        double aliquota_irrf = 0.0;
        double deducao_irrf = 0.0;
        double[] salario_liquido = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o nome do funcionario " + (i + 1));
            funcionario[i] = new Scanner(System.in).nextLine();
            System.out.println("Digite o salario do funcionario " + (i + 1));
            salario[i] = new Scanner(System.in).nextDouble();
        }

        for (int i = 0; i < tamanho; i++) {
            if (salario[i] <= 1045) {
                aliquota_inss = 7.5 / 100.0;
            } else if (salario[i] > 1045 && salario[i] <= 2089.60) {
                aliquota_inss = 9 / 100.0;
            } else if (salario[i] > 2089.60 && salario[i] <= 3134.40) {
                aliquota_inss = 12 / 100.0;
            } else {
                aliquota_inss = 14 / 100.0;
            }

            if (salario[i] <= 1903.98) {
                aliquota_irrf = 0;
                deducao_irrf = 0;
            } else if (salario[i] > 1903.98 && salario[i] <= 2826.65) {
                aliquota_irrf = 7.5 / 100.0;
                deducao_irrf = 142.80;
            } else if (salario[i] > 2826.65 && salario[i] <= 3751.05) {
                aliquota_irrf = 15 / 100.0;
                deducao_irrf = 345.80;
            } else if (salario[i] > 3751.05 && salario[i] <= 4664.68) {
                aliquota_irrf = 22.5 / 100.0;
                deducao_irrf = 636.13;
            } else {
                aliquota_irrf = 27.5 / 100.0;
                deducao_irrf = 869.36;
            }

            salario_liquido[i] = salario[i] - (salario[i] * aliquota_inss) - (salario[i] * aliquota_irrf - deducao_irrf);

        }

        for (int i = 0; i < tamanho; i++) { // dentro de for nunca usa apenas igual =. i > ou < ou >= ou <= ou =!
            System.out.println("O salario liquido de " + funcionario[i] + " é de R$ " + salario_liquido[i]);

        }
    }

}


/*Leia o nome e o salário bruto de 10 funcionários,
em seguida, calcule o salário líquido(descontos de inss e imposto de renda retido na fonte)
e exiba na tela o nome e o salário líquido
 */
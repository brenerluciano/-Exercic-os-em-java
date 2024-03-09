import java.util.Scanner;

public class Exercicío13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor da hora de trabalho
        System.out.print("Digite o valor da hora de trabalho: ");
        double valorHora = scanner.nextDouble();

        // Solicita o número de horas trabalhadas no mês
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        // Solicita o percentual de desconto do INSS
        System.out.print("Digite o percentual de desconto do INSS (em %): ");
        double descontoINSS = scanner.nextDouble();

        // Calcula o salário bruto
        double salarioBruto = valorHora * horasTrabalhadas;

        // Calcula o valor do desconto do INSS
        double valorDescontoINSS = (descontoINSS / 100) * salarioBruto;

        // Calcula o salário líquido
        double salarioLiquido = salarioBruto - valorDescontoINSS;

        // Exibe o resultado
        System.out.printf("Salário Bruto: %.2f R$" , salarioBruto);
        System.out.printf("\n Desconto do INSS: %.2f R$" , valorDescontoINSS);
        System.out.printf("\n Salário Líquido: %.2f R$" , salarioLiquido);

        scanner.close();
    }
}
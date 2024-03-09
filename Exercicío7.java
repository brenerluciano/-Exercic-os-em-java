import java.util.Scanner;

public class Exercicío7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o salário
        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();

        // Calcula o reajuste (7%)
        double reajuste = (salario * 7) / 100;


        // Calcula o novo salário
        double novoSalario = salario + reajuste;

        // Exibe o resultado
        System.out.printf("\n\nRESULTADO: ");
        System.out.printf("\n O Reajusate foi: R$ " + reajuste);
        System.out.printf("\n O salário reajustado é: R$ %.2f%n", novoSalario);
        

        scanner.close();
    }
}
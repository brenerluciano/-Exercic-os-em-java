import java.util.Scanner;

public class Exercicío5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o valor em dólar
        System.out.print("Digite o valor em dólar (US$): ");
        double valorDolar = scanner.nextDouble();

        // Define a cotação
        double cotacao = 4.95;

        // Calcula o valor em reais
        double valorReais = valorDolar * cotacao;

        // Exibe o resultado
        System.out.printf("Valor em reais R$: %.2f%n", valorReais);

        scanner.close();
    }
}
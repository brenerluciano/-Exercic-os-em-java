import java.util.Scanner;

public class Exercicío9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o raio do círculo
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        // Calcula a área do círculo
        double area = Math.PI * Math.pow(raio, 2);

        // Exibe o resultado
        System.out.printf("A área do círculo é: %.2f%n", area);

        scanner.close();
    }
}
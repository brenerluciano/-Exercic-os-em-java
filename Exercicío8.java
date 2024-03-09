import java.util.Scanner;

public class Exercicío8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Lê a quantidade em metros
        System.out.print("Digite a quantidade em metros: ");
        float metros = entrada.nextFloat();

        // Calcula a quantidade em centímetros
        float centimetros = metros * 100;

        // Exibe o resultado
        System.out.printf("%.1f cm%n", centimetros);

        entrada.close();
    }
}
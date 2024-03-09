import java.util.Scanner;

public class Exercicío14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os valores de A e B
        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        // Realiza a troca usando uma variável temporária
        int temp = a;
        a = b;
        b = temp;

        // Exibe os valores após a troca
        System.out.println("\nValores após a troca:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        scanner.close();
    }
}
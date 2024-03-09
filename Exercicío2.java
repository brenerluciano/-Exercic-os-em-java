import java.util.Scanner;

public class Exercicío2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dividendo (X): ");
        int x = scanner.nextInt();

        System.out.print("Digite o divisor (Y): ");
        int y = scanner.nextInt();

        int resto = x % y;

        System.out.println("O resto da divisão entre " + x + " e " + y + " é: " + resto);

        scanner.close();
    }
}
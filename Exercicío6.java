import java.util.Scanner;

public class Exercicío6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a idade em anos
        System.out.print("Digite a sua idade em anos: ");
        int idadeAnos = scanner.nextInt();

        // Calcula os dias vividos
        int diasVividos = idadeAnos * 365;

        // Exibe o resultado
        System.out.println("Você já viveu aproximadamente " + diasVividos + " dias.");

        scanner.close();
    }
}
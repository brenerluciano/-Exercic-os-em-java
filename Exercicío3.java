import java.util.Scanner;

public class Exercicío3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu primeiro nome: ");
         String nome = scanner.next();

        System.out.printf("Olá, " + nome + "! Bem-vindo(a) ao nosso programa \n Vamos juntos desbravar esse novo caminho. \n");

        scanner.close();
    }
}
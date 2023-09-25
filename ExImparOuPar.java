import java.util.Scanner;

public class ExImparOuPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println("O número " +num+ " é PAR!");
        } else {
            System.out.println("O número " +num+ " é ÍMPAR!");
        }
        scanner.close();
    }
}
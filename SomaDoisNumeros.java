import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double soma = num1 + num2;

        System.out.println("A soma dos números é: " +soma);

        scanner.close();
    }
}
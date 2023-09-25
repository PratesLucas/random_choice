import java.util.Scanner;

public class ExemploIf {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 0){
            System.out.print("O número " +numero+ " é positivo.");
        } else if (numero < 0){
            System.out.print("O número " +numero+ " é negativo.");
        } else{
            System.out.print("O número é zero.");
        }
        scanner.close();
    }
}
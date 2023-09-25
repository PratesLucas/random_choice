import java.util.Random;
import java.util.Scanner;

public class NumerosRandomicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randnum = random.nextInt(100) + 1;

        int count = 0, tentativas = 1;
        while (count == 0){
            System.out.print("Dê o seu palpite do número gerado (entre 1 e 100): ");
            int palpite = scanner.nextInt();

            if (palpite < randnum){
                System.out.println("O número é MAIOR!");
                tentativas++;
            } else if (palpite > randnum){
                System.out.println("O número é MENOR!");
                tentativas++;
            } else{
                System.out.println("PARABÉNS! Você acertou o número!!");
                System.out.println("Você acertou em " +tentativas+ " tentativas!");
                count = 1;
            }
        }
    }
}

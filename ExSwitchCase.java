import java.util.Scanner;

public class ExSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int num = scanner.nextInt();
        String diaSemana = "";
        switch (num){
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda-feira";
                break;
            case 3:
                diaSemana = "Terça-feira";
                break;
            case 4:
                diaSemana = "Quarta-feira";
                break;
            case 5:
                diaSemana = "Quinta-feira";
                break;
            case 6:
                diaSemana = "Sexta-feira";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                System.out.println("O dia é inválido!");
                break;
        }
        System.out.println("O número " +num+ " corresponde a " + diaSemana);
        scanner.close();
    }
}

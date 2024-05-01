import java.util.Scanner;

public class SalarioProfessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PRECO_NIVEL_1 = 12.00;
        final double PRECO_NIVEL_2 = 17.00;
        final double PRECO_NIVEL_3 = 25.00;

        System.out.println("Digite o nível do professor (1, 2 ou 3):");
        int nivel = scanner.nextInt();

        System.out.println("Digite o número de horas/aula trabalhadas:");
        int horas = scanner.nextInt();

        double salario = 0;
        switch (nivel) {
            case 1:
                salario = horas * PRECO_NIVEL_1;
                break;
            case 2:
                salario = horas * PRECO_NIVEL_2;
                break;
            case 3:
                salario = horas * PRECO_NIVEL_3;
                break;
            default:
                System.out.println("Nível inválido. Por favor, digite 1, 2 ou 3.");
                break;
        }

        if (salario > 0) {
            System.out.printf("O salário do professor é R$%.2f\n", salario);
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class ContadorDeSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TOTAL_PESSOAS = 56;
        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 1; i <= TOTAL_PESSOAS; i++) {
            System.out.printf("Digite o nome da pessoa %d:\n", i);
            String nome = scanner.nextLine();

            System.out.println("Digite o sexo da pessoa (M para Homem, F para Mulher):");
            String sexo = scanner.nextLine().trim().toUpperCase();

            if (sexo.equals("M")) {
                totalHomens++;
                System.out.println("Nome: " + nome + " - Sexo: Homem");
            } else if (sexo.equals("F")) {
                totalMulheres++;
                System.out.println("Nome: " + nome + " - Sexo: Mulher");
            } else {
                System.out.println("Entrada inválida. Por favor, digite M para Homem ou F para Mulher.");
                i--;
            }
        }

        System.out.println("\nTotal de Homens: " + totalHomens);
        System.out.println("Total de Mulheres: " + totalMulheres);

        scanner.close();
    }
}

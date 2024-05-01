import java.util.Scanner;

public class ContagemPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TOTAL_PESSOAS = 56; 
        int totalHomens = 0;         
        int totalMulheres = 0;        

        for (int i = 1; i <= TOTAL_PESSOAS; i++) {
            System.out.printf("Digite o nome da pessoa %d:\n", i);
            String nome = scanner.nextLine();

            System.out.println("Digite o sexo da pessoa (M para homem, F para mulher):");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);

            if (sexo == 'M') {
                totalHomens++;
                System.out.println("Nome: " + nome + " - Sexo: Homem");
            } else if (sexo == 'F') {
                totalMulheres++;
                System.out.println("Nome: " + nome + " - Sexo: Mulher");
            } else {
                System.out.println("Sexo inválido. Por favor, digite apenas 'M' ou 'F'.");
                i--; 
            }
        }

        System.out.println("\nTotal de Homens: " + totalHomens);
        System.out.println("Total de Mulheres: " + totalMulheres);

        scanner.close();
    }
}

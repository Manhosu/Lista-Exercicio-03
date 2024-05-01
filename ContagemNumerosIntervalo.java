import java.util.Scanner;

public class ContagemNumerosIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0; // Inicializa o contador de números dentro do intervalo

        // Total de números a serem lidos
        final int TOTAL_NUMEROS = 80;

        System.out.println("Digite 80 números:");

        for (int i = 0; i < TOTAL_NUMEROS; i++) {
            System.out.printf("Número %d: ", i + 1);
            int numero = scanner.nextInt();

            // Verifica se o número está dentro do intervalo de 10 a 150, inclusive
            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }

        // Informa quantos números estão dentro do intervalo especificado
        System.out.println("Quantidade de números entre 10 e 150 (inclusive): " + contador);

        // Fecha o scanner
        scanner.close();
    }
}

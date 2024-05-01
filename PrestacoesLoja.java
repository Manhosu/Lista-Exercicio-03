import java.util.Scanner;

public class PrestacoesLoja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o valor total da compra
        System.out.println("Informe o valor total da compra:");
        double valorTotal = scanner.nextDouble();

        // Calcula o valor de cada uma das cinco prestações
        double valorPrestacao = valorTotal / 5;

        // Exibe o valor das prestações
        System.out.printf("O valor de cada prestação (em 5 vezes sem juros) é de R$ %.2f\n", valorPrestacao);

        // Fecha o scanner
        scanner.close();
    }
}

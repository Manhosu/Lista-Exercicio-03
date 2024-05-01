import java.util.Scanner;

public class PrestacoesLoja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor total da compra:");
        double valorTotal = scanner.nextDouble();

        double valorPrestacao = valorTotal / 5;

        System.out.printf("O valor de cada prestação (em 5 vezes sem juros) é de R$ %.2f\n", valorPrestacao);

        scanner.close();
    }
}

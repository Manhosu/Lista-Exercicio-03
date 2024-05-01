import java.util.Scanner;

public class CalculadoraPrecoVenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o preço de custo do produto
        System.out.println("Digite o preço de custo do produto:");
        double precoCusto = scanner.nextDouble();

        // Solicita ao usuário o percentual de acréscimo
        System.out.println("Digite o percentual de acréscimo (%):");
        double percentualAcrescimo = scanner.nextDouble();

        // Calcula o valor de acréscimo
        double acrescimo = precoCusto * (percentualAcrescimo / 100);

        // Calcula o preço de venda
        double precoVenda = precoCusto + acrescimo;

        // Exibe o preço de venda
        System.out.printf("O preço de venda do produto será de R$ %.2f\n", precoVenda);

        // Fecha o scanner
        scanner.close();
    }
}

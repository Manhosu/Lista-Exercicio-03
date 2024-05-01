import java.util.Scanner;

public class CalculadoraPrecoVenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço de custo do produto:");
        double precoCusto = scanner.nextDouble();

        System.out.println("Digite o percentual de acréscimo (%):");
        double percentualAcrescimo = scanner.nextDouble();

        double acrescimo = precoCusto * (percentualAcrescimo / 100);

        double precoVenda = precoCusto + acrescimo;

        System.out.printf("O preço de venda do produto será de R$ %.2f\n", precoVenda);

        scanner.close();
    }
}

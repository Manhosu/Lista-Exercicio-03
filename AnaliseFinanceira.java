import java.util.Scanner;

public class AnaliseFinanceira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TOTAL_PRODUTOS = 40;
        double somaCusto = 0, somaVenda = 0;

        for (int i = 1; i <= TOTAL_PRODUTOS; i++) {
            System.out.printf("Digite o preço de custo do produto %d: ", i);
            double precoCusto = scanner.nextDouble();

            System.out.printf("Digite o preço de venda do produto %d: ", i);
            double precoVenda = scanner.nextDouble();

            somaCusto += precoCusto;
            somaVenda += precoVenda;

            if (precoVenda > precoCusto) {
                System.out.println("Produto " + i + ": Lucro");
            } else if (precoVenda < precoCusto) {
                System.out.println("Produto " + i + ": Prejuízo");
            } else {
                System.out.println("Produto " + i + ": Empate");
            }
        }

        double mediaCusto = somaCusto / TOTAL_PRODUTOS;
        double mediaVenda = somaVenda / TOTAL_PRODUTOS;

        System.out.printf("Média de preço de custo: R$%.2f\n", mediaCusto);
        System.out.printf("Média de preço de venda: R$%.2f\n", mediaVenda);

        scanner.close();
    }
}

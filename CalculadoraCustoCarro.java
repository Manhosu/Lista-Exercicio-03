import java.util.Scanner;

public class CalculadoraCustoCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Percentagem do distribuidor e impostos
        final double PERCENTAGEM_DISTRIBUIDOR = 0.28;
        final double IMPOSTOS = 0.45;

        System.out.println("Digite o custo de fábrica do carro:");
        double custoFabrica = scanner.nextDouble();

        double valorImpostos = custoFabrica * IMPOSTOS;

        double custoPosImpostos = custoFabrica + valorImpostos;

        double valorDistribuidor = custoPosImpostos * PERCENTAGEM_DISTRIBUIDOR;

        double custoConsumidor = custoPosImpostos + valorDistribuidor;

        System.out.printf("O custo ao consumidor do carro será de R$ %.2f\n", custoConsumidor);

        scanner.close();
    }
}

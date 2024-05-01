import java.util.Scanner;

public class ConversorDolarReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cotação atual do dólar (quantos reais vale 1 dólar):");
        double cotacaoDolar = scanner.nextDouble();

        System.out.println("Digite a quantidade de dólares que você deseja converter:");
        double quantidadeDolares = scanner.nextDouble();

        double valorReais = quantidadeDolares * cotacaoDolar;

        System.out.printf("US$ %.2f dólares a uma cotação de R$ %.2f corresponde a R$ %.2f reais.\n", quantidadeDolares, cotacaoDolar, valorReais);

        scanner.close();
    }
}

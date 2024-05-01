import java.util.Scanner;

public class ConversorDolarReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o valor da cotação do dólar
        System.out.println("Digite a cotação atual do dólar (quantos reais vale 1 dólar):");
        double cotacaoDolar = scanner.nextDouble();

        // Solicita ao usuário a quantidade de dólares que ele possui
        System.out.println("Digite a quantidade de dólares que você deseja converter:");
        double quantidadeDolares = scanner.nextDouble();

        // Realiza a conversão dos dólares para reais
        double valorReais = quantidadeDolares * cotacaoDolar;

        // Exibe o resultado da conversão
        System.out.printf("US$ %.2f dólares a uma cotação de R$ %.2f corresponde a R$ %.2f reais.\n", quantidadeDolares, cotacaoDolar, valorReais);

        // Fecha o scanner
        scanner.close();
    }
}

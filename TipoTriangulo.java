import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo os lados do triângulo
        System.out.println("Digite o primeiro lado do triângulo:");
        int lado1 = scanner.nextInt();
        System.out.println("Digite o segundo lado do triângulo:");
        int lado2 = scanner.nextInt();
        System.out.println("Digite o terceiro lado do triângulo:");
        int lado3 = scanner.nextInt();

        // Verificando se pode formar um triângulo
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            // Identificando o tipo de triângulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Os lados formam um triângulo Equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Os lados formam um triângulo Isósceles.");
            } else {
                System.out.println("Os lados formam um triângulo Escaleno.");
            }
        } else {
            System.out.println("Os valores informados não podem formar um triângulo.");
        }

        scanner.close();
    }
}

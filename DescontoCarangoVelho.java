import java.util.Scanner;

public class DescontoCarangoVelho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCarrosAte2000 = 0;
        int totalCarros = 0;
        String continuar;

        do {
            System.out.println("Digite o preço do carro:");
            double preco = scanner.nextDouble();

            System.out.println("Digite o ano do carro:");
            int ano = scanner.nextInt();

            double desconto;
            if (ano <= 2000) {
                desconto = preco * 0.12; 
                totalCarrosAte2000++;
            } else {
                desconto = preco * 0.07;  
            }

            double precoFinal = preco - desconto;
            System.out.printf("Desconto: R$%.2f\n", desconto);
            System.out.printf("Preço a pagar: R$%.2f\n", precoFinal);

            totalCarros++;

            System.out.println("Deseja continuar calculando desconto? (S) Sim (N) Não");
            continuar = scanner.next().toUpperCase();
        } while (continuar.equals("S"));

        System.out.println("Total de carros com ano até 2000: " + totalCarrosAte2000);
        System.out.println("Total de carros analisados: " + totalCarros);

        scanner.close();
    }
}
 
    


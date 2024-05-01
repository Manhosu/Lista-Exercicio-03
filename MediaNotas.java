import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite a nota da primeira prova:");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Digite a nota da segunda prova:");
        double nota2 = scanner.nextDouble();
        
        System.out.println("Digite a nota da terceira prova:");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("O aluno %s tem uma média de %.2f\n", nome, media);
        
        scanner.close();
    }
}

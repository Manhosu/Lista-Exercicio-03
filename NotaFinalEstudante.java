import java.util.Scanner;

public class NotaFinalEstudante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pesos das notas
        final int PESO_LABORATORIO = 2;
        final int PESO_SEMESTRAL = 3;
        final int PESO_FINAL = 5;

        // Solicitação das notas
        System.out.println("Digite a nota do trabalho de laboratório (0 a 10):");
        double notaLaboratorio = scanner.nextDouble();

        System.out.println("Digite a nota da avaliação semestral (0 a 10):");
        double notaSemestral = scanner.nextDouble();

        System.out.println("Digite a nota do exame final (0 a 10):");
        double notaFinal = scanner.nextDouble();

        // Cálculo da média ponderada
        double notaFinalEstudante = (notaLaboratorio * PESO_LABORATORIO + 
                                     notaSemestral * PESO_SEMESTRAL + 
                                     notaFinal * PESO_FINAL) / 
                                     (PESO_LABORATORIO + PESO_SEMESTRAL + PESO_FINAL);

        // Exibindo a nota final
        System.out.printf("A nota final do estudante é: %.2f\n", notaFinalEstudante);

        scanner.close();
    }
}

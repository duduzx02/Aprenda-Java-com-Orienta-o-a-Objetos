import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double notaDoFilme = 0;
        double mediaAvaliacao = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Qual sua avalição do filme? de 0 a 10: ");
            notaDoFilme = leitura.nextDouble();
            mediaAvaliacao += notaDoFilme;
        }

        System.out.println("Média de avaliação: " + mediaAvaliacao/3);


    }
}

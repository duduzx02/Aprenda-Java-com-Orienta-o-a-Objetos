import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double notaDoFilme = 0;
        int mediaAvaliacao = 0;
        int contador = 0 ;

        while (notaDoFilme != -1) {
            System.out.print("Qual sua avalição do filme? de 0 a 10: (-1 para encerrar;): ");
            notaDoFilme = leitura.nextDouble();
            if(notaDoFilme != -1){
            mediaAvaliacao += notaDoFilme;
            contador++;
            }
        }

        System.out.println("Média de avaliação: " + mediaAvaliacao/contador);


    }
}

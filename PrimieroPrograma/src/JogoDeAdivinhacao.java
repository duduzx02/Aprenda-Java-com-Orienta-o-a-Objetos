import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int contador = 0;
        int meuNumero = 0;

        while(meuNumero != numeroAleatorio){
            System.out.println("Digite um número entre 0 e 100: ");
            meuNumero = scan.nextInt();
            if (meuNumero > numeroAleatorio){
                System.out.println("Menos");
            } else if(meuNumero < numeroAleatorio){
                System.out.println("Mais");
            } else {
                System.out.println("Parabéns você acertou!!!");
                System.out.println("O número aleátorio escolhido " + numeroAleatorio + " e o número que você escolheu por " +
                        "último " + meuNumero);
            }
            contador++;
        }
        System.out.println("Numeros de tentativas: " + contador);


    }
}

public class Operadores {
    public static void main(String[] args) {
        int a = 10 + 5; // Atribui o valor 15 à variável a
        int b = 10 - 5; // Atribui o valor 5 à variável b
        int c = 10 * 5; // Atribui o valor 50 à variável c
        int d = 10 / 5; // Atribui o valor 2 à variável d
        int e = 10 % 3; // Atribui o valor 1 à variável e (o resto da divisão de 10 por 3 é 1)
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        int aa = 10; // Atribui o valor 10 à variável a
        int bb = 5; // Atribui o valor 5 à variável b
        int cc = 30; // Atribui o valor 30 à variável c

        boolean igual = (bb == aa); //Nesse caso a variável igual ficará com o valor *false*, pois o valor de b não é
        // igual o valor de a.
        boolean diferente = (bb != cc); //A variável diferente ficará com o valor *true*, pois o valor de b é
        // diferente do valor de c.
        boolean maior = (bb > aa); //A variável maior ficará com o valor *false*, pois o valor de b é menor que o
        // valor de a.
        boolean menorIgual = (bb <= cc); //A variável menorIgual ficará com o valor *true*, pois o valor de b é menor
        // que o valor de c.

        System.out.println(igual);
        System.out.println(diferente);
        System.out.println(maior);
        System.out.println(menorIgual);


        int num = 5;
        int resultado = ++num; //num é incrementado para 6 e depois atribuído a resultado
        System.out.println(num); // imprime 6
        System.out.println(resultado); // imprime 6


        int numm = 5;
        int resultadoo = numm++; //num é atribuído primeiramente à variável resultado e depois incrementado para 6
        System.out.println(numm); // imprime 6
        System.out.println(resultadoo); // imprime 5


    }
}

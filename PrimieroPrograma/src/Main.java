public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean includoNoPlano = true;
        double notaDoFilme = 8.1;

        // Médias calculada pelas 3 notas do Eduardo, Augusto e Lívia
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento    
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificao = (int) (media / 2);
        System.out.println(classificao);
    }
}
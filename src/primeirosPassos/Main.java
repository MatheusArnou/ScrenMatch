package primeirosPassos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        //System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        //System.out.println("Ano de lançameto: "+anoDeLancamento);
        String sinopse;
        sinopse = """
                Filme: Top Gun
                Filme de aventura com galã dos anos 90
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        double media = (9.8+6.3+8.8)/3;
        int classificaFilme = (int) (media /2);
    }
}
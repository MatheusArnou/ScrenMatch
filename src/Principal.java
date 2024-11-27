import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.Recomendacao;
import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Poderoso chefão");
        meuFilme.setAnoLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.ExibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(9);
        // 3 notas, soma total = 22
        //como é feito atualmente com o método Get
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Nota final: " + meuFilme.mediaAvaliacao());
//        Como era feito antes de alterar o acesso do atributo
//        meuFilme.somaAvaliacao = 10;
//        meuFilme.totalDeAvaliacoes = 1;
// System.out.println(meuFilme.mediaAvaliacao());
        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancamento(2000);
        lost.ExibirFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpPorTemporadas(10);
        lost.setMinutosPorEp(15);
        System.out.println("Duração para maratonar: " + lost.getDuracaoEmMinutos());


        Filme OutroFilme = new Filme();
        OutroFilme.setNome("Avatar");
        OutroFilme.setAnoLancamento(2023);
        OutroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(OutroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        Recomendacao filtro = new Recomendacao();
        filtro.filtra(meuFilme);

        Episodio ep = new Episodio();
        ep.setNumero(1);
        ep.setSerie(lost);
        ep.setTotalVisualizacoes(100);

        filtro.filtra(ep);

        Filme filmeDoMatheus = new Filme();
        filmeDoMatheus.setNome("Dogville");
        filmeDoMatheus.setDuracaoEmMinutos(200);
        filmeDoMatheus.setAnoLancamento(2003);
        filmeDoMatheus.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();




    }
}

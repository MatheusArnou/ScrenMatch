package br.com.alura.screenmatch.modelo;

public class Filme {

    public String nome;
    int anoLancamento;
    boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    public void ExibirFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração do filme: " + duracaoEmMinutos);
    }

    public void avalia(double nota) {
        somaAvaliacao += nota;
        totalDeAvaliacoes++;
    }

    public double mediaAvaliacao() {
        return somaAvaliacao / totalDeAvaliacoes;
    }

    public int getTotalDeAvaliacoes (){
        return totalDeAvaliacoes;
    }

}

public class Filme {

    String nome;
    int anoLancamento;
    boolean incluidoNoPlano;
    double somaAvaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void ExibirFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração do filme: " + duracaoEmMinutos);
    }

    void avalia(double nota) {
        somaAvaliacao += nota;
        totalDeAvaliacoes++;
    }

    double mediaAvaliacao() {
        return somaAvaliacao / totalDeAvaliacoes;
    }

}

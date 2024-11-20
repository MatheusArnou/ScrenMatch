package primeirosPassos.desafioPoo;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int totAvaliacoes;

    void ExibirFicha() {
        String ficha = """
                Ficha da Música:
                ----------------
                Artista: %s
                Título: %s
                Ano de lançamento: %d
                Média de Avaliação: %.2f (%d avaliações)
                """.formatted(artista, titulo, anoDeLancamento, mediaAvaliacao(), totAvaliacoes);

        System.out.println(ficha);
    }

    // Método para adicionar uma nova avaliação
    void Avalia(double nota) {
        avaliacao += nota; // Soma a nota à avaliação total
        totAvaliacoes++;   // Incrementa o total de avaliações
    }

    // Método para calcular a média das avaliações
    double mediaAvaliacao() {
        return totAvaliacoes == 0 ? 0 : avaliacao / totAvaliacoes;
    }
}
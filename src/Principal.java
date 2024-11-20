import br.com.alura.screenmatch.modelo.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Poderoso chefão";
        meuFilme.anoLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.ExibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(9);
        // 3 notas, soma total = 22
        //como é feito atualmente com o método Get
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
//        Como era feito antes de alterar o acesso do atributo
//        meuFilme.somaAvaliacao = 10;
//        meuFilme.totalDeAvaliacoes = 1;
// System.out.println(meuFilme.mediaAvaliacao());

    }
}

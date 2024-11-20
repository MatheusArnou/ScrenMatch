import primeirosPassos.desafioPoo.Aluno;

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
        System.out.println(meuFilme.somaAvaliacao);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.mediaAvaliacao());
    }
}

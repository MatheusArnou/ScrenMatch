package primeirosPassos.Desafios.desafioEncapsulamento;

public class Principal {
    public static void main(String[] args) {
//        IdadePessoa pessoa = new IdadePessoa();
//        pessoa.setNome("Matheus");
//        pessoa.setIdade(15);
//        pessoa.verificaIdade();



        Produto produto = new Produto();
        produto.setNome("Notebok");
        produto.setPreco(1000);
        double precoComDesconto = produto.aplicarDesconto();


        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor original R$: " + produto.getPreco());
        System.out.println("Valor com desconto R$: " + precoComDesconto);

        Livro livro = new Livro();
        livro.setAutor("Flavio Augusto");
        livro.setTitulo("Geração de valor");
        livro.exibirDetalhes();

    }


}

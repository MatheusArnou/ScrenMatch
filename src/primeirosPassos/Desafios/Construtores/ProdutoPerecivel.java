package primeirosPassos.Desafios.Construtores;

public class ProdutoPerecivel extends Produto{
    private String dataDeValidade;


    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataDeValidade) {
        super(nome, preco, quantidade);
        this.dataDeValidade = dataDeValidade;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }
    @Override
    public String toString() {
        return "Produto: " + this.getNome() + " | R$ " + this.getPreco() + " | quantidade " + this.getQuantidade() + " | Data de validade: " + this.getDataDeValidade();
    }
}

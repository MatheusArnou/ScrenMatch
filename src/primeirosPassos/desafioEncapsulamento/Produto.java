package primeirosPassos.desafioEncapsulamento;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double aplicarDesconto(){
        double desconto;
        if(preco >= 1000){
            desconto = preco - (preco * 10/100);
        } else {
            desconto = preco - (preco * 5/100);
        }
        return desconto;
    }
}

package primeirosPassos.Desafios.dasafioComInterface.PrecoProduto;

public class Livro implements Calculavel {

    @Override
    public void calcularPrecoFinal(double preco) {
        System.out.println("O preço do seu produto é: " + preco);
    }
}

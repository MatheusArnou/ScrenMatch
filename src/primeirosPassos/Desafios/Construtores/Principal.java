package primeirosPassos.Desafios.Construtores;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("iPhone 16 Pro", 8999.87, 2);
        Produto produto2 = new Produto("PlayStation 5", 2398.87, 6);
        Produto produto3 = new Produto("TV Samsung 50'", 1978.88, 10);

        ProdutoPerecivel produtoP = new ProdutoPerecivel("Pão de queijo",11.99,50,"30/11/2024");
        ProdutoPerecivel produtoP2 = new ProdutoPerecivel("Mussarela 100g",7.85,100,"12/12/2024");
        ProdutoPerecivel produtoP3 = new ProdutoPerecivel("Mortandela 100g",5.79,150,"1/12/2024");


        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        ArrayList<ProdutoPerecivel> listaProdutosP = new ArrayList<>();
        listaProdutosP.add(produtoP);
        listaProdutosP.add(produtoP2);
        listaProdutosP.add(produtoP3);



        System.out.println("Tamanho da lista: " + listaProdutos.size());
        System.out.println("Primeiro produto da lista: " + listaProdutos.get(0));
        System.out.println("No carrinho: " + listaProdutos.toString());

        System.out.println("Tamanho da lista: " + listaProdutosP.size());
        System.out.println("Primeiro produto da lista: " + listaProdutosP.get(0));
        System.out.println("No carrinho: " + listaProdutosP.toString());

    }
}

package primeirosPassos.Desafios.dasafioComInterface.Venda;

public class Produto implements Vendavel{
    int cont;
    double totalProdutos;
    @Override
    public void precoFinal(double preco) {
        cont++;
        totalProdutos += preco;
        System.out.println("Você comprou " + cont + " produto seu preço é de R$ " + preco);
    }
    public void exibir(){
        System.out.println("Total a pagar R$: " + totalProdutos);
        if(totalProdutos >= 1000){
            totalProdutos = totalProdutos - (totalProdutos * 0.10);
            System.out.println("Com desconto de 10% para compras acima de R$ 1000, o total a pagar é de R$ " + totalProdutos);
        } else {
            totalProdutos = totalProdutos - (totalProdutos * 0.05);
            System.out.println("Com desconto de 5% para compras abaixo de R$ 1000, o total a pagar é de R$ " + totalProdutos);
        }

    }


}

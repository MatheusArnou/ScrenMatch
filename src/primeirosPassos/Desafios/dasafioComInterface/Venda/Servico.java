package primeirosPassos.Desafios.dasafioComInterface.Venda;

public class Servico implements Vendavel{
    double totalProdutos;
    int i = 0;
    @Override
    public void precoFinal(double preco) {
       i++;
       System.out.println("Serviço " + i  + " cadastrado R$: " + preco);
       totalProdutos += preco;

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

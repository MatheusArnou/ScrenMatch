package primeirosPassos.Desafios.desafioHerancaEPolimorfismo.conta;

public class ContaCorrente extends ContaBancaria {
    private double taxa;


    public void Taxa() {
        taxa = 15.50;
        System.out.println("Sua taxa é de R$ 15,50, seu saldo atual é de R$ " + (saldo - taxa));
    }
}

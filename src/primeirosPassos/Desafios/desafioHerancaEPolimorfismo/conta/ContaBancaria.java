package primeirosPassos.Desafios.desafioHerancaEPolimorfismo.conta;
/*
 * Crie uma classe ContaBancaria com métodos para realizar operações bancárias
 * como depositar(), sacar() e consultarSaldo().
 * Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria.
 * Adicione um método específico para a subclasse,
 * como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.*/
public class ContaBancaria {
    protected double saldo;

    public void depositar(double deposito){
        saldo += deposito;
        System.out.println("Valor depositado R$ " + deposito );
    }

    public void sacar(double saque){
        if(saque <= saldo){
            saldo -= saque;
            System.out.println("Saque de R$ " + saque + " realizado com sucesso, saldo atual de" + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual R$ " + saldo);
    }


}

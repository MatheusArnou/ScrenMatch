package primeirosPassos.Desafios.desafioEncapsulamento;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    public String titular;

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}

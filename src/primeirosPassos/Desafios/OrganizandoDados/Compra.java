package primeirosPassos.Desafios.OrganizandoDados;

public record Compra(String descricao, double valor) implements Comparable<Compra> {

    @Override
    public String toString() {
        return "Compra: descricao = " + descricao +
                " valor =" + valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.compare(this.valor, outraCompra.valor);
    }
}

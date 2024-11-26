package primeirosPassos.Desafios.desafioHerancaEPolimorfismo.numeroPrimo;

public class GeradorPrimo extends NumerosPrimos{
    public int gerarProximoPrimo(int ultimoPrimoConhecido) {
        int proximoNumero = ultimoPrimoConhecido + 1;
        while (!verificarSeEPrimo(proximoNumero)) {
            proximoNumero++;
        }
        return proximoNumero;
    }
}

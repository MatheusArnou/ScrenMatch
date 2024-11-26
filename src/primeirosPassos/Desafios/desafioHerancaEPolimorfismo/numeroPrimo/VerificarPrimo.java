package primeirosPassos.Desafios.desafioHerancaEPolimorfismo.numeroPrimo;

public class VerificarPrimo extends NumerosPrimos{
    public void verificarSeEhPrimo(int numero) {
        if (verificarSeEPrimo(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}

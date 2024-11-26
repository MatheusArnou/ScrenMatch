package primeirosPassos.Desafios.desafioHerancaEPolimorfismo.numeroPrimo;

public class NumerosPrimos {
    public boolean verificarSeEPrimo(int numero){
        if(numero <= 1){
            return false;
        }
        for (int i = 2; i * i <= numero ; i++) {
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }
    public void listarPrimos(int limiteSuperior) {
        System.out.println("Números primos até " + limiteSuperior + ": ");
        for (int i = 2; i <= limiteSuperior; i++) {
            if (verificarSeEPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
package primeirosPassos.Desafios.desafioHerancaEPolimorfismo;

import primeirosPassos.Desafios.desafioHerancaEPolimorfismo.Carro.Carro;
import primeirosPassos.Desafios.desafioHerancaEPolimorfismo.animal.Cachorro;
import primeirosPassos.Desafios.desafioHerancaEPolimorfismo.animal.Gato;
import primeirosPassos.Desafios.desafioHerancaEPolimorfismo.conta.ContaCorrente;
import primeirosPassos.Desafios.desafioHerancaEPolimorfismo.numeroPrimo.GeradorPrimo;
import primeirosPassos.Desafios.desafioHerancaEPolimorfismo.numeroPrimo.NumerosPrimos;
import primeirosPassos.Desafios.desafioHerancaEPolimorfismo.numeroPrimo.VerificarPrimo;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.definirModelo("Sedan");
        carro.definirPrecos(5000,2500,3000);
        carro.exibirInfo();

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        System.out.println(cachorro.emitirSom());
        cachorro.abanarRabo();

        System.out.println(gato.emitirSom());
        gato.arranharMoveis();

        ContaCorrente conta = new ContaCorrente();
        conta.depositar(1500);
        conta.sacar(100);
        conta.consultarSaldo();
        conta.Taxa();

        VerificarPrimo verifica = new VerificarPrimo();
        verifica.verificarSeEPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);


        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);




    }
}

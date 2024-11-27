package primeirosPassos.Desafios.dasafioComInterface;

import primeirosPassos.Desafios.dasafioComInterface.ConverterMoeda.ConversorMoeda;
import primeirosPassos.Desafios.dasafioComInterface.PrecoProduto.Livro;
import primeirosPassos.Desafios.dasafioComInterface.PrecoProduto.ProdutoFisico;
import primeirosPassos.Desafios.dasafioComInterface.Temperatura.Conversor;
import primeirosPassos.Desafios.dasafioComInterface.Venda.Produto;
import primeirosPassos.Desafios.dasafioComInterface.Venda.Servico;
import primeirosPassos.Desafios.dasafioComInterface.calculGeometrico.CalculadoraSalaRetangular;
import primeirosPassos.Desafios.dasafioComInterface.tabuada.TabuadaMultiplicacao;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversao = new ConversorMoeda();
        conversao.setValorEmDolar(5.80);
        conversao.setValorEmReal(1000);

        System.out.println(conversao.converterDolarParaReal());

        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
        calculadora.calcularArea(5, 8); // Exemplo com altura e largura
        calculadora.calcularPerimetro(5, 8);

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(7);

        Conversor conversor = new Conversor();
        conversor.farenheitParaCelsius(180);
        conversor.celsiusParaFarenheit(40);

        Livro livro = new Livro();
        livro.calcularPrecoFinal(80.50);

        ProdutoFisico produto = new ProdutoFisico();
        produto.calcularPrecoFinal(100);

        Produto produto1 = new Produto();
        produto1.precoFinal(500);
        produto1.precoFinal(200);
        produto1.precoFinal(50);
        produto1.precoFinal(200);
        produto1.exibir();

        System.out.println("\n");

        Servico servico = new Servico();
        servico.precoFinal(1000);
        servico.precoFinal(500);
        servico.precoFinal(200);
        servico.precoFinal(300);
        servico.exibir();


    }
}

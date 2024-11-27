package primeirosPassos.Desafios.dasafioComInterface.ConverterMoeda;

public class ConversorMoeda implements ConversaoFinanceira{
    private double valorEmReal;
    private double valorEmDolar;

    public double getValorEmReal() {
        return valorEmReal;
    }

    public void setValorEmReal(double valorEmReal) {
        this.valorEmReal = valorEmReal;
    }

    public double getValorEmDolar() {
        return valorEmDolar;
    }

    public void setValorEmDolar(double valorEmDolar) {
        this.valorEmDolar = valorEmDolar;
    }


    @Override
    public double converterDolarParaReal() {
        double valorConvertido = 0;
        return valorConvertido = valorEmDolar + (valorEmReal/valorEmDolar);
    }
}

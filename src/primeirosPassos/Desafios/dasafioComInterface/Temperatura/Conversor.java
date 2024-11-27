package primeirosPassos.Desafios.dasafioComInterface.Temperatura;

public class Conversor implements ConversorTemperatura {

    double converter;

    @Override
    public void farenheitParaCelsius(double temperatura) {
        System.out.println("Vamos converter F para C: ");
        double converter = (temperatura - 32) * 5 / 9; // Fórmula correta
        System.out.println("Temperatura em graus Celsius: " + converter);
    }

    @Override
    public void celsiusParaFarenheit(double temperatura) {
        System.out.println("Vamos converter C para F: ");
        double converter = (temperatura * 9 / 5) + 32; // Fórmula correta
        System.out.println("Temperatura em graus Fahrenheit: " + converter);
    }

}

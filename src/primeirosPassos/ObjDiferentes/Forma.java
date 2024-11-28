package primeirosPassos.ObjDiferentes;

public class Forma {
    double calcularArea() {
        return 0;
    }
}

class Circulo extends Forma {
    double raio;

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

class Quadrado extends Forma {
    double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

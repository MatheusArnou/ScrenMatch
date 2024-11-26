package primeirosPassos.Desafios.desafioHerancaEPolimorfismo.animal;

public class Gato extends Animal{


    @Override
    public String emitirSom(){
        return "Miau";
    }

    public void arranharMoveis(){
        System.out.println("Vou afiar minhas unhas no seu sofá");
    }
}

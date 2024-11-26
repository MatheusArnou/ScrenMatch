package primeirosPassos.Desafios.desafioHerancaEPolimorfismo.animal;

public class Cachorro extends Animal{

    @Override
    public String emitirSom(){
        return "Au au";
    }

    public void abanarRabo(){
        System.out.println("Cachorro feliz, abanado o rabo loucamente");
    }
}

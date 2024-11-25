package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    @NotNull
//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracaoEmMinutos();
//    }


    public void inclui(Titulo t){
        System.out.println("Adicionando: "+t);
        tempoTotal += t.getDuracaoEmMinutos();
    }
}

package br.com.alura.screenmatch.modelo;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
private String diretor;

    public Filme(String nome) {
        this.setNome(nome);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) mediaAvaliacao();
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAnoLancamento() + ") ";
    }
}

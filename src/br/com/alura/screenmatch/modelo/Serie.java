package br.com.alura.screenmatch.modelo;

public class Serie extends Titulo {
    private int temporadas;
    private int epPorTemporadas;
    private boolean ativa;
    private int minutosPorEp;

    public Serie(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpPorTemporadas() {
        return epPorTemporadas;
    }

    public void setEpPorTemporadas(int epPorTemporadas) {
        this.epPorTemporadas = epPorTemporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEp() {
        return minutosPorEp;
    }

    public void setMinutosPorEp(int minutosPorEp) {
        this.minutosPorEp = minutosPorEp;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epPorTemporadas * minutosPorEp;
    }

    @Override
    public String toString() {
        return "Série: "  + this.getNome() + " ano de lançamento "+ this.getAnoLancamento()+" quantas temporadas e eps para maratonar: " + " ("+ this.getTemporadas() + ") ("+this.getEpPorTemporadas()+")";
    }
}

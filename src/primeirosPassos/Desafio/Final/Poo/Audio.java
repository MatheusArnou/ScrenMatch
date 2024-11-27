package primeirosPassos.Desafio.Final.Poo;

public class Audio implements AcoesDeMidia {
    private String titulo;
    private int duracao;
    protected int totalCurtidas = 0;
    protected int totalReproducoes = 0;
    protected int contCurtidas = 0;
    protected int contReproducoes = 0;
    private boolean pausado = true;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }


    @Override
    public void curtir(int curtida) {
        totalCurtidas += curtida;
        contCurtidas++;

    }

    public void ExibirCurtidas() {
        if (contCurtidas > 0) {
            int avaliacaoFinal = totalCurtidas / contCurtidas;
            System.out.println("Total da nota: " + totalCurtidas + ". Avaliado " + contCurtidas + " vezes. Avaliação média: " + avaliacaoFinal);
        } else {
            System.out.println("Ainda sem curtidas registradas");
        }
    }


    @Override
    public void reproduzir(boolean pausa) {
        this.pausado = pausa;
        if (pausado) {
            System.out.println("Pausado");
        } else {
            totalReproducoes++;
            System.out.println("Play");
        }
    }


    public void contagemRepro() {
        if (contReproducoes > 0) {
            System.out.println("Play");
        } else {
            System.out.println("Pausado");
        }

        System.out.println("Foi escutado " + totalReproducoes + " " + (totalReproducoes == 1 ? "reprodução" : "reproduções"));
    }

}

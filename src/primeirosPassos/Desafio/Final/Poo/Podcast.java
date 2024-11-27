package primeirosPassos.Desafio.Final.Poo;

public class Podcast extends Audio {
    private String host;
    protected String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void ficha(){
        System.out.println("| Titulo: " + getTitulo());
        System.out.println("| Host: " + getHost());
        System.out.println("| Duração: " + getDuracao());
        System.out.println("| Descrição: " + getDescricao());
        ExibirCurtidas();
        contagemRepro();

    }
}

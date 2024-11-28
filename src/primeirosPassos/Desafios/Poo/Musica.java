package primeirosPassos.Desafios.Poo;

public class Musica extends Audio{
    private String autor;
    private String produtora;
    private String album;
    private String genero;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void ficha(){
        System.out.println("| Artista: " + getAutor());
        System.out.println("| Música: " + getTitulo());
        System.out.println("| Produtora: " + getProdutora());
        System.out.println("| Album: " + getAlbum());
        System.out.println("| Duração: " + getDuracao());
        System.out.println("| Genero: " + getGenero());
        ExibirCurtidas();
        contagemRepro();
    }
}

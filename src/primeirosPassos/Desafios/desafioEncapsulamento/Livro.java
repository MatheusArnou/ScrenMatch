package primeirosPassos.Desafios.desafioEncapsulamento;

public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes(){
        System.out.println("Autor: "+ autor);
        System.out.println("Livro: "+ titulo);
    }
}

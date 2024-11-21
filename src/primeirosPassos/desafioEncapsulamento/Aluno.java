package primeirosPassos.desafioEncapsulamento;

public class Aluno {
    private String nome;
    private double nota;
    private int contNotas;

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


    public double calcularMedia(double notaMedia){
        notaMedia += nota;
        contNotas++;
        return notaMedia / contNotas;
    }
}

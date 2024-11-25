package primeirosPassos.Desafios.desafioPoo;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.exibirOla();

        Calculadora calcular = new Calculadora();
        calcular.DobrarNumero(3);
        System.out.println(calcular.RetornoNumeroDobrado());

        Musica musica = new Musica();
        musica.artista = "Alcione";
        musica.titulo = "Não deixe o Samba morrer!";
        musica.anoDeLancamento = 1998;
        musica.Avalia(8);
        musica.Avalia(9);
        musica.Avalia(5);
        musica.ExibirFicha();

        Carro carro = new Carro();
        carro.modelo = "C3";
        carro.marca = "Citroen";
        carro.anoFabricacao = 2011;
        carro.cor = "Preto";
        carro.FichaCarro();

        Aluno aluno = new Aluno();
//        aluno.nome = "Matheus";
//        aluno.idade = 27;
        aluno.pegarIdadeAluno(27);
        aluno.pegarNomeAluno("Matheus");
        aluno.exibirAluno();





    }
}

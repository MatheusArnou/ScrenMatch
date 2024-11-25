package primeirosPassos.Desafios.desafioPoo;

public class Aluno {
    String nome;
    int idade;

    void pegarNomeAluno(String nomeAluno) {
        nome = nomeAluno;
    }

    void pegarIdadeAluno(int idadeAluno) {
        idade = idadeAluno;
    }

    void exibirAluno() {
        String ficha = """
                Nome do aluno: %s   
                Idade do aluno: %d anos
                """.formatted(nome, idade);
        System.out.println(ficha);
    }
}

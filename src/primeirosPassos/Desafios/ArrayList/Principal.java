package primeirosPassos.Desafios.ArrayList;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Matheus");
        pessoa1.setIdade(27);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Juliana");
        pessoa2.setIdade(26);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Fabio");
        pessoa3.setIdade(2);


        ArrayList<Pessoa> listaPessoa = new ArrayList<>();
        listaPessoa.add(pessoa1);
        listaPessoa.add(pessoa2);
        listaPessoa.add(pessoa3);
        System.out.println("Tamanho da lista: " + listaPessoa.size());
        System.out.println("Primeira pessoa da lista: "+listaPessoa.getFirst());
        System.out.println(listaPessoa);

    }
}

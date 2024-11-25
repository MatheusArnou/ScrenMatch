package primeirosPassos.Desafios.desafioPoo;

import java.time.Year;

public class Carro {
    String modelo;
    String cor;
    String marca;
    int anoFabricacao;

    void FichaCarro(){
        String ficha = """
                Detalhes do veiculo:
                -------------------
                Marca: %s
                Modelo: %s
                Cor: %s
                Ano: %d
                Idade do veiculo: %d
               """.formatted(marca, modelo, cor,anoFabricacao, calcularIdade());
        System.out.println(ficha);
    }

    //metodo para pegar o ano do carro
    int calcularIdade(){
        int anoAtual = Year.now().getValue();
        return anoAtual - anoFabricacao;
    }



}

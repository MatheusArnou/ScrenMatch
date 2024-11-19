package primeirosPassos;

import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;
        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme, digite -1 que vamos parar a contagem: ");
            nota = leitura.nextDouble();
            if(nota > -1) {
                mediaAvaliacao = (mediaAvaliacao + nota);
                totalNotas++;
            }
        }
        System.out.println(totalNotas);
        System.out.println("Media de avaliações:" + mediaAvaliacao / totalNotas);
    }
}


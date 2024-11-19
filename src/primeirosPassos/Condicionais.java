package primeirosPassos;

public class Condicionais {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo");
        } else{
            System.out.println("Filme retro!");
        }

        if (tipoPlano.equals("plus") || incluidoNoPlano) {
            System.out.println("Bora assistir esse lançamento, acabou de sair do cinema!");
        } else {
            System.out.println("Você não tem acesso a este filme ainda");
        }
    }
}

package primeirosPassos.Desafios.Poo;

public class Principal {
    public static void main(String[] args) {
        Podcast flow = new Podcast();
        flow.setTitulo("A historia do automobilismo");
        flow.setHost("Igor");
        flow.setDuracao(180);
        flow.setDescricao("Vamos falar com Rubens Barrichello, Estágiario da F1 e Rodrigo do Splash And Go");
        flow.curtir(5);
        flow.curtir(5);
        flow.curtir(5);
        flow.reproduzir(false);
        flow.reproduzir(true);
        flow.reproduzir(false);
        flow.ficha();


        Musica dubstep = new Musica();
        dubstep.setAutor("Zomboy");
        dubstep.setTitulo("Immunity");
        dubstep.setProdutora("Never Say Die");
        dubstep.setAlbum("The Outbreak");
        dubstep.setDuracao(5);
        dubstep.setGenero("Dubstep");
        dubstep.curtir(6);
        dubstep.curtir(8);
        dubstep.curtir(8);
        dubstep.reproduzir(true);
        dubstep.reproduzir(true);
        dubstep.reproduzir(true);
        dubstep.reproduzir(true);
        dubstep.reproduzir(false);
        dubstep.reproduzir(false);
        dubstep.reproduzir(false);
        dubstep.reproduzir(false);
        dubstep.reproduzir(false);
        dubstep.ficha();




    }
}

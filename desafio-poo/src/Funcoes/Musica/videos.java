package Funcoes.Musica;

public class videos implements ReprodutorMusical {

    @Override
    public void Reproduzir() {
        System.out.println("Reproduzindo vídeo.");

    }

    @Override
    public void pausar() {
        System.out.println("Vídeo Pausado.");

    }

    @Override
    public void selecionar() {
        System.out.println("Vídeo selecionado.");

    }
}

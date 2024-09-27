package Funcoes.Musica;

public class musicas implements ReprodutorMusical {

    @Override
    public void Reproduzir() {
        System.out.println("Reproduzindo músicas");

    }

    @Override
    public void pausar() {
        System.out.println("Musíca pausada.");

    }

    @Override
    public void selecionar() {
        System.out.println("Música selecionada");

    }
}

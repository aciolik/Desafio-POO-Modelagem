package Funcoes.Telefone;

public class correioVoz implements Telefone {

    @Override
    public void ligar() {
        System.out.println("Ligando para o correio de voz");

    }

    @Override
    public void atender() {
        System.out.println("atendendo ligação do correio de voz");

    }

    @Override
    public void inciarCorreioVoz() {
        System.out.println("iniciando correio de voz");

    }
}

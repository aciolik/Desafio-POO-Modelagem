package Funcoes.Telefone;

public class contatos implements Telefone {

    @Override
    public void ligar() {
        System.out.println("Ligando para o contato x");

    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação do contato x");

    }

    @Override
    public void inciarCorreioVoz() {
        System.out.println("Ouvindo correio de voz do contato x");

    }
}

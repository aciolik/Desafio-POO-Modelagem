package Funcoes.Gerais;

import Funcoes.Internet.NavegadorInternet;
import Funcoes.Musica.ReprodutorMusical;
import Funcoes.Telefone.Telefone;

public class funcaoGeral implements NavegadorInternet, ReprodutorMusical, Telefone {


    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no Iphone");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador no Iphone");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador do Iphone");

    }

    @Override
    public void Reproduzir() {
        System.out.println("Reproduzindo música ou vídeo no Iphone");

    }

    @Override
    public void pausar() {
        System.out.println("Música ou vídeo pausado no Iphone");

    }

    @Override
    public void selecionar() {
        System.out.println("Selecionando música ou vídeo no Iphone");

    }

    @Override
    public void ligar() {
        System.out.println("Efetuando ligação no Iphone");

    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação no Iphone");

    }

    @Override
    public void inciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no Iphone.");

    }
}

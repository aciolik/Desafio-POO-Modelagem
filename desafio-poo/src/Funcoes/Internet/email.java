package Funcoes.Internet;

public class email implements NavegadorInternet {

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página do e-mail");


    }


    @Override
    public void exibirPagina() {
        System.out.println("Exibindo e-mail");


    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no aplicativo de  e-mail");
    }


}

package me.dio;

public class Iphone extends AparelhoTelefonico implements NavegadorDaInternet, ReprodutorMusical {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina da internet.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");

    }

    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música.");
    }
}

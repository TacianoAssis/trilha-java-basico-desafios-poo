package me.dio;

public abstract class AparelhoTelefonico {

    public void ligar(int numeroTelefone){
        System.out.println("Ligando para o número: " + numeroTelefone);
    }

    public void atender(){
        System.out.println("Atendendo à chamada telefônica.");
    }

    public void iniciarCorreioDeVoz(){
        System.out.println("Iniciando o correio de voz.");
    }
}

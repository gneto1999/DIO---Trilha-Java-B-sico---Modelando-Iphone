package App;
import model.entities.Iphone;

public class Programa {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Funcionalidades Telefônicas:");
        iphone.ligar("5521912349876");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println();

        System.out.println("Funcionalidades do reprodutor musical:");
        iphone.selecionarMusica("Linkin Park - Numb");
        iphone.tocar();
        iphone.pause();

        System.out.println();

        System.out.println("Funcionalidades do navegador de internet:");
        iphone.exibirPagina("https://www.google.com");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
    }
}

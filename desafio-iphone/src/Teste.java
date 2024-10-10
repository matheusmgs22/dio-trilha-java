
public class Teste {

    // main de leves pra gente testar
    public static void main(String[] args) {

        Iphone iphone = new Iphone(); // Criando uma instância de iPhone

        // Testando funcionalidade de ReprodutorMusical
        System.out.println("Reprodutor Musical:");
        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.tocar();
        iphone.pausar();

        // Testando funcionalidade de AparelhoTelefonico
        System.out.println("\nAparelho Telefônico:");
        iphone.ligar("4402-8922");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando funcionalidade de NavegadorInternet
        System.out.println("\nNavegador na Internet:");
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}

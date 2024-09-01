package poo.encapsulamento;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNmessenger msn = new MSNmessenger();
        msn.enviarMensagem();

        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMensagem();

        Telegram telegram = new Telegram();
        telegram.enviarMensagem();

    }
}

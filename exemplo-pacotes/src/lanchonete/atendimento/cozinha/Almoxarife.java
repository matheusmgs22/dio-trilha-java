package lanchonete.atendimento.cozinha;

public class Almoxarife {

    // não precisa estar disponível para toda a aplicação
    private void controlarEntrada() {
        System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
    }

    private void controlarSaida() {
        System.out.println("CONTROLANDO A SAIDA DOS ITENS");
    }

    // colocamos em default
    void entregarIngredientes() {
        System.out.println("ENTREGANDO INGREDINTES");
        controlarSaida();
    }

    // colocamos em default
    void trocarGas() {
        System.out.println("ALMOXARIFE TROCANDO O GÁS");
    }

}

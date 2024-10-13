public interface Iconta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double Valor, Conta ContaDestino);

    void imprimirExtrato();
}

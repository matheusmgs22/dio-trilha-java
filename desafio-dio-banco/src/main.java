public class main {

    public static void main(String[] args) {

        Cliente matheus = new Cliente();
        matheus.setNome("Matheus");

        Conta cc = new ContaCorrente(matheus);
        Conta poupanca = new ContaPoupanca(matheus);

        cc.depositar(1000);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}

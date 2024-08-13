import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // TODO:
        // conhecer e importar a classe scanner
        // Exibir as mensangens para o usuario
        // obter os valores digitados no terminal
        // Exibir a mensagem final

        Scanner scanner = new Scanner(System.in);
        // Random randomico = new Random();
        Double saldo = 237.48;

        System.out.println("Por favor, digite o seu nome e sobrenome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        // Double saldo = randomico.nextDouble();

        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                        ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}

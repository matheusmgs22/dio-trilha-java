package pessoa;

public class SistemaCadastro {
    public static void main(String[] args) {

        Pessoa marcos = new Pessoa();

        marcos.setEndereco("RUA DAS MARIAS");

        System.out.println(marcos.getNome());
    }
}

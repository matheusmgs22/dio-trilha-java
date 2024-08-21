public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765065");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {

            System.out.println("O cep não corresponde com a regras de negócio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        return "23.765-064";
    }
}

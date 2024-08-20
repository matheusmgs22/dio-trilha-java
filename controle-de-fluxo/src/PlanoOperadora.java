public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

        switch (plano) {
            case "T": {
                System.out.println("5gb Youtube");
                break;
            }
            case "M": {
                System.out.println("Whats e Instagram grátis");
                break;
            }
            case "B": {
                System.out.println("100 minutos de ligação");
                break;
            }
            default: {
                System.out.println("Plano não encontrado");

            }
        }
    }
}

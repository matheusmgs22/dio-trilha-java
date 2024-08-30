package poo.pilaresPoo;

public abstract class Veiculo {
    private String chasi;

    public String getChasi() {
        return chasi;
    }

    public void setChasi(String chasi) {
        this.chasi = chasi;
    }

    public abstract void ligar();
}

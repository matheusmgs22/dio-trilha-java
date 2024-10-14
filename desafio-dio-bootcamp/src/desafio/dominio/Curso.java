package desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso() {

    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHorarias) {
        this.cargaHoraria = cargaHorarias;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao=' " + getDescricao() + '\'' +
                ", carga Horaria=' " + cargaHoraria + '\'' +
                '}';
    }

}

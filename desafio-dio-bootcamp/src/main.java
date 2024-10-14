import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;
import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTeteu = new Dev();
        devTeteu.setNome("Teteu");
        devTeteu.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos  Inscritos Matheus " + devTeteu.getConteudoInscritos());
        devTeteu.progedir();
        System.out.println("-");
        System.out.println("Conteudos  Inscritos Matheus " + devTeteu.getConteudoInscritos());
        System.out.println("Conteudos  Concluidos Matheus " + devTeteu.getConteudoConcluidos());
        System.out.println("XP: " + devTeteu.calcularTotalXp());

        System.out.println("-------");

        Dev devBeca = new Dev();
        devBeca.setNome("Beca");
        devBeca.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos  Inscritos Rebeca " + devTeteu.getConteudoInscritos());
        devBeca.progedir();
        devBeca.progedir();
        devBeca.progedir();
        System.out.println("-");
        System.out.println("Conteudos  Inscritos Rebeca " + devTeteu.getConteudoInscritos());
        System.out.println("Conteudos  Concluidos Rebeca" + devBeca.getConteudoConcluidos());
        System.out.println("XP: " + devBeca.calcularTotalXp());

    }
}

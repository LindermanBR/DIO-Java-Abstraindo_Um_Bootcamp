import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Lógica de programação essencial");
        curso1.setDescricao("descrição curso de lógica");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("Introdução ao Git e GitHub");
        curso2.setDescricao("descrição curso de Git e Github");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Aula Inaugural: GFT START #3 Java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("GFT Start #3 Java");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLinderman = new Dev();
        devLinderman.setNome("Linderman");
        devLinderman.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Linderman:" + devLinderman.getConteudosInscritos());
        devLinderman.progredir();
        devLinderman.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Linderman:" + devLinderman.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Linderman:" + devLinderman.getConteudosConcluidos());
        System.out.println("XP:" + devLinderman.calcularTotalXp());

        System.out.println("-------");

        Dev devPoppy = new Dev();
        devPoppy.setNome("Poliana");
        devPoppy.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Poliana:" + devPoppy.getConteudosInscritos());
        devPoppy.progredir();
        devPoppy.progredir();
        devPoppy.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Poliana:" + devPoppy.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Poliana:" + devPoppy.getConteudosConcluidos());
        System.out.println("XP:" + devPoppy.calcularTotalXp());

    }

}
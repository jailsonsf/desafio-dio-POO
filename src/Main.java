import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso básico sobre Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java 11");
        curso2.setDescricao("Curso básico sobre Java 11");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Fundamentos do Java");
        mentoria1.setDescricao("Primeiros passos com Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devJailson = new Dev();
        devJailson.setNome("Jailson");
        devJailson.increverBootcamp(bootcamp);
        System.out.println("Conteudos incritos " + devJailson.getNome() + ": " + devJailson.getConteudosInscritos());

        devJailson.progredir();
        devJailson.progredir();
        System.out.println("-");
        System.out.println("Conteudos incritos " + devJailson.getNome() + ": " + devJailson.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + devJailson.getNome() + ": " + devJailson.getConteudosConcluidos());
        System.out.println("XP: " + devJailson.calcularTotalXp());
        System.out.println("--------");

        Dev devSoares = new Dev();
        devSoares.setNome("Soares");
        devSoares.increverBootcamp(bootcamp);
        System.out.println("Conteudos incritos " + devSoares.getNome() + ": " + devSoares.getConteudosInscritos());

        devSoares.progredir();
        System.out.println("-");
        System.out.println("Conteudos incritos " + devSoares.getNome() + ": " + devSoares.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + devSoares.getNome() + ": " + devSoares.getConteudosConcluidos());
        System.out.println("XP: " + devSoares.calcularTotalXp());
        System.out.println("--------");
    }
}

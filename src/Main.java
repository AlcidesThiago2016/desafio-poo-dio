import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java DEveloper");
        bootcamp.setDescricao("Descrição BootCamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlcides = new Dev();
        devAlcides.setNome("Alcides");
        devAlcides.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Alcides " + devAlcides.getConteudosInscritos());
        devAlcides.progredir();
        System.out.println(devAlcides.getConteudosConcluidos() + "Finalizado em: " + bootcamp.getDataFinal());
        devAlcides.progredir();
        System.out.println(devAlcides.getConteudosConcluidos() + "Finalizado em: " + bootcamp.getDataFinal());
        System.out.println("Conteúdos Inscritos Alcides " + devAlcides.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Alcides " + devAlcides.getConteudosConcluidos());
        System.out.println("XP: " + devAlcides.calcularTotalXp());

        System.out.println("-----------------------");

        Dev devRicardo = new Dev();
        devRicardo.setNome("Ricardo");
        devRicardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ricardo " + devRicardo.getConteudosInscritos());
        devRicardo.progredir();
        System.out.println(devRicardo.getConteudosConcluidos() + "Finalizado em: " + bootcamp.getDataFinal());
        devRicardo.progredir();
        System.out.println(devRicardo.getConteudosConcluidos() + "Finalizado em: " + bootcamp.getDataFinal());
        devRicardo.progredir();
        System.out.println(devRicardo.getConteudosConcluidos() + "Finalizado em: " + bootcamp.getDataFinal());
        System.out.println("Conteúdos Inscritos Ricardo " + devRicardo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ricardo " + devRicardo.getConteudosConcluidos());
        System.out.println("XP: " + devRicardo.calcularTotalXp());

    }
}

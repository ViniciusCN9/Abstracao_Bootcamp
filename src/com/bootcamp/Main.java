package com.bootcamp;

import com.bootcamp.dominio.Bootcamp;
import com.bootcamp.dominio.Curso;
import com.bootcamp.dominio.Dev;
import com.bootcamp.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Criação do primeiro Curso
        Curso cursoA = new Curso();
        cursoA.setTitulo("curso java");
        cursoA.setDescricao("descrição curso java");
        cursoA.setCargaHoraria(8);

        // Criação do segundo Curso
        Curso cursoB = new Curso();
        cursoB.setTitulo("curso js");
        cursoB.setDescricao("descrição curso js");
        cursoB.setCargaHoraria(4);

        // Criação de uma mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        // Criação de um Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoA);
        bootcamp.getConteudos().add(cursoB);
        bootcamp.getConteudos().add(mentoria);

        // Criação e manipulação do primeiro dev
        Dev devA = new Dev();
        devA.setNome("Vinicius");
        devA.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Vinicius:" + devA.getConteudosInscritos());
        devA.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Vinicius:" + devA.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Vinicius:" + devA.getConteudosConcluidos());
        System.out.println("XP:" + devA.calcularTotalXp());

        System.out.println("-------");

        // Criação e manipulação do segundo dev
        Dev devB = new Dev();
        devB.setNome("Matheus");
        devB.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Matheus:" + devB.getConteudosInscritos());
        devB.progredir();
        devB.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Matheus:" + devB.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Matheus:" + devB.getConteudosConcluidos());
        System.out.println("XP:" + devB.calcularTotalXp());

    }
}

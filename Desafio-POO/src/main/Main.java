package main;

import java.time.LocalDate;

import br.com.dio.dominio.Bootcamp;
import br.com.dio.dominio.Conteudo;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Dev;
import br.com.dio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		Conteudo conteudo = new Curso();
		Conteudo conteudo1 = new Mentoria();
		
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("GFT START #4 JAVA");
		bootcamp.setDescricao("Descrição bootcamp Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		
		Dev devMatheus = new Dev();
		devMatheus.setNome("Matheus");
		devMatheus.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos " + devMatheus.getConteudosInscritos());
		devMatheus.progredir();
		System.out.println("Conteudos concluídos " + devMatheus.getConteudosConcluidos());
		Dev devLucas = new Dev();
		devLucas.setNome("Lucas");
		devLucas.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos " + devLucas.getConteudosInscritos());
		devLucas.progredir();
		System.out.println("Conteudos concluídos " + devLucas.getConteudosConcluidos());
		
	}

}

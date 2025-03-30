package main;

import d1_escola.Aluno;
import d1_escola.Disciplina;
import d1_escola.Professores;
import d1_escola.Turmas;

public class Main {

		public static void main(String[] args) {
			Aluno aluno1 = new Aluno("João Silva", "111.222.333-44", 20, "20231001", "3A", 5);
			Aluno aluno2 = new Aluno ("Ana Santos", "555.666.777-88", 21, "20231002", "3A", 5);
			
		};
		
		Disciplina disciplina1 = new Disciplina("Cálculo I", "112233", 2, "Matematica", "Mat01");
		Disciplina disciplina2 = new Disciplina("Quimica", "46233", 2, "Equacao", "QUI89");
 

	   Turmas turma1 = new Turmas("Maria Oliveira", "123.456.789-00", 40, "3A", 2);
	   Turmas turma2 = new Turmas("Carlos Souza", "987.654.321-00", 45, "3B", 1);
	  
	 
	   Professores professor1 = new Professores("Maria Oliveira", 
	            "123.456.789-00", 
	            40, 
	            "Certificação em Didática, Certificação em Liderança", 
	            7500.00, 
	            "Matemática e Física");
	  
	  Professores professor2 = new Professores("Carlos Souza", 
	            "987.654.321-00", 
	            45, 
	            "Certificação em Linguagens de Programação", 
	            8000.00, 
	            "Computação");
	  };
	  

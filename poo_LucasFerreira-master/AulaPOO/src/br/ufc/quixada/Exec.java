package br.ufc.quixada;
import br.ufc.quixada.Aluno;
//import br.ufc.quiada.model.Carro;

public class Exec {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Lucas");
		aluno1.setNome("http");
		System.out.println("O nome do aluno: " +aluno1.getNome());
		aluno1.setCurso("SI");
		aluno1.setIdade(-18);
		aluno1.setIRA(8);
		System.out.println(aluno1.toString());
		//novoEstudante.idade="18";
		//novoEstudante.curso="CC";
		//novoEstudante.IRA="8.0";
	
		//novoEstudante.estudar("Encapsulamento");
		//novoEstudante.matricular("Progamacao Orientada a Objetos");
		
		
		
	}
}

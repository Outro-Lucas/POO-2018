package br.ufc.quixada;

public class Aluno {

			private String nome;
			private int idade;
			private String curso;
			private double IRA;
			

			public Aluno(){
				
			}
			//metodos

			public Aluno(String nome, int idade, String curso, double IRA) {
				this.nome=nome;
				this.idade=idade;
				this.curso=curso;
				this.IRA=IRA;
			}
			
			public String getNome(){
				return this.nome;
			}
			
			public void setNome(String nome){
				if(nome.startsWith("http")){
					System.out.println("String Maliciosa");
				}else{
					this.nome= nome;
				}
				
			}
			
			public int getIdade(){
				return this.idade;
			}
			
			public void setIdade(int idade){
				if(idade<0){
					System.out.println("Você não é existe");
					return;
				}else{
				this.idade= idade;
				}
			}
			
			public String getCurso(){
				return this.curso;
			}
		
			public void setCurso(String curso){
				if(nome.startsWith("SI")){
					System.out.println("Curso Errado");
				}else{
					this.curso= curso;
				}
		}
			
			public double getIra(){
				return this.IRA;
			}
			public void setIRA(double IRA){
				this.IRA= IRA;
		}

			
			public String toString(){
				String model = "";
				model = "Nome do aluno: "+this.nome+" A idade do Aluno: "+this.idade+"O Curso do Aluno: "+this.curso+"O IRA do Aluno: "+this.IRA;
				return model;
			}
			/*
			public void estudar(String materia){
				System.out.println(materia);
			}
			public void matricular(String disciplina){
				System.out.println(disciplina);
				*/

}

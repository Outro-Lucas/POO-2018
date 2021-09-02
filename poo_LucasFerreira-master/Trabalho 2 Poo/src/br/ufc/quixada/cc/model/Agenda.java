package br.ufc.quixada.cc.model;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	
	private Scanner ler;	
	private ArrayList<Pessoa> ListaPessoa = new ArrayList<>();
	private ArrayList<PessoaFisica> Fisica = new ArrayList<>();		
	private ArrayList<PessoaJuridica> Juridica  = new ArrayList<>();
	public ArrayList<PessoaFisica> getFisica() {
		return Fisica;
	}

	public void setPessoaFisica(ArrayList<PessoaFisica> Fisica) {
		this.Fisica = Fisica;
	}

	public ArrayList<PessoaJuridica> getJuridica() {
		return Juridica;
	}

	public void setJuridicas(ArrayList<PessoaJuridica> Juridica) {
		this.Juridica = Juridica;
	}
	
	public void addPessoaFisica(PessoaFisica p1){
		this.ListaPessoa.add(p1);
		System.out.println("Adicionado");
	}
	public void addPessoaJuridica(PessoaJuridica p2){
		this.ListaPessoa.add(p2);
		System.out.println("Adicionado");
	}
	public void removePessoaFisica(PessoaFisica p1){
		this.ListaPessoa.remove(p1);
	}
	public void removePessoaJuridica(PessoaJuridica p2){
		this.ListaPessoa.remove(p2);
		System.out.println("Removido");
	}
	
	public void pesquisar() {
		ler = new Scanner(System.in);
		System.out.println("\n"+"Deseja pesquisar Nome ou CPF/CNPJ? (n|c)");
		String sn = ler.nextLine();
		if (sn.equals("n")) {
			System.out.println("Digite: ");
			String scan = ler.nextLine();
			
				 for (int i = 0; i < this.ListaPessoa.size(); i++) {
					 Pessoa pessoa = ListaPessoa.get(i);
					 if (pessoa instanceof PessoaFisica) {
						 	if (scan.equals(pessoa.getNome())) {
						 		System.out.println(((PessoaFisica)pessoa).toString());
						 		return;						 
						 	}
					 }
					 else if (pessoa instanceof PessoaJuridica) {
						 if (scan.equals(pessoa.getNome())) {
							 System.out.println(((PessoaJuridica)pessoa).toString());
							 return;
						 	}
					 	}
				 	}
				 
				}	
										 
		else if (sn.equals("c")){
			System.out.println("Digite: ");
			int sint = ler.nextInt();
				 for (int i = 0; i < this.ListaPessoa.size(); i++) {
					 Pessoa pessoa = ListaPessoa.get(i);
					 if (pessoa instanceof PessoaFisica) {
						 if (sint ==(((PessoaFisica) pessoa).getCPF())) {
						 System.out.println(((PessoaFisica)pessoa).toString());
						 return;						 
						 }
					 } 
					 else if (pessoa instanceof PessoaJuridica) {
							 if (sint==(((PessoaJuridica) pessoa).getCNPJ())) {
							 System.out.println(((PessoaJuridica)pessoa).toString());
							 return;
							 }
					 	}
				 	}
				 System.out.println("Pessoa não encontrada");
		}
		
		 
		
		 
	}
	
	public void ordenaFisica(ArrayList<PessoaFisica> Fisica){
        for (int i = 0; i <Fisica.size(); i++){
     	    PessoaFisica aux = Fisica.get(i);
     	    int j = i;
     	   		while (j > 0 && Fisica.get(j-1).getCPF() > aux.getCPF()) {
     	   		Fisica.set(j, Fisica.get(j-1));
                       j--;
                } 
     	   	Fisica.set(j, aux);
				}      
}
	
	public void ordenaJuridica(ArrayList<PessoaJuridica> Juridica){
        for (int i = 0; i <Juridica.size(); i++){
     	    PessoaJuridica aux = Juridica.get(i);
     	    int j = i;
     	   		while( j > 0 && Juridica.get(j-1).getCNPJ() > aux.getCNPJ()) {
     	   		Juridica.set(j, Juridica.get(j-1));
                     j--;    
     	   			}                   
     	   	Juridica.set(j, aux);
				}      
}
	
	public void mostrar(){
	    System.out.print("Pessoas cadastradas:\n");
	    for(int i = 0; i < ListaPessoa.size(); i++)
	    {
	        System.out.print(ListaPessoa.get(i).getNome() + "\n");
	    }

	}

}


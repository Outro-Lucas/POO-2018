package EntradaDeCinema;

public class Cinema {
	private String nomeFilme;
	private String horario;
	private String sala;
	private int poltrona;
	private double preço;
	private boolean disponivel;
	
	
	public Cinema(String nomeFilme,String horario, String sala,int poltrona, double preço, boolean disponivel){
		this.nomeFilme=nomeFilme;
		this.horario=horario;
		this.sala=sala;
		this.poltrona=poltrona;
		this.preço=preço;
		this.disponivel=disponivel;
	}
	
	public String getNomeFilme(){
		return this.nomeFilme;
	}
	
	
	public String getHorario(){
		return this.horario;
	}
	
	public String getSala(){
		return this.sala;
	}
	
	public int getPoltrona(){
		return this.poltrona;
	}
	
	public double getPreço(){
		return this.preço;
	}

	public void calculaValorComDesconto(int dia, int mês, int ano, int carteira, double preço){
		ano=2018-ano;
		
		if(ano<12){
			preço*=0.5;
		}
		else if(ano>=12&&ano<=15&&carteira!=-1){
			preço*=0.6;
		}
		else if(ano>=16&&ano<=20&&carteira!=-1){
			preço*=0.7;
		}else if(ano>20&&carteira!=-1){
			preço*=0.8;
		}
			System.out.println("R$" + preço);
	}
	
	public void realizaVenda(){
		if (disponivel){
			this.disponivel=false;
			System.out.println("Vendido");
		}else{
			System.out.println("Poltrona ocupada");
		}
	}
	public String toString(){
		String modelo = "";
		modelo = "Nome do Filme: "+this.nomeFilme+ "\n"+
				 "O Horário do filme: "+this.horario+ "\n"+
				 "Sala onde será transmitido o fime: "+this.sala+"\n"+
				 "Poltronas disponiveis: 1, 2 e 3"+"\n"+
				 "Preço do Ingresso: R$"+this.preço+"\n";
		return modelo;
	
	}

}


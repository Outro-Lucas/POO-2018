package EntradaDeCinema;

public class Cinema {
	private String nomeFilme;
	private String horario;
	private String sala;
	private int poltrona;
	private double pre�o;
	private boolean disponivel;
	
	
	public Cinema(String nomeFilme,String horario, String sala,int poltrona, double pre�o, boolean disponivel){
		this.nomeFilme=nomeFilme;
		this.horario=horario;
		this.sala=sala;
		this.poltrona=poltrona;
		this.pre�o=pre�o;
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
	
	public double getPre�o(){
		return this.pre�o;
	}

	public void calculaValorComDesconto(int dia, int m�s, int ano, int carteira, double pre�o){
		ano=2018-ano;
		
		if(ano<12){
			pre�o*=0.5;
		}
		else if(ano>=12&&ano<=15&&carteira!=-1){
			pre�o*=0.6;
		}
		else if(ano>=16&&ano<=20&&carteira!=-1){
			pre�o*=0.7;
		}else if(ano>20&&carteira!=-1){
			pre�o*=0.8;
		}
			System.out.println("R$" + pre�o);
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
				 "O Hor�rio do filme: "+this.horario+ "\n"+
				 "Sala onde ser� transmitido o fime: "+this.sala+"\n"+
				 "Poltronas disponiveis: 1, 2 e 3"+"\n"+
				 "Pre�o do Ingresso: R$"+this.pre�o+"\n";
		return modelo;
	
	}

}


package br.ufc.quixada.cc.poo.model;

public class Vendedor extends Funcionario{

	private int cargaHoraria;
	
	public Vendedor(){
		
	}
	public Vendedor(String Nome, String CPF, String matricula, float sal�rio, int cargaHoraria){
		super(Nome, CPF, matricula, sal�rio);
		this.setCargaHoraria(cargaHoraria);
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public void realizarVenda(Onibus o, Passagem p){
		o.adicionarPassagemOnibus(p);
	}
	
	public String toString(){
		super.toString();
		String modelo="";
		modelo = "Carga Hor�ria de Trabalho:"+this.cargaHoraria;
		return modelo;
	}
	@Override
	public void darBonifica��o() {
		// TODO Auto-generated method stub
		super.sal�rio = super.sal�rio +3;
	}
}

package br.ufc.quixada.si.model;

public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String inscricaoEstadual;
    private String razaoSocial;
    
    public PessoaJuridica(String nome, String endereco, String nascimento, 
                          String cnpj, String inscricaoEstadual, 
                          String razaoSocial){
        super(nome, endereco, nascimento);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public PessoaJuridica(){
        super();
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    public String toString() {
        super.imprimePessoa();
        return "CNPJ: " + this.cnpj + "\nInscrição Estadual: " + this.inscricaoEstadual+ "\nRazão Social: " + this.razaoSocial;
    }
}

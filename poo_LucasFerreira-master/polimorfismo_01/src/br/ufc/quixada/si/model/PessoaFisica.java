package br.ufc.quixada.si.model;

public class PessoaFisica extends Pessoa{
    private String cpf;
    private String estadoCivil;
    
    public PessoaFisica(String cpf, String nome, String endereco,
                        String nascimento, String estadoCivil){
        super(nome, endereco, nascimento);
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
    }
    
    public PessoaFisica(){
    
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String toString() {
        super.imprimePessoa();
        return "CPF: " + this.cpf + "\nEstado Civil: " + this.estadoCivil;
    }
}

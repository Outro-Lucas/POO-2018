package br.ufc.quixada.cc.model;

public abstract class Conta{    
    private String nome;
    private String cpf;
    private String numFone;
    private int senha;
    
    public Conta() {}
    
    public Conta(String nome, String cpf, String numFone, int senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.numFone = numFone;
        this.senha = senha;
    }
    
    public String getNome() {
        return nome;
    }

    public String getNumFone() {
        return numFone;
    }

    public void setNumFone(String numFone) {
        this.numFone = numFone;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

package br.ufc.quixada.si.model;

public class Pessoa {
    private String nome;
    private String endereco;
    private String nascimento;
    
    public Pessoa(String nome, String endereco, String nascimento){
        this.nome = nome;
        this.endereco = endereco;
        this.nascimento = nascimento;
    }
    
    public Pessoa(){
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    
    public void imprimePessoa(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Nascimento: " + this.nascimento);
    }
}

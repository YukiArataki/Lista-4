package br.edu.up.modelos;

public class Cidade extends Endereco{

    private String nome;
    private String UF;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getUF() {
        return UF;
    }
    public void setUF(String uF) {
        UF = uF;
    }
}

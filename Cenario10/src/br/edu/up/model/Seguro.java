package br.edu.up.model;

public abstract class Seguro {
    private String numeroApolice;
    private String nomeSegurado;

    public Seguro(String numeroApolice, String nomeSegurado) {
        this.numeroApolice = numeroApolice;
        this.nomeSegurado = nomeSegurado;
    }

    public String getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(String numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public abstract String obterDetalhes();
}
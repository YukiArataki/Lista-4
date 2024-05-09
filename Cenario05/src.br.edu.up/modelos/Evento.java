package br.edu.up.modelos;

public class Evento {

    private String nome;
    private Int data; 
    private String local;
    private String lotacaoMax;
    private String ingresosVend;
    private String ingresoPre;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Int getData() {
        return data;
    }
    public void setData(Int data) {
        this.data = data;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getLotacaoMax() {
        return lotacaoMax;
    }
    public void setLotacaoMax(String lotacaoMax) {
        this.lotacaoMax = lotacaoMax;
    }
    public String getIngresosVend() {
        return ingresosVend;
    }
    public void setIngresosVend(String ingresosVend) {
        this.ingresosVend = ingresosVend;
    }
    public String getIngresoPre() {
        return ingresoPre;
    }
    public void setIngresoPre(String ingresoPre) {
        this.ingresoPre = ingresoPre;
    }
}

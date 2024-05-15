package br.edu.up.modelos;

public class Evento {

    private String nome;
    private Date data; 
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
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
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

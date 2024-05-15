package br.edu.up.modelos;
import java.util.Date;

public class Reservas{

    private String nomeRespon;
    private int qtdPessoa;
    private Date data;
    private Double valorTotReser;

    public String getNomeRespon() {
        return nome;
    }
    public void setNomeRespon(String nomeRespon) {
        this.nomeRespon = nomeRespon;
    }
    public Int getQtdPessoa() {
        return qtdPessoa;
    }
    public void setQtdPessoa(Int qtdPessoa) {
        this.qtdPessoa = qtdPessoa;
    }
    public Date getdata() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public Double getValorTotReser() {
        return valorTotReser;
    }
    public void setValorTotReser(Double valorTotReser) {
        this.valorTotReser = valorTotReser;
    }

}
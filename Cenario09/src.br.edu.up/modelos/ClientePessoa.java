package br.edu.up.modelos;

public class ClientePessoa extends Cliente{

    private String CPF;
    private Double peso;
    private Double altura;

    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
}

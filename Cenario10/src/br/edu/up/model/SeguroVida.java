package br.edu.up.model;

public class SeguroVida extends Seguro {
    private double valorCobertura;

    public SeguroVida(String numeroApolice, String nomeSegurado, double valorCobertura) {
        super(numeroApolice, nomeSegurado);
        this.valorCobertura = valorCobertura;
    }

    public double getValorCobertura() {
        return valorCobertura;
    }

    public void setValorCobertura(double valorCobertura) {
        this.valorCobertura = valorCobertura;
    }

    @Override
    public String obterDetalhes() {
        return "Seguro de Vida - Número da Apólice: " + getNumeroApolice() + ", Nome do Segurado: " + getNomeSegurado() + ", Valor da Cobertura: " + valorCobertura;
    }
}
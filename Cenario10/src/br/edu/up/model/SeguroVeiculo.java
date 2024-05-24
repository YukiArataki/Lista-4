package br.edu.up.model;

public class SeguroVeiculo extends Seguro {
    private String placaVeiculo;

    public SeguroVeiculo(String numeroApolice, String nomeSegurado, String placaVeiculo) {
        super(numeroApolice, nomeSegurado);
        this.placaVeiculo = placaVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    @Override
    public String obterDetalhes() {
        return "Seguro de Veículo - Número da Apólice: " + getNumeroApolice() + ", Nome do Segurado: " + getNomeSegurado() + ", Placa do Veículo: " + placaVeiculo;
    }
}
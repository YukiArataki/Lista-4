package br.edu.up.controller;

import java.util.ArrayList;

import br.edu.up.model.Aeronave;
import br.edu.up.model.Passageiro;
import br.edu.up.model.Tripulacao;

public class Controlador {
    private ArrayList<Passageiro> passageiros;
    private ArrayList<Tripulacao> tripulacao;
    private ArrayList<Aeronave> aeronaves;

    public Controlador() {
        this.passageiros = new ArrayList<>();
        this.tripulacao = new ArrayList<>();
        this.aeronaves = new ArrayList<>();
    }

    public void adicionarPassageiro(Passageiro passageiro) {
        passageiros.add(passageiro);
    }

    public void adicionarTripulacao(Tripulacao membroTripulacao) {
        tripulacao.add(membroTripulacao);
    }

    public void adicionarAeronave(Aeronave aeronave) {
        aeronaves.add(aeronave);
    }

}
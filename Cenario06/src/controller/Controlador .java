package controller;

import model.Aeronave;
import model.Passageiro;
import model.Tripulacao;

import java.util.ArrayList;

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
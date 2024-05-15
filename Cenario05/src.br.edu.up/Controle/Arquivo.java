package br.edu.up.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.model.Seguro;

public class Arquivo{

    public boolean adicionarSeguro(Seguro seguro) {
        for (Seguro s : seguros) {
            if (s.getNumeroApolice().equals(seguro.getNumeroApolice())) {
                return false; 
            }
        }
        reserva.add(reserva);
        return true;
    }
}
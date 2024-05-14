package br.edu.up.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.model.Seguro;

public class SeguroController {
    private List<Seguro> seguros;

    public SeguroController() {
        seguros = new ArrayList<>();
    }

    public boolean adicionarSeguro(Seguro seguro) {
        for (Seguro s : seguros) {
            if (s.getNumeroApolice().equals(seguro.getNumeroApolice())) {
                return false; // Número da apólice já existe
            }
        }
        seguros.add(seguro);
        return true;
    }

    public Seguro localizarSeguro(String numeroApolice) {
        for (Seguro s : seguros) {
            if (s.getNumeroApolice().equals(numeroApolice)) {
                return s;
            }
        }
        return null;
    }

    public boolean excluirSeguro(String numeroApolice) {
        for (Seguro s : seguros) {
            if (s.getNumeroApolice().equals(numeroApolice)) {
                seguros.remove(s);
                return true;
            }
        }
        return false;
    }

    public void excluirTodosSeguros() {
        seguros.clear();
    }

    public List<Seguro> listarTodosSeguros() {
        return seguros;
    }

    public int quantidadeSeguros() {
        return seguros.size();
    }
}
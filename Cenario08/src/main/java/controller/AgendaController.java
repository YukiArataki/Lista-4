package main.java.controller;


import java.util.ArrayList;
import java.util.List;

import main.java.model.Contato;

public class AgendaController {
    private List<Contato> contatos;

    public AgendaController() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(int indice) {
        if (indice >= 0 && indice < contatos.size()) {
            contatos.remove(indice);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public Contato obterContato(int indice) {
        if (indice >= 0 && indice < contatos.size()) {
            return contatos.get(indice);
        } else {
            System.out.println("Índice inválido.");
            return null;
        }
    }

    public List<Contato> listarContatos() {
        return contatos;
    }
}
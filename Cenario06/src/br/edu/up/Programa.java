package br.edu.up;
import br.edu.up.controller.Controlador;
import br.edu.up.view.Visualizacao;
public class Programa {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        Visualizacao visualizacao = new Visualizacao(controlador);
        visualizacao.exibirMenu();
    }
}
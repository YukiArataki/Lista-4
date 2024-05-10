public class Programa {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        Visualizacao visualizacao = new Visualizacao(controlador);
        visualizacao.exibirMenu();
    }
}
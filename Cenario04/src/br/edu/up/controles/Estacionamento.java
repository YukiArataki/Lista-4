package br.edu.up.controles;
import br.edu.up.modelos.Carro;

public class Estacionamento {
    private int vagas;
    private Carro[] carros;
    private float entrada;
    private float saida;    
    private float preco;

    public float getSaida() {
        return saida;
    }

    public void setSaida(float saida) {
        this.saida = saida;
    }

    public float getPreco() {
        if(saida-entrada<=4) {
            preco = (float) ((saida-entrada)*5);
            return preco;
        }

        else {
        preco = (float) 5.00;
        return preco;
    }}

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public String Criarcarro(String cor,String modelo,String placa,float entrada,float saida) {
        Carro carros = new Carro();
        carros.setCor(cor);
        carros.setModelo(modelo);
        carros.setPlaca(placa);
        setEntrada(entrada);
        setSaida(saida);
        getPreco();
     return carros.getCor() +" " + carros.getModelo();
}

    public float getEntrada() {
        return entrada;

    }

    public void setEntrada(float entrada) {
        this.entrada = entrada;
    }

}

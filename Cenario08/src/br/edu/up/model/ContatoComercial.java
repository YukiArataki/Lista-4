package main.java.model;

public class ContatoComercial extends Contato {
    private String empresa;

    public ContatoComercial(String nome, String telefone, String empresa) {
        super(nome, telefone);
        this.empresa = empresa;
    }

    @Override
    public String obterInformacoes() {
        return "Nome: " + getNome() + ", Telefone: " + getTelefone() + ", Empresa: " + empresa;
    }
}
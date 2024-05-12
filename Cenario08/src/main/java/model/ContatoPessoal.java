package main.java.model;

public class ContatoPessoal extends Contato {
    private String email;

    public ContatoPessoal(String nome, String telefone, String email) {
        super(nome, telefone);
        this.email = email;
    }

    @Override
    public String obterInformacoes() {
        return "Nome: " + getNome() + ", Telefone: " + getTelefone() + ", Email: " + email;
    }
}
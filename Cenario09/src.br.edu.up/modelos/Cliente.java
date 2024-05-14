package br.edu.up.modelos;

public class Cliente {

    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;
    private Double valrMaxCredito;
    private Double valrEmprestado;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Double getValrMaxCredito() {
        return valrMaxCredito;
    }
    public void setValrMaxCredito(Double valrMaxCredito) {
        this.valrMaxCredito = valrMaxCredito;
    }
    public Double getValrEmprestado() {
        return valrEmprestado;
    }
    public void setValrEmprestado(Double valrEmprestado) {
        this.valrEmprestado = valrEmprestado;
    }

}

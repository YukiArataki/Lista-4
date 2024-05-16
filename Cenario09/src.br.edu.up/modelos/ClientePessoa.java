package br.edu.up.modelos;

public class ClientePessoa extends Cliente{
    private String CPF;
    private Double peso;
    private Double altura;

    public ClientePessoa(String nome, String telefone, String email,  Double valrEmprestado,  Double valrMaxCredito, String CPF, Double peso, Double altura){
        super(nome, telefone, email, valrEmprestado, valrMaxCredito);
        this.CPF = CPF;
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public String obterInformacoes(){
      return "Nome: " + getNome() + ", Telefone: " + getTelefone() + ", E-mail: " + getEmail() + ", Valor Emprestado: " + getValrEmprestado() + ", Valor Maximo de Credito: " + getValrMaxCredito() + ", CPF: " + CPF + ", Peso" + peso + ", Altura" + altura;
    }

}

package br.edu.up.modelos;

public class ClienteEmpresa extends Cliente{
    private String cnpj;
    private String inscEstadual;
    private int anoFundacao; 

    public ClienteEmpresa(String nome, String telefone, String email,  Double valrEmprestado,  Double valrMaxCredito, String cnpj, String  inscEstadual, int anoFundacao){
        super(nome, telefone, email, valrEmprestado, valrMaxCredito);
        this.cnpj = cnpj;
        this.inscEstadual= inscEstadual;
        this.anoFundacao = anoFundacao;

    }

    @Override
    public String obterInformacoes() {
        return "Nome: " + getNome() + ", Telefone: " + getTelefone() + ", E-mail: " + getEmail() + ", Valor Emprestado: " + getValrEmprestado() + ", Valor Maximo de Credito: " + getValrMaxCredito() + "Cnpj: " + cnpj + ", Insc Estadual" + inscEstadual + ", Ano de Fundação: " + anoFundacao;
    }
}

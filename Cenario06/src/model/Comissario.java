package model;

public class Comissario extends Tripulacao {
    private String[] idiomasFluencia;

    public Comissario(String nome, String rg, String identificacaoAeronautica, String matriculaFuncionario, String[] idiomasFluencia) {
        super(nome, rg, identificacaoAeronautica, matriculaFuncionario);
        this.idiomasFluencia = idiomasFluencia;
    }

}
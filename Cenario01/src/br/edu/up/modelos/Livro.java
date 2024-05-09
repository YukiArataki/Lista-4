package br.edu.up.modelos;

public class Livro {

    private String codigo, titulo, autor, isbn;
    private int ano;

    public Livro (String codigoLivro, String tituloLivro, String autor, int ano){
        this.codigo = codigoLivro;
        this.titulo = tituloLivro;
        this.autor = autor;
        this.ano = ano;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public int getAno(){
        return this.ano;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor; 
    }

    public void setAno(int ano){
        this.ano = ano;
    }

}

package br.unipar.trabalho_poo.model;

public class Autor {
    private int idLivro;
    private String Nome;
    private String nacionalidade;

    public Autor() {
    }

    public Autor(int idLivro, String Nome, String nacionalidade) {
        this.idLivro = idLivro;
        this.Nome = Nome;
        this.nacionalidade = nacionalidade;
    }

    

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    @Override
    public String toString() {
        return "Autor{" + "idLivro=" + idLivro + ", Nome=" + Nome + ", nacionalidade=" + nacionalidade + '}';
    }

    
    
    
    
}

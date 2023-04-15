package br.unipar.trabalho_poo.model;

public class Autor {
    private int idAutor;
    private String Nome;
    private String nacionalidade;

    public Autor() {
    }

    public Autor(int idAutor, String Nome, String nacionalidade) {
        this.idAutor = idAutor;
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

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    @Override
    public String toString() {
        return "\nAutor{" + "\nidAutor=" + idAutor + ", \nNome=" + Nome +
                ", \nnacionalidade=" + nacionalidade + '}';
    }

    
    
    
    
}

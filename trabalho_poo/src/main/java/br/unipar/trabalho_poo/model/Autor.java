package br.unipar.trabalho_poo.model;

public class Autor {
    private String Nome;
    private String nacionalidade;

    public Autor() {
    }

    public Autor(String Nome, String nacionalidade) {
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

    @Override
    public String toString() {
        return "Autor{" + "Nome=" + Nome + ", nacionalidade=" + nacionalidade + '}';
    }
    
    
}

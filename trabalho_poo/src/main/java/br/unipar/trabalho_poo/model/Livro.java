package br.unipar.trabalho_poo.model;

public class Livro {
    private String nomeLivro;
    private int idLivro;
    private int anoPubli;
    private String genero;
    private double precoLivro;
    private String editora;
    private int nrPaginas;
    private int qtdEstoque;
    private Autor autor;

    public Livro() {
    }

    public Livro(String nomeLivro, int idLivro, int anoPubli, String genero, double precoLivro, String editora, int nrPaginas, int qtdEstoque, Autor autor) {
        this.nomeLivro = nomeLivro;
        this.idLivro = idLivro;
        this.anoPubli = anoPubli;
        this.genero = genero;
        this.precoLivro = precoLivro;
        this.editora = editora;
        this.nrPaginas = nrPaginas;
        this.qtdEstoque = qtdEstoque;
        this.autor = autor;
    }

    

    public int getNrPaginas() {
        return nrPaginas;
    }

    public void setNrPaginas(int nrPaginas) {
        this.nrPaginas = nrPaginas;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }   

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public int getAnoPubli() {
        return anoPubli;
    }

    public void setAnoPubli(int anoPubli) {
        this.anoPubli = anoPubli;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecoLivro() {
        return precoLivro;
    }

    public void setPrecoLivro(double precoLivro) {
        this.precoLivro = precoLivro;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    @Override
    public String toString() {
        return "Livro{" + "nomeLivro=" + nomeLivro + ", idLivro=" + idLivro + ", anoPubli=" + anoPubli + ", genero=" + genero + ", precoLivro=" + precoLivro + ", editora=" + editora + ", nrPaginas=" + nrPaginas + ", qtdEstoque=" + qtdEstoque + ", autor=" + autor + '}';
    }

    
    

    

    
 
    
}

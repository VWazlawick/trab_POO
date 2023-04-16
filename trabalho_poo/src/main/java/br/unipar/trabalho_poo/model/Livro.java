package br.unipar.trabalho_poo.model;

public class Livro {
    private int idLivro;
    private String nomeLivro;
    private Autor autor;  
    private Editora editora;
    private int anoPubli;
    private String genero;
    private double custo;  
    private double precoLivro;
    private int nrPaginas;
    private int qtdEstoque;

    public Livro() {
    }

    public Livro(int idLivro, String nomeLivro, Autor autor, Editora editora, int anoPubli, String genero, double custo, double precoLivro, int nrPaginas, int qtdEstoque) {
        this.idLivro = idLivro;
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.editora = editora;
        this.anoPubli = anoPubli;
        this.genero = genero;
        this.custo = custo;
        this.precoLivro = precoLivro;
        this.nrPaginas = nrPaginas;
        this.qtdEstoque = qtdEstoque;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
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

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getPrecoLivro() {
        return precoLivro;
    }

    public void setPrecoLivro(double precoLivro) {
        this.precoLivro = precoLivro;
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

    @Override
    public String toString() {
        return "\nLivro{" + "\nidLivro=" + idLivro + ", \nnomeLivro=" + 
                nomeLivro + ", \nautor=" + autor + ", \neditora=" + 
                editora + ", \nanoPubli=" + anoPubli + ", \ngenero=" + 
                genero + ", \ncusto=" + custo + ", \nprecoLivro=" + 
                precoLivro + ", \nnrPaginas=" + nrPaginas + ", \nqtdEstoque=" + qtdEstoque + '}';
    }

    

    
    
    
    

    

    
 
    
}

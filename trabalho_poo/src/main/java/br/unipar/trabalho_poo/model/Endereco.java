
package br.unipar.trabalho_poo.model;


public class Endereco {
    
    private String nmRua;
    private String nmBairro;
    private int nrCasa;
    private String cep;
    private String complemento;
    private Cidade cidade;

    public Endereco() {
    }

    public Endereco(String nmRua, String nmBairro, int nrCasa, String cep, String complemento, Cidade cidade) {
        this.nmRua = nmRua;
        this.nmBairro = nmBairro;
        this.nrCasa = nrCasa;
        this.cep = cep;
        this.complemento = complemento;
        this.cidade = cidade;
    }

    public String getNmRua() {
        return nmRua;
    }

    public void setNmRua(String nmRua) {
        this.nmRua = nmRua;
    }

    public String getNmBairro() {
        return nmBairro;
    }

    public void setNmBairro(String nmBairro) {
        this.nmBairro = nmBairro;
    }

    public int getNrCasa() {
        return nrCasa;
    }

    public void setNrCasa(int nrCasa) {
        this.nrCasa = nrCasa;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "\nEndereco{" + "\nnmRua=" + nmRua + ", \nnmBairro=" + nmBairro 
                + ", \nnrCasa=" + nrCasa + ", \ncep=" + cep + ", \ncomplemento=" + 
                complemento + ", \ncidade=" + cidade + '}';
    }

    
    
    
    
}

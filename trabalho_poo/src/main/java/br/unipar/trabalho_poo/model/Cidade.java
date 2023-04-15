
package br.unipar.trabalho_poo.model;


public class Cidade extends Estado{
    
    private int idCidade;
    private String nmCidade;

    public Cidade() {
    }
    
    public Cidade(int idCidade, String nmCidade, int idEstado, String nmEstado, int idPais, String nmPais) {
        super(idEstado, nmEstado, idPais, nmPais);
        this.idCidade = idCidade;
        this.nmCidade = nmCidade;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getNmCidade() {
        return nmCidade;
    }

    public void setNmCidade(String nmCidade) {
        this.nmCidade = nmCidade;
    }

    @Override
    public String toString() {
        return "Cidade{" + "idCidade=" + idCidade + ", nmCidade=" + nmCidade + '}';
    }
    
    
    
}

    
    
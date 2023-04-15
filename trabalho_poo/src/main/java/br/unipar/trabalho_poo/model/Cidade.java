
package br.unipar.trabalho_poo.model;


public class Cidade extends Estado{
    
    private int idCidade;
    private String nmCidade;
    private Estado estado;

    public Cidade() {
    }

    public Cidade(int idCidade, String nmCidade, Estado estado, int idEstado, String nmEstado) {
        super(idEstado, nmEstado);
        this.idCidade = idCidade;
        this.nmCidade = nmCidade;
        this.estado = estado;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cidade{" + "idCidade=" + idCidade + ", nmCidade=" + nmCidade 
                + ", estado=" + estado + '}';
    }

    
    
    
}

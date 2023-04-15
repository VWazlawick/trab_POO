
package br.unipar.trabalho_poo.model;


public class Estado extends Pais{
    
    private int idEstado;
    private String nmEstado;

    public Estado() {
    }

    public Estado(int idEstado, String nmEstado, int idPais, String nmPais) {
        super(idPais, nmPais);
        this.idEstado = idEstado;
        this.nmEstado = nmEstado;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNmEstado() {
        return nmEstado;
    }

    public void setNmEstado(String nmEstado) {
        this.nmEstado = nmEstado;
    }

    @Override
    public String toString() {
        return "\nEstado{" + "\nidEstado=" + idEstado + ", \nnmEstado=" +
                nmEstado + '}';
    }

    
    
    
}

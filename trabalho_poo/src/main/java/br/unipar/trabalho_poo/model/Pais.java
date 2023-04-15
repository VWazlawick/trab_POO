
package br.unipar.trabalho_poo.model;


public class Pais {
    
    private int idPais;
    private String nmPais;

    public Pais() {
    }

    public Pais(int idPais, String nmPais) {
        this.idPais = idPais;
        this.nmPais = nmPais;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNmPais() {
        return nmPais;
    }

    public void setNmPais(String nmPais) {
        this.nmPais = nmPais;
    }

    @Override
    public String toString() {
        return "Pais{" + "idPais=" + idPais + ", nmPais=" + nmPais + '}';
    }
    
    
            
    
}

package br.unipar.trabalho_poo.model;

public class Editora {
    private int idEditora;
    private String dsEditora;

    public Editora() {
    }

    public Editora(int idEditora, String dsEditora) {
        this.idEditora = idEditora;
        this.dsEditora = dsEditora;
    }

    public int getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(int idEditora) {
        this.idEditora = idEditora;
    }

    public String getDsEditora() {
        return dsEditora;
    }

    public void setDsEditora(String dsEditora) {
        this.dsEditora = dsEditora;
    }

    @Override
    public String toString() {
        return "\nEditora{" + "\nidEditora=" + idEditora + ", \ndsEditora=" + dsEditora + '}';
    }
    
    
}

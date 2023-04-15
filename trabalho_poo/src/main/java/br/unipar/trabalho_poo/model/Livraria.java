package br.unipar.trabalho_poo.model;

import java.util.ArrayList;

public class Livraria {
    private int idLivraria;
    private String dsLivraria;
    private ArrayList<VendaLivro> vendaLivro = new ArrayList<>();

    public Livraria() {
    }

    public Livraria(int idLivraria, String dsLivraria) {
        this.idLivraria = idLivraria;
        this.dsLivraria = dsLivraria;
    }

    public int getIdLivraria() {
        return idLivraria;
    }

    public void setIdLivraria(int idLivraria) {
        this.idLivraria = idLivraria;
    }

    public String getDsLivraria() {
        return dsLivraria;
    }

    public void setDsLivraria(String dsLivraria) {
        this.dsLivraria = dsLivraria;
    }

    public ArrayList<VendaLivro> getVendaLivro() {
        return vendaLivro;
    }

    public void setVendaLivro(VendaLivro vendaLivro) {
        this.vendaLivro.add(vendaLivro);
    }

    @Override
    public String toString() {
        return "Livraria{" + "idLivraria=" + idLivraria + ", dsLivraria=" + dsLivraria + ", vendaLivro=" + vendaLivro + '}';
    }

    
    
    
}

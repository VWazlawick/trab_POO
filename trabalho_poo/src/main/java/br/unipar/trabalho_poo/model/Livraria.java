package br.unipar.trabalho_poo.model;

import java.util.ArrayList;

public class Livraria {
    private int idLivraria;
    private String dsLivraria;
    private ArrayList<Venda> vendas = new ArrayList<>();

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

    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(Venda vendas) {
        this.vendas.add(vendas);
    }

    

    @Override
    public String toString() {
        return "Livraria{" + "idLivraria=" + idLivraria + ", dsLivraria=" + dsLivraria + ", vendas=" + vendas + '}';
    }

    
    
    
}

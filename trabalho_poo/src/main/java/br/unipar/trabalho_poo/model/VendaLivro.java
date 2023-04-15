package br.unipar.trabalho_poo.model;

import java.util.ArrayList;

public class VendaLivro {
    private ArrayList<Livro> listaLivro = new ArrayList<>();
    private Venda venda;
    private double valorUnd;
    private int qtdProduto;
    private double valorTotalProd;
    private double desconto;

    public VendaLivro() {
        
    }

    public VendaLivro(ArrayList<Livro> listaLivro, Venda venda, double valorUnd, int qtdProduto, double valorTotalProd, double desconto) {
        this.venda = venda;
        this.valorUnd = valorUnd;
        this.qtdProduto = qtdProduto;
        this.valorTotalProd = valorTotalProd;
        this.desconto = desconto;
    }

    
    public ArrayList<Livro> getListaLivro() {
        return listaLivro;
    }

    public void setListaLivro(Livro livro) {
        this.listaLivro.add(livro);
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public double getValorUnd() {
        return valorUnd;
    }

    public void setValorUnd(double valorUnd) {
        this.valorUnd = valorUnd;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public double getValorTotalProd() {
        return valorTotalProd;
    }

    public void setValorTotalProd(double valorTotalProd) {
        this.valorTotalProd = valorTotalProd;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "\nVendaLivro{" + "\nlistaLivro=" + listaLivro + ", \nvenda=" + 
                venda + ", \nvalorUnd=" + valorUnd + ", \nqtdProduto=" + qtdProduto + 
                ", \nvalorTotalProd=" + valorTotalProd + ", \ndesconto=" + desconto + '}';
    }
    
    

    
}

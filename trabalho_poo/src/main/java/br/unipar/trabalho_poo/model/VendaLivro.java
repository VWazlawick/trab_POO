package br.unipar.trabalho_poo.model;

import java.util.ArrayList;

public class VendaLivro {
    private Livro livro;
    private double valorUnd;
    private int qtdProduto;
    private double valorTotalProd;
    private double desconto;

    public VendaLivro() {
        
    }

    public VendaLivro(Livro livro, double valorUnd, int qtdProduto, double valorTotalProd, double desconto) {
        this.livro = livro;
        this.valorUnd = valorUnd;
        this.qtdProduto = qtdProduto;
        this.valorTotalProd = valorTotalProd;
        this.desconto = desconto;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public double getValorUnd() {
        return valorUnd;
    }

    public void setValorUnd(double valorUnd) {
        this.valorUnd = valorUnd;
        this.valorTotalProd = (valorUnd-desconto) * qtdProduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
        this.valorTotalProd = (valorUnd-desconto) * qtdProduto;
        livro.setQtdEstoque(livro.getQtdEstoque()-qtdProduto);
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
        this.valorTotalProd = (valorUnd-desconto) * qtdProduto;
    }

    @Override
    public String toString() {
        return "\n--------------------" + "\nlivro=" + livro.getNomeLivro() + ", \nvalorUnd=" + valorUnd +
                ", \ndesconto=" + desconto + ", \nqtdProduto=" + qtdProduto + ", \nvalorTotalProd=" 
                + valorTotalProd;
    }
    
    
    

    
}

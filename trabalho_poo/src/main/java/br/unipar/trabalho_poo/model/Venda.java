package br.unipar.trabalho_poo.model;

import java.util.ArrayList;

public class Venda {
    private int nrVenda;
    private Cliente cliente;
    private double valorTotal;
    private ArrayList<VendaLivro> listaLivros = new ArrayList<>();
    private ArrayList<FormaPagamento> listaPagamento = new ArrayList<>();

    public Venda() {
    }

    public Venda(int nrVenda, Cliente cliente, double valorTotal) {
        this.nrVenda = nrVenda;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }

    public int getNrVenda() {
        return nrVenda;
    }

    public void setNrVenda(int nrVenda) {
        this.nrVenda = nrVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ArrayList<VendaLivro> getListaLivros() {
        return listaLivros;
    }

    public void setListaLivros(VendaLivro vendaLivro) {
        this.listaLivros.add(vendaLivro);
    }

    public ArrayList<FormaPagamento> getListaPagamento() {
        return listaPagamento;
    }

    public void setListaPagamento(FormaPagamento formaPagamento) {
        this.listaPagamento.add(formaPagamento);
    }

    @Override
    public String toString() {
        return "\nVenda{" + "\nnrVenda=" + nrVenda + "\n" + cliente
                + ", \nlistaLivros=" + listaLivros 
                + ", \nvalorTotal=" + valorTotal + ", \nlistaPagamento=" + listaPagamento + '}';
    }

   
}

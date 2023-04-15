package br.unipar.trabalho_poo.model;

import java.util.ArrayList;

public class Venda {
    private int idVenda;
    private double valorTotal;
    private int qtdTotal;
    private Cliente cliente;
    private ArrayList<FormaPagamento> listaPagamento = new ArrayList<>();

    public Venda() {
    }

    public Venda(int idVenda, double valorTotal, int qtdTotal, Cliente cliente) {
        this.idVenda = idVenda;
        this.valorTotal = valorTotal;
        this.qtdTotal = qtdTotal;
        this.cliente = cliente;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getQtdTotal() {
        return qtdTotal;
    }

    public void setQtdTotal(int qtdTotal) {
        this.qtdTotal = qtdTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<FormaPagamento> getListaPagament() {
        return listaPagamento;
    }

    public void setListaPagament(FormaPagamento formaPagamaento) {
        this.listaPagamento.add(formaPagamaento);
    }

    @Override
    public String toString() {
        return "\nVenda{" + "\nidVenda=" + idVenda + ", \nvalorTotal=" + valorTotal + 
                ", \nqtdTotal=" + qtdTotal + ", \ncliente=" + cliente + ", \nlistaPagamento=" 
                + listaPagamento + '}';
    }

    

    
}

package br.unipar.trabalho_poo.model;

public class FormaPagamento {
    private int idFormaPagamento;
    private String dsFormaPagamento;
    private double valorPagamento;

    public FormaPagamento() {
    }

    public FormaPagamento(int idFormaPagamento, String dsFormaPagamento, double valorPagamento) {
        this.idFormaPagamento = idFormaPagamento;
        this.dsFormaPagamento = dsFormaPagamento;
        this.valorPagamento = valorPagamento;
    }

    

    public int getIdFormaPagamento() {
        return idFormaPagamento;
    }

    public void setIdFormaPagamento(int idFormaPagamento) {
        this.idFormaPagamento = idFormaPagamento;
    }

    public String getDsFormaPagamento() {
        return dsFormaPagamento;
    }

    public void setDsFormaPagamento(String dsFormaPagamento) {
        this.dsFormaPagamento = dsFormaPagamento;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    @Override
    public String toString() {
        return "\n------------------\nFormaPagamento{" + ", \ndsFormaPagamento=" 
                + dsFormaPagamento + ", \nvalorPagamento=" + valorPagamento + '}';
    }
    
    

    
    
}

package br.unipar.trabalho_poo.model;

public class FormaPagamento {
    private int idFormaPagamento;
    private String dsFormaPagamento;

    public FormaPagamento() {
    }

    public FormaPagamento(int idFormaPagamento, String dsFormaPagamento) {
        this.idFormaPagamento = idFormaPagamento;
        this.dsFormaPagamento = dsFormaPagamento;
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

    @Override
    public String toString() {
        return "FormaPagamento{" + "idFormaPagamento=" + idFormaPagamento + ", dsFormaPagamento=" + dsFormaPagamento + '}';
    }
    
    
}

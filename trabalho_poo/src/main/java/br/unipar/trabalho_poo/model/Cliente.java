package br.unipar.trabalho_poo.model;

import java.util.Date;

public class Cliente {
    
    private String nomeCliente;
    private String cpf;
    private Date dtNasc;
    private Endereco endereco;

    public Cliente() {
    }
    
    public Cliente(String nomeCliente, String cpf, Date dtNasc, Endereco endereco) {
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
        this.endereco = endereco;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\nCliente{" + "\nnomeCliente=" + nomeCliente + ", \ncpf=" + cpf 
                + ", \ndtNasc=" + dtNasc + ", \nendereco=" + endereco + '}';
    }
    
    
    
}

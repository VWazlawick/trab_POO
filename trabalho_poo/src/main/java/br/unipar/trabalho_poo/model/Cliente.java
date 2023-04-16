package br.unipar.trabalho_poo.model;

import java.util.Date;
import javax.swing.JOptionPane;

public class Cliente {
    private int idCliente;
    private String nomeCliente;
    private String cpf;
    private Date dtNasc;
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(int idCliente, String nomeCliente, String cpf, Date dtNasc, Endereco endereco) {
        this.idCliente = idCliente;
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

    public void alterarCadastrar(char opcao){
        
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
    @Override
    public String toString() {
        return "\nCliente{" + "\nnomeCliente: " + nomeCliente + "- cpf:" + cpf 
                + ", \ndtNasc:" + dtNasc + '}';
    }
    
    
    
}

package br.unipar.trabalho_poo;

import br.unipar.trabalho_poo.model.Autor;
import br.unipar.trabalho_poo.model.Cidade;
import br.unipar.trabalho_poo.model.Cliente;
import br.unipar.trabalho_poo.model.Editora;
import br.unipar.trabalho_poo.model.Endereco;
import br.unipar.trabalho_poo.model.FormaPagamento;
import br.unipar.trabalho_poo.model.Livraria;
import br.unipar.trabalho_poo.model.Livro;
import br.unipar.trabalho_poo.model.Venda;
import br.unipar.trabalho_poo.model.VendaLivro;
import java.util.Date;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        
        Editora e1 = new Editora(2, "Darkside");
        Editora e2 = new Editora(3, "Aleph");
        Editora e3 = new Editora(3, "Rocco LV");
        
        Autor a1 = new Autor(2, "Agustina Bazterrica", "Argentina");
        Autor a2 = new Autor(3, "George Orwell", "Indiano");
        Autor a3 = new Autor(3, "Margaret Atwood", "Canadense");
        
        Livro l1 = new Livro(1, "Saboroso cadaver", a1, e1, 2017, "Romance"
                , 35.5, 49.9, 192, 9);
        Livro l2 = new Livro(2, "1984", a2, e2, 1949, "Ficção", 29.60
                , 52, 400, 3);
        Livro l3 = new Livro(3, "O Conto de Aia", a3, e3, 195, "Romance", 
                19.8, 41.9, 367, 22);

        
        Cidade cidade1 = new Cidade(1, "Toledo", 1, 
                "Paraná", 1, "Brasil");
        Endereco endereco1 = new Endereco("Rua Marumbi", "Jardim Gisela", 167, 
                "85905160", null, cidade1);
        
        Cliente c1 = new Cliente();
        int dia1 = 30;
        int mes1 = 10;
        int ano1 = 2003;
        Date nasc1 = new Date();
        nasc1.setDate(dia1);
        nasc1.setMonth(mes1);
        nasc1.setYear(ano1);
        
        c1.setIdCliente(1);
        c1.setNomeCliente("Victor Wazlawick");
        c1.setCpf("05889512935");            
        c1.setEndereco(endereco1);
        c1.setDtNasc(nasc1);
             
        FormaPagamento fp1 = new FormaPagamento(1, "Dinheiro", 0);
        FormaPagamento fp2 = new FormaPagamento(2, "Pix", 0);
        
        VendaLivro vl1 = new VendaLivro();
        vl1.setLivro(l1);
        vl1.setValorUnd(vl1.getLivro().getPrecoLivro());
        vl1.setQtdProduto(2);
        vl1.setDesconto(10);
        
        VendaLivro vl2 = new VendaLivro();
        vl2.setLivro(l2);
        vl2.setQtdProduto(3);
        vl2.setValorUnd(vl2.getLivro().getPrecoLivro());
        
        VendaLivro vl3 = new VendaLivro();
        vl3.setLivro(l3);
        vl3.setValorUnd(vl3.getLivro().getPrecoLivro());
        vl3.setQtdProduto(12);
        vl3.setDesconto(15);

        Venda venda1 = new Venda(1, c1, 0);
        venda1.setListaLivros(vl1);
        venda1.setListaLivros(vl2);
        venda1.setListaLivros(vl3);
        int aux = venda1.getListaLivros().size();
        for(int i=0;i<aux;i++){
        venda1.setValorTotal(venda1.getValorTotal() + venda1.getListaLivros().get(i).getValorTotalProd());
        }
        fp1.setValorPagamento(venda1.getValorTotal()*0.6);
        fp2.setValorPagamento(venda1.getValorTotal()*0.4);
        venda1.setListaPagamento(fp1);
        venda1.setListaPagamento(fp2);
      
        Livraria livraria = new Livraria(1, "Waz Livraria");
        livraria.setVendas(venda1);
        
        JOptionPane.showMessageDialog(null, livraria.toString());
    }
}

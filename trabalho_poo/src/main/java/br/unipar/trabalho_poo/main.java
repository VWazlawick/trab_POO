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

public class main {

    public static void main(String[] args) {
        
        Editora e1 = new Editora(1, "Editora Rocco");
        Autor a1 = new Autor(1, "J. K. Rowlling.", "Inglesa");
        Livro l1 = new Livro("Harry Potter e o Cálice de Fogo", 1, 
                2000, "Fantasia", 45, e1, 583, 
                6, a1,20);

        Cliente c1 = new Cliente();
        c1.setNomeCliente("Victor Wazlawick");
        c1.setCpf("05889512935");
        
        Cidade cidade1 = new Cidade(1, "Toledo", 1, 
                "Paraná", 1, "Brasil");
        Endereco endereco1 = new Endereco("Rua Marumbi", "Jardim Gisela", 167, 
                "85905160", null, cidade1);
        
        c1.setEndereco(endereco1);
        
        FormaPagamento fp1 = new FormaPagamento(1, "Dinheiro");
        
        Venda v1 = new Venda(1, 45 , 1, c1);
        v1.setListaPagament(fp1);
        
        VendaLivro vl1 = new VendaLivro();
        vl1.setListaLivro(l1);
        vl1.setQtdProduto(1);
        vl1.setVenda(v1);
        vl1.setValorTotalProd(45);
        
        Livraria empresa = new Livraria(1, "Livraria Wazla");
        
        empresa.setVendaLivro(vl1);
        
      
        
    }
}

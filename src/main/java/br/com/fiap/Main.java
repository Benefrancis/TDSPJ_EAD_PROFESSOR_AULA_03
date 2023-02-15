package br.com.fiap;


import br.com.fiap.model.Produto;
import br.com.fiap.repository.ProdutoRepository;
import br.com.fiap.view.ProdutoView;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {


        var p = ProdutoView.form();


        ProdutoRepository repo = new ProdutoRepository("oracle-fiap");

        repo.getManager().getTransaction().begin();
        repo.save(p);

        repo.getManager().flush();


        repo.close();


        System.out.println(p);
    }

}
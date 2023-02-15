package br.com.fiap.repository;

import br.com.fiap.model.Produto;

public class ProdutoRepository extends Repository {

    public ProdutoRepository(String persistenceUnitName) {
        super(persistenceUnitName);
    }

    public void save(Produto p){
        this.getManager().persist(p);
    }

}

package br.com.fiap.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Repository {
    private EntityManagerFactory factory;
    private EntityManager manager;

    public Repository(String persistenceUnitName) {
        this.factory = Persistence.createEntityManagerFactory(persistenceUnitName);
        this.manager = factory.createEntityManager();
    }

    public EntityManager getManager() {
        return manager;
    }


    public void close() {
        this.manager.getTransaction().commit();
        this.manager.close();
        this.factory.close();
    }
}

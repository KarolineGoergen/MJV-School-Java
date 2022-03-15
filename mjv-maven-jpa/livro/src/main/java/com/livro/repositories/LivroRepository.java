package com.livro.repositories;

import com.livro.model.Livro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class LivroRepository {
    private EntityManager em;

    public LivroRepository(){
        EntityManagerFactory entityManagerFactory
                = Persistence.createEntityManagerFactory("LIVROS_PU");
        em =  entityManagerFactory.createEntityManager();
    }
    public void save(Livro livro){
        em.getTransaction().begin();
        em.persist(livro);
        em.getTransaction().commit();
    }
    public Livro findById(Integer id){
        Livro livro = em.find(Livro.class, id); 
        return livro;
    }
    public List<Livro> findAll(){
        Query query = em.createQuery("SELECT l FROM Livro l");
        return query.getResultList();
    }
}

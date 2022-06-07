package persistence;

import java.util.List;

import model.Matricula;
import org.hibernate.SessionFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;


public class MatriculaDAO implements IObjDAO<Matricula>{

    private SessionFactory sf;

    public MatriculaDAO(SessionFactory sf) {
        this.sf = sf;
    }

    @Override
    public void insere(Matricula mat) {
        EntityManager entityManager = sf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(mat);
        transaction.commit();
    }

    @Override
    public void modifica(Matricula mat) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(Matricula mat) {
        // TODO Auto-generated method stub

    }

    @Override
    public Matricula busca(Matricula mat) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Matricula> lista() {
        // TODO Auto-generated method stub
        return null;
    }

}

package persistence;

import java.util.List;

import model.Disciplina;
import org.hibernate.SessionFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;


public class DisciplinaDAO implements IObjDAO<Disciplina>{

    private SessionFactory sf;

    public DisciplinaDAO(SessionFactory sf) {
        this.sf = sf;
    }

    @Override
    public void insere(Disciplina dis) {
        EntityManager entityManager = sf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(dis);
        transaction.commit();
    }

    @Override
    public void modifica(Disciplina dis) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(Disciplina dis) {
        // TODO Auto-generated method stub

    }

    @Override
    public Disciplina busca(Disciplina dis) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Disciplina> lista() {
        // TODO Auto-generated method stub
        return null;
    }

}

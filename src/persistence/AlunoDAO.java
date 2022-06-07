package persistence;

import java.util.List;

import org.hibernate.SessionFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import model.Aluno;

public class AlunoDAO implements IObjDAO<Aluno>{

    private SessionFactory sf;

    public AlunoDAO(SessionFactory sf) {
        this.sf = sf;
    }

    @Override
    public void insere(Aluno alu) {
        EntityManager entityManager = sf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(alu);
        transaction.commit();
    }

    @Override
    public void modifica(Aluno alu) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(Aluno alu) {
        // TODO Auto-generated method stub

    }

    @Override
    public Aluno busca(Aluno alu) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Aluno> lista() {
        // TODO Auto-generated method stub
        return null;
    }

}

package org.example.Repository.MyPepositoryImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.Config.HibernateConfig;
import org.example.Entity.Programmer;
import org.example.Repository.MyRepository;

import java.util.List;
import java.util.Optional;

public class ProgrammerMyRepositoryImpl implements MyRepository<Programmer,Long> {
    private final EntityManagerFactory entityManagerFactory = HibernateConfig.entityManagerFactory();
    @Override
    public void save(Programmer programmer) {
        EntityManager entityManager1 = entityManagerFactory.createEntityManager();
        entityManager1.getTransaction().begin();
        entityManager1.persist(programmer);
        entityManager1.getTransaction().commit();
        entityManager1.close();

    }

    @Override
    public Optional<Programmer> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public String update(Long aLong, Programmer object) {
        return null;
    }

    @Override
    public String deleteById(Long aLong) {
        return null;
    }

    @Override
    public List<Programmer> findAll() {
        return null;
    }
}

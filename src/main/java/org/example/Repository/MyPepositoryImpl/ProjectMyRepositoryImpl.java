package org.example.Repository.MyPepositoryImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.Config.HibernateConfig;
import org.example.Entity.Project;
import org.example.Repository.MyRepository;

import java.util.List;
import java.util.Optional;

public class ProjectMyRepositoryImpl implements MyRepository<Project,Long> {
  private final EntityManagerFactory entityManagerFactory = HibernateConfig.entityManagerFactory();
    @Override
    public void save(Project object) {
   EntityManager entityManager = entityManagerFactory.createEntityManager();
   entityManager.getTransaction().begin();
   entityManager.persist(object);
   entityManager.getTransaction().commit();
   entityManager.close();
    }

    @Override
    public Optional<Project> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public String update(Long aLong, Project object) {
        return null;
    }

    @Override
    public String deleteById(Long aLong) {
        return null;
    }

    @Override
    public List<Project> findAll() {
        return null;
    }
}

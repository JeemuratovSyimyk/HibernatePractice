package org.example.Service.ServiceImpl;

import org.example.Entity.Project;
import org.example.Repository.MyPepositoryImpl.ProjectMyRepositoryImpl;
import org.example.Repository.MyRepository;
import org.example.Service.MyService;

import java.util.List;
import java.util.Optional;

public class ProjectServiceImpl implements MyService<Project,Long> {
 MyRepository<Project,Long>  projectMyRepository = new ProjectMyRepositoryImpl();
    @Override
    public void save(Project object) {
      projectMyRepository.save(object);
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

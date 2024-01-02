package org.example.Service.ServiceImpl;

import org.example.Entity.Programmer;
import org.example.Repository.MyPepositoryImpl.ProgrammerMyRepositoryImpl;
import org.example.Repository.MyRepository;
import org.example.Service.MyService;

import java.util.List;
import java.util.Optional;

public class ProgrammerServiceImpl implements MyService<Programmer, Long> {
   MyRepository<Programmer,Long> programmerMyService = new ProgrammerMyRepositoryImpl();
    @Override
    public void save(Programmer programmer) {
        programmerMyService.save(programmer);
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

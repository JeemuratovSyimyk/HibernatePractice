package org.example.Repository;

import java.util.List;
import java.util.Optional;

public interface MyRepository <T, ID>{
    void save (T object);
    Optional<T> findById(ID id);
    String update(ID id,T object);
    String deleteById(ID id);
    List<T> findAll();

}

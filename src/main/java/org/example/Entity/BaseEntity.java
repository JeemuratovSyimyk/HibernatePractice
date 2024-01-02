package org.example.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {
    @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "base_generator")
    private Long id;
}

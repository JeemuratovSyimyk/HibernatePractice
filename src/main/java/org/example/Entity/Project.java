package org.example.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "projects")
@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "base_generator,",sequenceName = "project_seq",allocationSize = 1)
public class Project extends BaseEntity{

    private String name;
    private String description;
 @ManyToMany
 @ToString.Exclude
   private List<Programmer> programmers;








}

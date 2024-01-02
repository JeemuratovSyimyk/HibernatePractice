package org.example.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "programmers")
@Setter @Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@SequenceGenerator(name = "base_generator,",sequenceName = "programmer_seq",allocationSize = 1)
public class Programmer extends BaseEntity{

    @Column(name = "full_name")
    private String fullName;
    private String email;
    private BigDecimal salary;
@ManyToMany(mappedBy = "programmers")
@ToString.Exclude
    private List<Project>projects;






}

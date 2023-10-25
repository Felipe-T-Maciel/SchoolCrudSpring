package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Professor extends Usuario{
    @ManyToOne
    private Escola escola;
    @ManyToMany(mappedBy = "professores")
    private List<Disciplina> listaDeDisciplinas;
}

package com.example.demo.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Escola{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    @OneToOne
    private Endereco endereco;
    @OneToMany(mappedBy = "escola")
    private List<Professor> listaDeProfessores;
    @OneToMany
    private List<Curso> listaDeCursos;
    @OneToOne(mappedBy = "escola")
    private Diretor diretor;

}

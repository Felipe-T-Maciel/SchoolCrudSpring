package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@IdClass(UsuarioIDClass.class)
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;
    @Id
    private Long cpf;
    private String nome;
    private String email;
    private String telefone;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Endereco endereco;
}

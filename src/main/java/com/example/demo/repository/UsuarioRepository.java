package com.example.demo.repository;

import com.example.demo.model.Usuario;
import com.example.demo.model.UsuarioIDClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UsuarioIDClass> {}

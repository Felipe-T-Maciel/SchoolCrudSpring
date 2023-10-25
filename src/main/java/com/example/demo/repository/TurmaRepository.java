package com.example.demo.repository;

import com.example.demo.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Integer> { }

package com.example.demo.service;

import com.example.demo.model.Curso;
import com.example.demo.repository.CursorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class CursoService {
    CursorRepository cursorRepository;

    public void salva(Curso curso){
        cursorRepository.save(curso);
    }

    public void delete(Integer id){
        cursorRepository.deleteById(id);
    }

    public Curso pegaUm(Integer id){
        return cursorRepository.findById(id).get();
    }

    public Collection<Curso> pegaTodos(){
        return cursorRepository.findAll();
    }
}

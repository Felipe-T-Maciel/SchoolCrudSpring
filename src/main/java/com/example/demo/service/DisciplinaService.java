package com.example.demo.service;

import com.example.demo.model.Disciplina;
import com.example.demo.model.Escola;
import com.example.demo.model.Usuario;
import com.example.demo.repository.DisciplinaRepository;
import com.example.demo.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class DisciplinaService {
    DisciplinaRepository disciplinaRepository;

    public void salva(Disciplina disciplina){
        disciplinaRepository.save(disciplina);
    }

    public void delete(Integer id){
        disciplinaRepository.deleteById(id);
    }

    public Disciplina pegaUm(Integer id){
        return disciplinaRepository.findById(id).get();
    }

    public Collection<Disciplina> pegaTodos(){
        return disciplinaRepository.findAll();
    }
}

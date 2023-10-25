package com.example.demo.service;

import com.example.demo.model.Turma;
import com.example.demo.model.Usuario;
import com.example.demo.repository.TurmaRepository;
import com.example.demo.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class TurmaService {
    TurmaRepository turmaRepository;

    public void salva(Turma turma){
        turmaRepository.save(turma);
    }

    public void delete(Integer id){
        turmaRepository.deleteById(id);
    }

    public Turma pegaUm(Integer id){
        return turmaRepository.findById(id).get();
    }

    public Collection<Turma> pegaTodos(){
        return turmaRepository.findAll();
    }
}

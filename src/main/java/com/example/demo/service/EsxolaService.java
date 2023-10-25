package com.example.demo.service;

import com.example.demo.model.Escola;
import com.example.demo.model.Turma;
import com.example.demo.repository.EscolaRepository;
import com.example.demo.repository.TurmaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class EsxolaService {
    EscolaRepository escolaRepository;

    public void salva(Escola escola){
        escolaRepository.save(escola);
    }

    public void delete(Integer id){
        escolaRepository.deleteById(id);
    }

    public Escola pegaUm(Integer id){
        return escolaRepository.findById(id).get();
    }

    public Collection<Escola> pegaTodos(){
        return escolaRepository.findAll();
    }
}

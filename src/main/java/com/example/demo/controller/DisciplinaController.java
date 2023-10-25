package com.example.demo.controller;

import com.example.demo.model.Disciplina;
import com.example.demo.service.DisciplinaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/disciplina")
@AllArgsConstructor
public class DisciplinaController {

    DisciplinaService disciplinaService;
    @PostMapping
    public void create(@RequestBody Disciplina disciplina){
        disciplinaService.salva(disciplina);
    }

    @PutMapping
    public void update(@RequestBody Disciplina disciplina){
        disciplinaService.salva(disciplina);
    }

    @DeleteMapping
    public void delete(@RequestParam Integer id){
        disciplinaService.delete(id);
    }

    @GetMapping("/todos")
    public Collection<Disciplina> getAll(){
        return disciplinaService.pegaTodos();
    }

    @GetMapping
    public Disciplina getOne(@RequestParam Integer id){
        return disciplinaService.pegaUm(id);
    }
}

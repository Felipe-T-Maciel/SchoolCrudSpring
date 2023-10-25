package com.example.demo.controller;

import com.example.demo.model.Turma;
import com.example.demo.service.TurmaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/turma")
@AllArgsConstructor
public class TurmaController {

    TurmaService turmaService;
    @PostMapping
    public void create(@RequestBody Turma turma){
        turmaService.salva(turma);
    }

    @PutMapping
    public void update(@RequestBody Turma turma){
        turmaService.salva(turma);
    }

    @DeleteMapping
    public void delete(@RequestParam Integer id){
        turmaService.delete(id);
    }

    @GetMapping("/todos")
    public Collection<Turma> getAll(){
        return turmaService.pegaTodos();
    }

    @GetMapping
    public Turma getOne(@RequestParam Integer id){
        return turmaService.pegaUm(id);
    }
}

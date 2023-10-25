package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.CursoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/curso")
@AllArgsConstructor
public class CursoController {

    CursoService cursoService;
    @PostMapping
    public void create(@RequestBody Curso curso){
        cursoService.salva(curso);
    }

    @PutMapping
    public void update(@RequestBody Curso curso){
        cursoService.salva(curso);
    }

    @DeleteMapping
    public void delete(@RequestParam Integer id){
        cursoService.delete(id);
    }

    @GetMapping("/todos")
    public Collection<Curso> getAll(){
        return cursoService.pegaTodos();
    }

    @GetMapping
    public Curso getOne(@RequestParam Integer id){
        return cursoService.pegaUm(id);
    }
}

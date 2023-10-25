package com.example.demo.controller;

import com.example.demo.model.Escola;
import com.example.demo.service.EsxolaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/escola")
@AllArgsConstructor
public class EscolaController {
    EsxolaService esxolaService;

    @PostMapping
    public void create(@RequestBody Escola escola){
        esxolaService.salva(escola);
    }

    @PutMapping
    public void update(@RequestBody Escola escola){
        esxolaService.salva(escola);
    }

    @DeleteMapping
    public void delete(@RequestParam Integer id){
        esxolaService.delete(id);
    }

    @GetMapping("/todos")
    public Collection<Escola> getAll(){
        return esxolaService.pegaTodos();
    }

    @GetMapping
    public Escola getOne(@RequestParam Integer id){
        return esxolaService.pegaUm(id);
    }
}

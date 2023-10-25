package com.example.demo.controller;

import com.example.demo.model.Aluno;
import com.example.demo.model.Diretor;
import com.example.demo.model.Professor;
import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/usuario")
public class UsuarioController {

    UsuarioService usuarioService;

    @PostMapping("/professor")
    public Usuario create(@RequestBody Professor usuario){
        return usuarioService.salva(usuario);
    }

    @PostMapping("/diretor")
    public Usuario create(@RequestBody Diretor usuario){
        return usuarioService.salva(usuario);
    }

    @PostMapping("/aluno")
    public Usuario create(@RequestBody Aluno usuario){
        return usuarioService.salva(usuario);
    }

    @PutMapping("/aluno")
    public void update(@RequestBody Aluno usuario){
        usuarioService.salva(usuario);
    }

    @PutMapping("/professor")
    public void update(@RequestBody Professor usuario){
        usuarioService.salva(usuario);
    }

    @PutMapping("/diretor")
    public void update(@RequestBody Diretor usuario){
        usuarioService.salva(usuario);
    }

    @DeleteMapping
    public void delete(@RequestParam Integer id, @RequestParam Long cpf){
        usuarioService.delete(id, cpf);
    }

    @GetMapping("/todos")
    public Collection<Usuario> getAll(){
        return usuarioService.pegaTodos();
    }

    @GetMapping
    public Usuario getOne(@RequestParam Integer id, @RequestParam Long cpf){
        return usuarioService.pegaUm(id, cpf);
    }
}

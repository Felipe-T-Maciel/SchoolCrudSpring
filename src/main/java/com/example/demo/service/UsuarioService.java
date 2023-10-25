package com.example.demo.service;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioService {
    UsuarioRepository usuarioRepository;

    public Usuario salva(Usuario usuario){
        usuarioRepository.save(usuario);
        return usuario;
    }

    public void delete(Integer id){
        usuarioRepository.deleteById(id);
    }

    public Usuario pegaUm(Integer id){
       return usuarioRepository.findById(id).get();
    }

    public List<Usuario> pegaTodos(){
        return usuarioRepository.findAll();
    }
}

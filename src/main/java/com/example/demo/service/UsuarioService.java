package com.example.demo.service;

import com.example.demo.model.Usuario;
import com.example.demo.model.UsuarioIDClass;
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

    public void delete(Integer id, Long cpf){
        usuarioRepository.deleteById(new UsuarioIDClass(id,cpf));
    }

    public Usuario pegaUm(Integer id, Long cpf){
       return usuarioRepository.findById(new UsuarioIDClass(id,cpf)).get();
    }

    public List<Usuario> pegaTodos(){
        return usuarioRepository.findAll();
    }
}

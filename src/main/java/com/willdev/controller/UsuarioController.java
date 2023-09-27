package com.willdev.controller;

import com.willdev.model.Usuario;
import com.willdev.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/users")
public class UsuarioController {
    private UsuarioRepository repository;
    @GetMapping
    public List<Usuario> list() {
        return repository.findAll();
    }
    @PostMapping
    public void sabe(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }
    @PutMapping
    public void update(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }

    @GetMapping
    public Usuario find(@PathVariable("/username") String username) {
        return repository.findByUserName(username);
    }
    @DeleteMapping
    public void delete(@PathVariable("/id") Integer id) {
        repository.deleteById(id);
    }


}

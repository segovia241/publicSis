package com.example.demo.controller;

import com.example.demo.model.Cliente;
import com.example.demo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    // Obtener todos los clientes
    @GetMapping
    public List<Cliente> listar() {
        return service.listar();
    }

    // Obtener cliente por ID
    @GetMapping("/{id}")
    public Cliente obtenerPorId(@PathVariable String id) {
        return service.obtenerPorId(id);
    }

    // Crear nuevo cliente
    @PostMapping
    public Cliente guardar(@RequestBody Cliente cliente) {
        return service.guardar(cliente);
    }

    // Actualizar cliente existente
    @PutMapping("/{id}")
    public Cliente actualizar(@PathVariable String id, @RequestBody Cliente cliente) {
        return service.actualizar(id, cliente);
    }

    // Eliminar cliente por ID
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        service.eliminar(id);
    }
}

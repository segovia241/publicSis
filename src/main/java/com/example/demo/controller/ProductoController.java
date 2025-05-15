package com.example.demo.controller;

import com.example.demo.model.Producto;
import com.example.demo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService service;

    // Listar todos los productos
    @GetMapping
    public List<Producto> listar() {
        return service.listar();
    }

    // Obtener producto por ID
    @GetMapping("/{id}")
    public Producto obtenerPorId(@PathVariable String id) {
        return service.obtenerPorId(id);
    }

    // Crear nuevo producto
    @PostMapping
    public Producto guardar(@RequestBody Producto producto) {
        return service.guardar(producto);
    }

    // Actualizar producto
    @PutMapping("/{id}")
    public Producto actualizar(@PathVariable String id, @RequestBody Producto producto) {
        return service.actualizar(id, producto);
    }

    // Eliminar producto
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        service.eliminar(id);
    }
}

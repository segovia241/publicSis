package com.example.demo.controller;

import com.example.demo.model.Pedido;
import com.example.demo.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @GetMapping
    public List<Pedido> listar() {
        List<Pedido> pedidos = service.listar();
        System.out.println("Pedidos encontrados: " + pedidos);
        return pedidos;
    }

    @GetMapping("/{id}")
    public Pedido obtenerPorId(@PathVariable String id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public Pedido guardar(@RequestBody Pedido pedido) {
        return service.guardar(pedido);
    }

    @PutMapping("/{id}")
    public Pedido actualizar(@PathVariable String id, @RequestBody Pedido pedido) {
        pedido.setIdPedido(id);
        return service.guardar(pedido);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        service.eliminar(id);
    }
}

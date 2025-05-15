package com.example.demo.controller;

import com.example.demo.model.DetallePedido;
import com.example.demo.repository.DetallePedidoRepository;
import com.example.demo.service.DetallePedidoService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class DetallePedidoController {

    private final DetallePedidoService service;

    public DetallePedidoController(DetallePedidoService service) {
        this.service = service;
    }

    @GetMapping("/api/detalles/{idPedido}")
    public List<DetallePedido> getDetallesPorPedido(@PathVariable String idPedido) {
        return service.obtenerPorIdPedido(idPedido);
    }

    @PostMapping("/api/detalle-pedidos")
    public DetallePedido guardarDetalle(@RequestBody DetallePedido detallePedido) {
        return service.guardar(detallePedido);
    }

    @DeleteMapping("/api/detalles/{idPedido}")
    public void eliminarDetallesPorPedido(@PathVariable String idPedido) {
        service.eliminarPorIdPedido(idPedido);
    }
}

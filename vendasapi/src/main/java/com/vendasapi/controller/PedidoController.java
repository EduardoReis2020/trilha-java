package com.vendasapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vendasapi.domain.model.Pedido;
import com.vendasapi.service.PedidoService;

import io.swagger.v3.oas.annotations.Operation;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @Operation(summary = "Listar todos os pedidos")
    @GetMapping
    public List<Pedido> listarTodos() {
        return pedidoService.listarTodos();
    }

    @Operation(summary = "Buscar pedido por ID")
    @GetMapping("/{id}")
    public Optional<Pedido> buscarPorId(@PathVariable Long id) {
        return pedidoService.buscarPorId(id);
    }

    @Operation(summary = "Criar um novo pedido")
    @PostMapping
    public Pedido criar(@RequestBody Pedido pedido) {
        return pedidoService.salvar(pedido);
    }

    @Operation(summary = "Atualizar status do pedido")
    @PutMapping("/{id}")
    public Pedido atualizarStatus(@PathVariable Long id, @RequestBody Pedido pedidoAtualizado) {
        return pedidoService.atualizar(id, pedidoAtualizado);
    }

    @Operation(summary = "Deletar pedido por ID")
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        pedidoService.deletar(id);
    }
}

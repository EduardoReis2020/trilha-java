package com.vendasapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vendasapi.domain.model.ItemPedido;
import com.vendasapi.service.ItemPedidoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/itens-pedido")
@Tag(name = "ItemPedido", description = "Gerenciamento de itens de pedido")
public class ItemPedidoController {

    @Autowired
    private ItemPedidoService itemPedidoService;

    @Operation(summary = "Listar todos os itens de pedido")
    @GetMapping
    public List<ItemPedido> listarTodos() {
        return itemPedidoService.listarTodos();
    }

    @Operation(summary = "Buscar item de pedido por ID")
    @GetMapping("/{id}")
    public Optional<ItemPedido> buscarPorId(@PathVariable Long id) {
        return itemPedidoService.buscarPorId(id);
    }

    @Operation(summary = "Criar um novo item de pedido")
    @PostMapping
    public ItemPedido criar(@RequestBody ItemPedido itemPedido) {
        return itemPedidoService.salvar(itemPedido);
    }

    @Operation(summary = "Deletar item de pedido por ID")
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        itemPedidoService.deletar(id);
    }
}

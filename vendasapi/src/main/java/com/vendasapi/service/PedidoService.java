package com.vendasapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vendasapi.domain.model.ItemPedido;
import com.vendasapi.domain.model.Pedido;
import com.vendasapi.domain.model.Produto;
import com.vendasapi.domain.repository.PedidoRepository;
import com.vendasapi.domain.repository.ProdutoRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Pedido> listarTodos() {
        return pedidoRepository.findAll();
    }

    public Optional<Pedido> buscarPorId(Long id) {
        return pedidoRepository.findById(id);
    }

    public Pedido salvar(Pedido pedido) {
        // Verifica estoque e atualiza os produtos
        for (ItemPedido item : pedido.getItens()) {
            Produto produto = item.getProduto();
            produto.reduzirEstoque(item.getQuantidade());
            produtoRepository.save(produto);
        }

        pedido.setDataPedido(LocalDate.now());
        pedido.calcularValorTotal();

        return pedidoRepository.save(pedido);
    }

    public void deletar(Long id) {
        pedidoRepository.deleteById(id);
    }

    public Pedido atualizar(Long id, Pedido pedidoAtualizado) {
        Pedido pedido = pedidoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));

        pedido.setStatus(pedidoAtualizado.getStatus());
        return pedidoRepository.save(pedido);
    }
}
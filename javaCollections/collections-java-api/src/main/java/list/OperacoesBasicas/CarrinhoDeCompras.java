package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itensList; 

    public CarrinhoDeCompras() { 
        this.itensList = new ArrayList<>(); 
    }

    public void adicionarItem(String nome, double preco, int quantidade) { 
        this.itensList.add(new Item(nome, preco, quantidade)); 
    }

    public void removerItem(String nome) { 
        this.itensList.removeIf(item -> item.getNome().equals(nome)); 
    }

    public double calcularTotal() { 
        double total = 0; 
        for (Item item : itensList) { 
            total += item.getPreco() * item.getQuantidade(); 
        }
        return Math.round(total * 100.0) / 100.0; 
    }

    public void exibirItens() { 
        System.out.println("Itens no carrinho:"); 
        for (Item item : itensList) { 
            System.out.println(item); 
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(); 

        // Adiciona itens ao carrinho
        carrinho.adicionarItem("Camiseta", 30.59, 2); 
        carrinho.adicionarItem("Calça", 55.99, 1); 
        carrinho.adicionarItem("Tênis", 90.89, 1); 

        // Exibe os itens no carrinho
        carrinho.exibirItens(); 

        // Calcula e exibe o total do carrinho
        double total = carrinho.calcularTotal(); 
        System.out.println("Total: R$ " + total); 

        // Remove um item do carrinho
        carrinho.removerItem("Calça"); 

        // Exibe os itens no carrinho após a remoção
        carrinho.exibirItens(); 
    }
}

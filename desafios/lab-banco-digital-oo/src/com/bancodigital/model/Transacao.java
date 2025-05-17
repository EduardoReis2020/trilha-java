package com.bancodigital.model;
import java.time.LocalDateTime;

public class Transacao {
    private String tipo; 
    private double valor;
    private LocalDateTime dataHora;
    private String descricao;

    public Transacao(String tipo, double valor, String descricao) {
        this.tipo = tipo;
        this.valor = valor;
        this.dataHora = LocalDateTime.now();
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s de R$ %.2f - %s", dataHora, tipo, valor, descricao);
    }

    // Getters e setters (opcional)
}

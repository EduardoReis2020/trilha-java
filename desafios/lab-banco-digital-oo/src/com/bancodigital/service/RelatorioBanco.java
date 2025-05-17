package com.bancodigital.service;
import java.util.Set;

import com.bancodigital.model.Banco;
import com.bancodigital.model.Conta;

public class RelatorioBanco {

    public static void gerarRelatorio(Banco banco) {
        System.out.println("=== Relatório do Banco: " + banco.getNome() + " ===");
        Set<Conta> contas = banco.getContas();
        System.out.println("Total de contas: " + contas.size());

        double totalSaldo = 0;
        for (Conta c : contas) {
            totalSaldo += c.getSaldo();
        }

        System.out.println("Total em saldo: R$ " + String.format("%.2f", totalSaldo));
        System.out.println("Saldo médio por conta: R$ " + String.format("%.2f", totalSaldo / contas.size()));
    }
}

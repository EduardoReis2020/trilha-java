package com.bancodigital;

import com.bancodigital.model.*;
import com.bancodigital.repository.BancoRepository;

public class Main {
    public static void main(String[] args) {
        // Usar repositório para carregar ou criar o banco
        BancoRepository bancoRepository = new BancoRepository();
        Banco banco = bancoRepository.getBanco();

        // Clientes
        Cliente cliente1 = new Cliente("Alice");
        Cliente cliente2 = new Cliente("Bob");

        // Contas
        ContaCorrente cc = new ContaCorrente(cliente1);
        ContaPoupanca cp = new ContaPoupanca(cliente2);

        // Adiciona contas ao banco
        banco.adicionarConta(cc); // deve adicionar
        banco.adicionarConta(cp); // deve adicionar
        banco.adicionarConta(cc); // deve recusar (duplicata)

        // Operações básicas
        cc.depositar(1000);
        cc.sacar(200);
        cc.transferir(300, cp);

        cp.depositar(500);
        cp.aplicarRendimentoMensal(1.5); // 1.5% de rendimento
        cc.cobrarTaxaMensal(15);         // taxa de manutenção

        // Imprimir extratos
        System.out.println("\n=== Extratos ===");
        cc.imprimirExtrato();
        cp.imprimirExtrato();

        // Imprimir histórico
        System.out.println("\n--- Histórico CC ---");
        cc.imprimirHistorico();

        System.out.println("\n--- Histórico CP ---");
        cp.imprimirHistorico();

        // Teste de busca
        System.out.println("\n? Buscando conta 1...");
        Conta encontrada = banco.buscarContaPorNumero(1);
        if (encontrada != null) {
            encontrada.imprimirExtrato();
        } else {
            System.out.println("Conta não encontrada.");
        }

        // Teste de exceções
        System.out.println("\n? Testando erros:");
        try {
            cc.sacar(10000); // saldo insuficiente
        } catch (Exception e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        try {
            cp.depositar(-50); // valor inválido
        } catch (Exception e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }
    }
}

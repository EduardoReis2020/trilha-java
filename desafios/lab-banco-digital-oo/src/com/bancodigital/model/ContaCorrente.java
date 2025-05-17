package com.bancodigital.model;
import com.bancodigital.exception.SaldoInsuficienteException;
import com.bancodigital.exception.ValorInvalidoException;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

    public void cobrarTaxaMensal(double valorTaxa) {
        if (valorTaxa < 0) throw new ValorInvalidoException("Taxa inválida.");
        if (valorTaxa > saldo) throw new SaldoInsuficienteException("Saldo insuficiente para taxa.");
        saldo -= valorTaxa;
        historico.add(new Transacao("TAXA", valorTaxa, "Taxa de manutenção"));
    }

}
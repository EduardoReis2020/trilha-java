package com.bancodigital.model;
import com.bancodigital.exception.ValorInvalidoException;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}

    public void aplicarRendimentoMensal(double taxaPercentual) {
        if (taxaPercentual < 0) throw new ValorInvalidoException("Taxa de rendimento inválida.");
        double rendimento = saldo * (taxaPercentual / 100);
        saldo += rendimento;
        historico.add(new Transacao("RENDIMENTO", rendimento, "Rendimento aplicado"));
    }
}
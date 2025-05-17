package com.bancodigital.model;
import java.util.ArrayList;
import java.util.List;

import com.bancodigital.exception.SaldoInsuficienteException;
import com.bancodigital.exception.ValorInvalidoException;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

    protected List<Transacao> historico = new ArrayList<>();

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		if (valor <= 0) throw new ValorInvalidoException("Valor de saque deve ser positivo.");
        if (valor > saldo) throw new SaldoInsuficienteException("Saldo insuficiente para saque.");
        saldo -= valor;
        historico.add(new Transacao("SAQUE", valor, "Saque realizado"));
    }

	@Override
	public void depositar(double valor) {
        if (valor <= 0) throw new ValorInvalidoException("Valor de depósito deve ser positivo.");
		saldo += valor;
        historico.add(new Transacao("DEPOSITO", valor, "Depósito realizado"));
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
        if (contaDestino == null) throw new IllegalArgumentException("Conta de destino inválida.");
		this.sacar(valor);
		contaDestino.depositar(valor);
        historico.add(new Transacao("TRANSFERENCIA", valor, "Transferência realizada"));
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return agencia == conta.agencia && numero == conta.numero;
    }

    @Override
    public int hashCode() {
        return 31 * agencia + numero;
    }


	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

    public void imprimirHistorico() {
        System.out.println("=== Histórico de Transações ===");
        for (Transacao t : historico) {
            System.out.println(t);
        }
    }
}
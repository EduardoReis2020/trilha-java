package com.bancodigital.model;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Banco {

	private String nome;
	private Set<Conta> contas = new HashSet<>();

	public Banco(String string) {
        this.nome = string;
        this.contas = new HashSet<>();
    }

    public Banco() {
        this("Banco Digital");
    }

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conta> getContas() {
		return contas;
	}

	public void setContas(Set<Conta> contas) {
		this.contas = contas;
	}

    public boolean adicionarConta(Conta conta) {
        if (contas.contains(conta)) {
            System.out.println("⚠️ Conta já existente: Agência " + conta.getAgencia() + ", Número " + conta.getNumero());
            return false;
        }
        contas.add(conta);
        System.out.println("✅ Conta adicionada com sucesso!");
        return true;
    }


    public Conta buscarContaPorNumero(int numero) {
        for (Conta c : contas) {
            if (c.getNumero() == numero) {
                return c;
            }
        }
        return null;
    }

    public List<Conta> buscarContasPorCliente(String nomeCliente) {
        List<Conta> resultado = new ArrayList<>();
        for (Conta c : contas) {
            if (c.cliente.getNome().equalsIgnoreCase(nomeCliente)) {
                resultado.add(c);
            }
        }
        return resultado;
    }
}
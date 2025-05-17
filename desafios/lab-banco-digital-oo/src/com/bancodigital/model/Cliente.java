package com.bancodigital.model;

public class Cliente {

	private String nome;

	public Cliente(String string) {
        this.nome = string;
    }

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
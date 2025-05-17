package com.bancodigital.repository;

import com.bancodigital.model.Banco;

public class BancoRepository {

    private Banco banco;

    public BancoRepository() {
        banco = new Banco("Banco Digital"); 
    }

    public Banco getBanco() {
        return banco;
    }
}

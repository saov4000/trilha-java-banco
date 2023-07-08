package com.example.banco;

public class Corrente extends Conta {

    public Corrente(String agencia, String numero, Cliente cliente) {
        super(agencia, numero, cliente);
        this.tipo = "Corrente";
    }
}

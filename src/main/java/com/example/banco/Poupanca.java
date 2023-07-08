package com.example.banco;

public class Poupanca extends Conta {

    public Poupanca(String agencia, String numero, Cliente cliente) {
        super(agencia, numero, cliente);
        this.tipo = "Poupanca";
    }

        
}

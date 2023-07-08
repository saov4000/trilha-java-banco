package com.example.banco;

public interface Operacoes {
    
    void depositar(double valor);

    void sacar(double valor);

    void transferir(double valor, Operacoes contaDestno);

    void exibirExtrato();
}

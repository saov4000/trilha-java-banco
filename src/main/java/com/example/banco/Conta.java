package com.example.banco;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter 
@ToString
@RequiredArgsConstructor
public class Conta implements Operacoes{
    
    @NoNull
    protected final String agencia;
    @NoNull
    protected final String numero;
    private double saldo = 0;
    @NoNull
    protected final Cliente cliente;
    protected String tipo;

    @Override
    public void depositar(double valor) {
       this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
       this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, Operacoes contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void exibirExtrato() {
        System.out.println("========== Banco Java =========");
        System.out.println("Titular: "+ this.cliente.getTitular());
        System.out.println("Agencia: "+ this.agencia);
        System.out.println("Numero: "+this.numero);
        System.out.println("Tipo: " + this.tipo);
        System.out.println(String.format("Saldo: R$ %.2f",this.saldo));
        System.out.println(" ");
    }
}

package com.example.banco;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoApplication {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setTitular("Astrogildo");

		Conta cc = new Corrente("0001", "1-1", cliente);
		Conta cp = new Poupanca("0001", "2-1", cliente);

		cc.depositar(100);
		cc.exibirExtrato();

		cp.exibirExtrato();
		cc.sacar(50);

		cc.exibirExtrato();

		cc.transferir(25, cp);

		cc.exibirExtrato();
		cp.exibirExtrato();
	}

}

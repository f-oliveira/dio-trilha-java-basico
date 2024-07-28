package com.digital;


import com.digital.controller.ContaCorrente;
import com.digital.controller.ContaPoupanca;
import com.digital.entity.Cliente;
import com.digital.entity.Conta;

public class App {

	public static void main(String[] args) {
		Cliente ricardo = new Cliente();
		ricardo.setNome("Ricardo");
		
		Conta cc = new ContaCorrente(ricardo);
		Conta poupanca = new ContaPoupanca(ricardo);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
package com.digital.controller;

import com.digital.entity.Cliente;
import com.digital.entity.Conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("--- Extrato Conta Corrente ---");
		super.imprimirInfosComuns();
	}
	
}
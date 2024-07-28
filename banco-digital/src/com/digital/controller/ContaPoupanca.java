package com.digital.controller;
import com.digital.entity.Cliente;
import com.digital.entity.Conta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("--- Extrato Conta Poupança ---");
		super.imprimirInfosComuns();
	}
}
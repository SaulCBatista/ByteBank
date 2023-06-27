package br.SaulProgramador.ByteBank;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean tranferir(double valor, Conta destino) {
		return false;
	}
	
}

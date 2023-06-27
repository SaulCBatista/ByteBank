package br.SaulProgramador.ByteBank;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean sacar(double valor) {
		double valorSaque = valor + 0.2;
		return super.sacar(valorSaque);
	}

	@Override
	public boolean tranferir(double valor, Conta destino) {
		if(super.getSaldo() >= valor) {
			this.sacar(valor);
			destino.depositar(valor);
			return true;
		}
		return false;
	}

}

package br.SaulProgramador.ByteBank;

public abstract class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		Conta.total ++;
		//System.out.println("Nova conta criada: " + this.numero);
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} 
			return false;
	}
	
	public abstract boolean tranferir(double valor, Conta destino);
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não é aceito valor nulo ou negativo.");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Não é aceito valor nulo ou negativo.");
			return;
		}
		this.numero = numero;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
}

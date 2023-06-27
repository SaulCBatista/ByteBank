package br.saulProgramador.bytebank;

public abstract interface Autenticavel { 

	public abstract void setSenha(int senha);
	
	public abstract boolean autetica(int senha);
	
}

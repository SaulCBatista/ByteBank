package br.saulProgramador.bytebank;

public class AutenticacaoUtil {

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autetica(int senha)  {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
}

package br.saulProgramador.bytebank;

public class Cliente implements Autenticavel {

	AutenticacaoUtil autenticador;
	
	public Cliente() {
		autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		autenticador.setSenha(senha);
	}

	@Override
	public boolean autetica(int senha)  {
		return autenticador.autetica(senha);
	}

}

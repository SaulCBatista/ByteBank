package br.saulProgramador.bytebank;

public class Gerente extends Funcionario implements Autenticavel{
	
	private int senha;
	
	@Override
	public double getBonificacao() {
		System.out.println("Bonificação do Gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autetica(int senha)  {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
}

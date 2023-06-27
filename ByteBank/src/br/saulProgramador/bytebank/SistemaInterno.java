package br.saulProgramador.bytebank;

public class SistemaInterno {

	private int senha = 2222;
	
	public void autetica(Autenticavel a) {
		boolean auteticou = a.autetica(this.senha);
		if(auteticou) {
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("Não pode entrar no sistema!");
		}
	}
	
}

package br.saulProgramador.bytebank;

public class EditorVideo extends Funcionario{
	
	@Override
	public double getBonificacao() {
		System.out.println("Bonificação do Editor de video");
		return 100;
	}
	
}

package br.saulProgramador.bytebank;

public class Designer extends Funcionario{
	
	@Override
	public double getBonificacao() {
		System.out.println("Bonificação do Designer");
		return 200;
	}
	
}

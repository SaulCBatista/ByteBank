package br.SaulProgramador.ByteBank;

public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(2222, 3333);
		cc.depositar(100);
		
		SeguroDeVida seguro = new SeguroDeVida();
	
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		calculador.registra(seguro);
		calculador.registra(cc);
		
		System.out.println(calculador.getTotalImposto());

	}

}

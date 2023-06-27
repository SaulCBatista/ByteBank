package br.saulProgramador.bytebank;

public class TesteReferencia {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		EditorVideo ev1 = new EditorVideo();
		Designer d1 = new Designer();
		
		g1.setSalario(5000.0);
		
		ev1.setSalario(2500.0);
		
		d1.setSalario(2200.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(g1);
		controle.registra(ev1);
		controle.registra(d1);
		
		System.out.println(controle.getSoma());
	}
	
}

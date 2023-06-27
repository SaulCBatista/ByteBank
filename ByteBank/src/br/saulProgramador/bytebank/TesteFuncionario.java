package br.saulProgramador.bytebank;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Gerente();
		
		f1.setNome("Nico");
		f1.setCpf("222.222.221-1");
		f1.setSalario(2000);
		
		//f1.salario = 300;
		
		System.out.println(f1.getNome());
		System.out.println(f1.getSalario());
		System.out.println(f1.getBonificacao());
	}
	
}

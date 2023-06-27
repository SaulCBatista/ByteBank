package br.saulProgramador.bytebank;

public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		Administrador adm = new Administrador();
		Cliente c = new Cliente();
		
		g.setSenha(2222);
		adm.setSenha(3333);
		c.setSenha(2121);
		
		SistemaInterno si = new SistemaInterno();
		si.autetica(g);
		si.autetica(adm);
		si.autetica(c);
	}
	
}

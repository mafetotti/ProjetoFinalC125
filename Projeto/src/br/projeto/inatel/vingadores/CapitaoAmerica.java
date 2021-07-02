package br.projeto.inatel.vingadores;


public class CapitãoAmérica extends Heróis {

	public CapitãoAmérica(String nome, String poder, float força) {
		super(nome,poder,força);
	}

	@Override
	public void SofrendoAtaque() {
		força -= 10;
	}
	
	public void AtacandoThanos() {
		força+= 20;
	}
	
	@Override
	public void mostrainfo() {
		System.out.println("Nome: " + nome + "\n"
				+ "Poder: " + poder + "\n"
				+ "Força: " + força);
}
	
}

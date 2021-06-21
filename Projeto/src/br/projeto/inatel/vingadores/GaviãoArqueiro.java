package br.projeto.inatel.vingadores;

public class GaviãoArqueiro extends Heróis {

	public GaviãoArqueiro(String nome, String poder, float força) {
		super(nome,poder,força);
	}

	@Override
	public void SofrendoAtaque() {
		força-= 10;
	}
	
	public void AtacandoThanos() {
		força+= 5;
	}
	
	@Override
	public void mostrainfo() {
		System.out.println("Nome: " + nome + "\n"
				+ "Poder: " + poder + "\n"
				+ ""
				+ "Força: " + força);
}
}

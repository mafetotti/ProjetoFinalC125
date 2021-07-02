package br.projeto.inatel.vingadores;

public class GaviaoArqueiro extends Herois {

	public GaviaoArqueiro(String nome, String poder, float forca) {
		super(nome,poder,forca);
	}

	@Override
	public void SofrendoAtaque() {
		forca-= 10;
	}
	
	public void AtacandoThanos() {
		forca+= 5;
	}
	
	@Override
	public void mostrainfo() {
		System.out.println("Nome: " + nome + "\n"
				+ "Poder: " + poder + "\n"
				+ ""
				+ "Força: " + forca);
}
}

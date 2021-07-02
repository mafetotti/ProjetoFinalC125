package br.projeto.inatel.vingadores;

public class HomemDeFerro extends Herois {

	public HomemDeFerro(String nome, String poder, float forca) {
		super(nome,poder,forca);
	}

	@Override
	public void SofrendoAtaque() {
		forca-=10;
		
	}
	
	public void AtacandoThanos() {
		forca+= 10;
	}
	
	@Override
	public void mostrainfo() {
		System.out.println("Nome: " + nome + "\n"
				+ "Poder: " + poder + "\n"
				+ "Força: " + forca);
}
	
}

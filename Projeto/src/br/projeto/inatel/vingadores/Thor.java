package br.projeto.inatel.vingadores;

public class Thor extends Herois {

	public Thor(String nome, String poder, float força) {
		super(nome,poder,força);
	}

	@Override
	public void SofrendoAtaque() {
		forca-=10;
		
	}
	
	public void AtacandoThanos() {
		forca+= 30;
	}
	
	@Override
	public void mostrainfo() {
		System.out.println("Nome: " + nome + "\n"
				+ "Poder: " + poder + "\n"
				+ "Força: " + forca);
}
	
	

}

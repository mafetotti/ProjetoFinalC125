package br.projeto.inatel.marvel;

public abstract class Marvel {
	
	protected String nome;
	protected String poder;
	protected float forca;
	
	public Marvel(String nome, String poder, float forca) {
		this.nome = nome;
		this.poder= poder;
		this.forca = forca;
	}

	public abstract void SofrendoAtaque();
	
	public abstract void mostrainfo();
}

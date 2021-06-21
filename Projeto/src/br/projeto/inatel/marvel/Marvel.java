package br.projeto.inatel.marvel;

public abstract class Marvel {
	
	protected String nome;
	protected String poder;
	protected float força;
	
	public Marvel(String nome, String poder, float força) {
		this.nome = nome;
		this.poder= poder;
		this.força = força;
	}

	public abstract void SofrendoAtaque();
	
	public abstract void mostrainfo();
}

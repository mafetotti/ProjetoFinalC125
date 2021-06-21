package br.inatel.cdg.computador;

public class Componente {
	
	private String tipo;
	private String nome;

	public Componente(String tipo, String nome) {
		this.nome=nome;
		this.tipo=tipo;
	}

	public String getTipo() {
		return tipo;
	}

	
	public String getNome() {
		return nome;
	}

	

}

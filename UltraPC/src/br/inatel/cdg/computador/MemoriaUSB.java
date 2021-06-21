package br.inatel.cdg.computador;

public class MemoriaUSB {

	private String marca;
	private long capacidade;
	
	public MemoriaUSB(String marca, long capacidade) {
		this.marca=marca;
		this.capacidade=capacidade;
	}

	public String getMarca() {
		return marca;
	}

	
	public long getCapacidade() {
		return capacidade;
	}

	

}

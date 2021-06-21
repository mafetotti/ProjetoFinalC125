package br.inatel.cdg.cliente;

import br.inatel.cdg.computador.*;

public class Cliente {

	private String nome;
	private long cpf;
	Computador computador[];
	private double soma =0;
	
	
	public Cliente (String nome,long cpf,int qtdcomputador) {
		this.nome=nome;
		this.cpf=cpf;
		this.computador= new Computador [qtdcomputador];
		
	}
	
	public double calculacompra() {
		
		for(Computador calcula : computador) {
			soma= soma + calcula.getPreco();
		}
		
		return soma;
		
		
	}
	
	public void adccomputador(Computador computador) {
		for (int i = 0; i < this.computador.length ; i++) {
			if (this.computador[i] == null) {
				this.computador[i] = computador;
				break;
			}

		}
	}
}

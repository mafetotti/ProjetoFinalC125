package br.projeto.inatel.viloes;


public class Thanos extends Viloes {
	
	int JoiaDoInfinito;

	public Thanos(String nome, String poder, float forca) {
		super(nome, poder, forca);
	}

	public void AtacandoVingadores() {
		 forca += 10;
	}
	
	public void CapturandoJoias(int joia) throws JoiaDoInfinitoInexistente {
		JoiaDoInfinito+= joia;
		
		if(JoiaDoInfinito == 6) {
			System.out.println("Foi capturada as 6 jóias do infinito, Thanos vence os vingadores" +
	"\n" + "Tudo isso acontece em: Vingadores Guerra Infinita");
		}
		
		else if (JoiaDoInfinito < 6) {
			System.out.println("Thanos ja capturou " + JoiaDoInfinito + " joias do infinito");
		}
		
		else {
			throw new JoiaDoInfinitoInexistente (" Não existe mais joias Thanos");
		}
	}

	@Override
	public void SofrendoAtaque() {
		forca-= 20;
		
	}
	
	@Override
	public void mostrainfo() {
		System.out.println("Nome: " + nome + "\n"
				+ "Poder: " + poder + "\n"
				+ "Força: " + forca);
}
	
	
}

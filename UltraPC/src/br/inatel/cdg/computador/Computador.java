package br.inatel.cdg.computador;


public class Computador {

	private String marca;
	private double preco;
	Componente componente[];
	SistemaOperacional sisop;
	MemoriaUSB memoriausb;
	
	public Computador(String marca, double preco,int qtdcomponentes,String nomesistema) {
		this.marca=marca;
		this.preco=preco;
		this.componente= new Componente[qtdcomponentes];
		sisop= new SistemaOperacional(nomesistema);
		
		
	}

	public void adcmemoriaUSB(MemoriaUSB mem) {
		this.memoriausb=mem;
	}
	
	public void adccomponentes(Componente comp) {
		for (int i = 0; i < this.componente.length ; i++) {
			if (this.componente[i] == null) {
				this.componente[i] = comp;
				break;
			}

		}
	}
	
	
	
	public String getMarca() {
		return marca;
	}


	public double getPreco() {
		return preco;
	}
	

	public void mostrainfo()
	{
		System.out.println("marca do pc: " + getMarca());
		System.out.println("preco do pc: "+ getPreco());
		
		for (Componente componentes : componente) {
			if (componentes == null) 
				break;
			
				System.out.println("Nome do componente do pc: " + componentes.getNome());
				System.out.println("Tipo do componente do pc: " + componentes.getTipo());
			
		}
		
			if (memoriausb == null) 
				System.out.println("memoria indisponivel");
			
			else {
		
				System.out.println( memoriausb.getCapacidade());
				System.out.println("Marca do pc: " + memoriausb.getMarca());
			}
			
		
		
		if(!(this.sisop==null)) {
		System.out.println("nome do sistema operacional do pc é: " + sisop.getNome());
		}
	}
}

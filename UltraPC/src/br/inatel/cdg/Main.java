package br.inatel.cdg;

import br.inatel.cdg.cliente.*;
import br.inatel.cdg.computador.*;

public class Main {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("apolonia", 123, 2);

		Computador pc1 = new Computador("AlienWare", 6000, 4, "SteamOS");
		Computador pc2 = new Computador("Positivo Xuxa", 1800, 4, "windowns 98");

		pc1.adccomponentes(new Componente("GPU", "Geforce RTx 3000"));
		pc1.adccomponentes(new Componente("CPU", "Intel i5"));
		pc1.adccomponentes(new Componente("SSD", "1T4"));
		pc1.adccomponentes(new Componente("RAM", "32GB"));
		pc1.mostrainfo();

		cliente1.adccomputador(pc1);

		pc2.adccomponentes(new Componente("CPU", "Pentium III"));
		pc2.adccomponentes(new Componente("HD", "100GB"));
		pc2.adccomponentes(new Componente("RAM", "1GB"));
		pc2.adccomponentes(new Componente("Modem", "Discado"));
		pc2.adcmemoriaUSB(new MemoriaUSB("kingston", 8));

		cliente1.adccomputador(pc2);
		pc2.mostrainfo();

		System.out.println("total da compra:" + cliente1.calculacompra());

	}

}

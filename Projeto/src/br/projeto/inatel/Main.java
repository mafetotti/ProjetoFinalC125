package br.projeto.inatel;

import br.projeto.inatel.vilões.*;
import br.projeto.inatel.vingadores.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {

	public static void main(String[] args) {

		Thor Thor = new Thor("Thor", "Martelo", 100);
		CapitãoAmérica CapitaoAmerica = new CapitãoAmérica("Steve Rogers", "Super Força", 100);
		GaviãoArqueiro GaviãoArqueiro = new GaviãoArqueiro("Clint Barton", "Habilidade em atirar com arco e flexa",
				100);
		Hulk Hulk = new Hulk("Bruce Banner", "Incontrolável força", 100);
		ViúvaNegra ViúvaNegra = new ViúvaNegra("Natasha  Romanoff", "habilidade em lutar", 100);
		HomemDeFerro HomemDeFerro = new HomemDeFerro("Tony Stark", "Inteligência", 100);
		Thanos Thanos = new Thanos("Thanos", "Super força", 100);

		Path arquivo = Paths.get("MotivosParaAssistirOsFilmesDaMarvel.txt");
		
		try {
			Files.write(arquivo,
					"Porque é bom demais, se você não gostou é porque assistiu errado, assiste novamente\n".getBytes(),
					StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		} catch (IOException erro) {
			erro.printStackTrace();
		}
		
		Thor.mostrainfo();
		CapitaoAmerica.mostrainfo();
		GaviãoArqueiro.mostrainfo();
		Hulk.mostrainfo();
		ViúvaNegra.mostrainfo();
		HomemDeFerro.mostrainfo();
		Thanos.mostrainfo();

		Thor.AtacandoThanos();
		Thanos.SofrendoAtaque();

		Thanos.AtacandoVingadores();
		CapitaoAmerica.SofrendoAtaque();
		ViúvaNegra.SofrendoAtaque();

		CapitaoAmerica.AtacandoThanos();
		Thanos.SofrendoAtaque();

		HomemDeFerro.AtacandoThanos();
		Thanos.SofrendoAtaque();

		Thanos.AtacandoVingadores();
		ViúvaNegra.SofrendoAtaque();
		HomemDeFerro.SofrendoAtaque();
		GaviãoArqueiro.SofrendoAtaque();

		try {
			Thanos.CapturandoJoias(4);
		} catch (JoiaDoInfinitoInexistente erro) {
			System.out.println(erro.getMessage());
		}

		Thanos.AtacandoVingadores();
		Thor.SofrendoAtaque();
		HomemDeFerro.SofrendoAtaque();
		HomemDeFerro.SofrendoAtaque();

		try {
			Thanos.CapturandoJoias(2);
		} catch (JoiaDoInfinitoInexistente erro) {
			System.out.println(erro.getMessage());
		}

		try {
			Files.write(arquivo,
					"Porque é bom demais, se você não gostou é porque assistiu errado, assiste novamente\n".getBytes(),
					StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		} catch (IOException erro) {
			erro.printStackTrace();
		}

		System.out.println("Porem em Vingadores Ultimato eles voltam no tempo e vencem Thanos");

		try {
			Files.write(arquivo,
					"Porque é bom demais, se você não gostou é porque assistiu errado, assiste novamente\n".getBytes(),
					StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}

}

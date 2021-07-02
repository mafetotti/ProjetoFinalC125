package br.projeto.inatel.viloes;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import br.projeto.inatel.viloes.JoiaDoInfinitoInexistente;
import br.projeto.inatel.viloes.Thanos;
import br.projeto.inatel.vingadores.Thor;

public class TesteThanos {
	
	@Test
	public void testaJoiaVazia() {
		
		Thanos thanos = new Thanos("Thanos", "Super força", 100);
		try {
			thanos.CapturandoJoias(8);
			fail();
		} catch (JoiaDoInfinitoInexistente e) {
			e.printStackTrace();
			assertTrue(true);
		}
		
		
		
		
		
		
		
	}
}

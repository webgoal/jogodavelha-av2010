package jogodavelha;

import org.junit.Assert;
import org.junit.Test;

public class JogoTest extends Assert {
	
	@Test
	public void jogoIniciaComTabuleiroVazio() {
		JogoDaVelha jogo = new JogoDaVelha();
		String tabuleiroVazio =
			"...\n" + 
			"...\n" +
			"...";
		assertEquals(tabuleiroVazio , jogo.getTabuleiro());
	}
	
	@Test
	public void jogadorOJogaNaPrimeiraCasa() {
		JogoDaVelha jogo = new JogoDaVelha();
		String tabuleiro =
			"o..\n" + 
			"...\n" +
			"...";
		
		jogo.jogar('o', 1, 1);
		assertEquals(tabuleiro , jogo.getTabuleiro());
	}
	
	@Test
	public void jogadorXJogaDepoisDoO() {
		JogoDaVelha jogo = new JogoDaVelha();
		String tabuleiro =
			"o..\n" + 
			".x.\n" +
			"...";
		
		jogo.jogar('o', 1, 1);
		jogo.jogar('x', 2, 2);
		assertEquals(tabuleiro , jogo.getTabuleiro());
	}
	
	@Test
	public void variasJogadas() {
		JogoDaVelha jogo = new JogoDaVelha();
		String tabuleiro =
			".o.\n" + 
			".x.\n" +
			"..o";
		
		jogo.jogar('o', 1, 2);
		jogo.jogar('x', 2, 2);
		jogo.jogar('o', 3, 3);
		assertEquals(tabuleiro , jogo.getTabuleiro());
	}
}

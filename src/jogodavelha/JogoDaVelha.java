package jogodavelha;

public class JogoDaVelha {

	char[][] tabuleiro = new char[][] {
			{'.','.','.'},
			{'.','.','.'},
			{'.','.','.'}
	};
	
	public String getTabuleiro() {
		return montaTabuleiro();
	}

	private String montaTabuleiro() {
		String tabuleiroString = "";
		for (char[] linha : tabuleiro)
			tabuleiroString += montaLinha(linha) +"\n";
		return tabuleiroString.trim();
	}

	private String montaLinha(char[] linha) {
		String linhaString = "";
		for (char casa : linha)
			linhaString += casa;
		return linhaString;
	}

	public void jogar(char jogador, int linha, int coluna) {
		tabuleiro[linha-1][coluna-1] = jogador;
	}

}

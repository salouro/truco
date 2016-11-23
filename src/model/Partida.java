package model;

public class Partida {
	private Jogador vencedor;
	private int pontosDisputados;
	
	public Partida(){
	}

	public Jogador getVencedor() {
		return vencedor;
	}

	public void setVencedor(Jogador vencedor) {
		this.vencedor = vencedor;
	}

	public int getPontosDisputados() {
		return pontosDisputados;
	}

	public void setPontosDisputados(int pontosDisputados) {
		this.pontosDisputados = pontosDisputados;
	}
}

package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Jogo {
	private Set<Jogador> jogadores;
	private int numeroJogadores;
	private Date data;
	private int pontosA;
	private int pontosB;
	private Jogador vencedor;
	private List<Partida> partidas;
	private Baralho baralho;

	public Jogo() {
		this.jogadores = new HashSet<Jogador>();
		this.partidas = new ArrayList<Partida>();
	}

	public void addJogador(Jogador j) {
		jogadores.add(j);
	}

	public Baralho getBaralho() {
		return baralho;
	}

	public void setBaralho(Baralho baralho) {
		this.baralho = baralho;
	}

	public Set<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(Set<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public int getNumeroJogadores() {
		return numeroJogadores;
	}

	public void setNumeroJogadores(int numeroJogadores) {
		this.numeroJogadores = numeroJogadores;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getPontosA() {
		return pontosA;
	}

	public void setPontosA(int pontosA) {
		this.pontosA = pontosA;
	}

	public int getPontosB() {
		return pontosB;
	}

	public void setPontosB(int pontosB) {
		this.pontosB = pontosB;
	}
<<<<<<< HEAD

	public Jogador getVencedor() {
		return vencedor;
	}

	public void setVencedor(Jogador vencedor) {
		this.vencedor = vencedor;
	}

	public List<Partida> getPartidas() {
		return partidas;
	}

	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}

=======
	
	
	
>>>>>>> refs/remotes/origin/master
}

package model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Jogo {
	private Set<Jogador> jogadores;
	private int numeroJogadores;
	private Date data;
	private int pontosA;
	private int pontosB;
	
	public Jogo(){
		this.jogadores = new HashSet<Jogador>();
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
}

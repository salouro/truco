package model;

import java.util.ArrayList;
import java.util.List;

import enumerated.Naipe;
import enumerated.Valor;

public class Turno {
	private int numero;
	private List<Carta> cartasJogadas;
<<<<<<< HEAD
	private Jogador vencedor;

	public Turno() {
		this.cartasJogadas = new ArrayList<Carta>();
	}

	public void addCarta(Carta c) {
=======
	private int pontuacaoJogador;
	private int pontuacaoPc;
	private Jogador vencedor;
	private Jogador fezPrimeiraRodada;
	private int valorPontosTurno;
	private Carta manilha;
	
	public Turno(){
		this.cartasJogadas = new ArrayList<Carta>();
	}
	
	
	
	public Carta getManilha() {
		return manilha;
	}



	public void setManilha(Carta manilha) {
		this.manilha = manilha;
	}



	public int getValorPontosTurno() {
		return valorPontosTurno;
	}



	public void setValorPontosTurno(int valorPontosTurno) {
		this.valorPontosTurno = valorPontosTurno;
	}



	public Jogador getFezPrimeiraRodada() {
		return fezPrimeiraRodada;
	}



	public void setFezPrimeiraRodada(Jogador fezPrimeiraRodada) {
		this.fezPrimeiraRodada = fezPrimeiraRodada;
	}



	public Jogador getVencedor() {
		return vencedor;
	}



	public void setVencedor(Jogador vencedor) {
		this.vencedor = vencedor;
	}



	public int getPontuacaoJogador() {
		return pontuacaoJogador;
	}



	public void setPontuacaoJogador(int pontuacaoJogador) {
		this.pontuacaoJogador = pontuacaoJogador;
	}



	public int getPontuacaoPc() {
		return pontuacaoPc;
	}



	public void setPontuacaoPc(int pontuacaoPc) {
		this.pontuacaoPc = pontuacaoPc;
	}



	public void addCarta(Carta c){
>>>>>>> refs/remotes/origin/master
		this.cartasJogadas.add(c);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Carta> getCartasJogadas() {
		return cartasJogadas;
	}

	public void setCartasJogadas(List<Carta> cartasJogadas) {
		this.cartasJogadas = cartasJogadas;
	}

	public Jogador getVencedor() {
		return vencedor;
	}

	public void setVencedor(Jogador vencedor) {
		this.vencedor = vencedor;
	}

}

package model;

import java.util.List;

public abstract class Jogador {
	private List<Carta> mao;
	private String nome;
	private int pontuacao;
	
	
	public Jogador(String nome){
		this.nome = nome;
	}
	
	
	public abstract Carta jogarCarta();
	
	
	public List<Carta> getMao() {
		return mao;
	}
	public void setMao(List<Carta> mao) {
		this.mao = mao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
}
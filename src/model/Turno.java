package model;

import java.util.ArrayList;
import java.util.List;

import enumerated.Naipe;
import enumerated.Valor;

public class Turno {
	private int numero;
	private List<Carta> cartasJogadas;
	
	public Turno(){
		this.cartasJogadas = new ArrayList<Carta>();
	}
	
	public void addCarta(Carta c){
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
}

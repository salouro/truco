package controller;

import java.util.List;
import java.util.Random;
import java.util.Set;

import model.Baralho;
import model.Carta;
import model.Jogador;
import model.Partida;

public class ControlPartida {

	private ControlTurno ct;
	private Partida partida;
	
	public ControlPartida() {		
		this.ct = new ControlTurno();
	}

	public void iniciarTurno() {
		
	}
	
	public void distribuiCartas(Set<Jogador> j, Baralho b){
		embaralhar(b);
		
		for (int i = 0; i < 3; i++){
			for (Jogador jo : j){
				jo.addCarta(b.getCartas().remove(0));
			}
		}
		
		for (Jogador jo : j){
			System.out.println(jo.getNome());
			
			for (Carta c : jo.getMao()){
				System.out.println(c.getValor() + " de " + c.getNaipe());
			}
		}
	}
	
	public void embaralhar(Baralho b) {
		List<Carta> cartas = b.getCartas();
		Random gerador = new Random();
		Carta aux;
		int indice;

		for (int j = 0; j < 50; j++) {
			for (int i = 0; i < cartas.size(); i++) {
				indice = gerador.nextInt(cartas.size());
				aux = cartas.get(indice);
				cartas.set(indice, cartas.get(i));
				cartas.set(i, aux);
			}
		}
	}

	public void verificarVencedorTurno() {	
		
	}

	public void verificarVendorPartida() {

	}

	public void atualizarPlacar() {

	}

	public void jogadaPC() {
		Random a = new Random();
		int tempo;
		tempo = a.nextInt(6);
		try {
			Thread.sleep(1000 + (tempo*2000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
	}

	public void jogadaJogador() {
		
	}

}

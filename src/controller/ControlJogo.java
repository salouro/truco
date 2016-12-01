package controller;

import java.util.List;
import java.util.Random;

import enumerated.Naipe;
import enumerated.Valor;
import model.Baralho;
import model.Carta;
import model.CriadorCarta;
import model.CriadorPC;
import model.CriadorPessoa;
import model.FactoryJogador;
import model.Jogador;
import model.PC;
import model.Partida;
import model.Turno;

import java.util.concurrent.Semaphore;

public class ControlJogo {
	private CriadorCarta fabricaCarta;
	private FactoryJogador fabricaJogador;
	private Valor[] valores;
	private Naipe[] naipes;
	static Semaphore semaforo = new Semaphore(1);

	public ControlJogo() {
		this.fabricaCarta = new CriadorCarta();
		this.valores = Valor.values();
		this.naipes = Naipe.values();
	}

	public void embaralhar(Baralho b) {
		List<Carta> cartas = b.getCartas();
		Random gerador = new Random();
		Carta aux;
		int indice;

		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < cartas.size(); i++) {
				indice = gerador.nextInt(cartas.size());
				aux = cartas.get(indice);
				cartas.set(indice, cartas.get(i));
				cartas.set(i, aux);
			}
		}
	}

	public void setarBaralho(boolean bool) {

		Baralho b = new Baralho();
		b.setTipo(bool);
		if (b.isTipo()) {
			geraBaralho(b, 0);
		} else {
			geraBaralho(b, 4);
		}

	}

	public void geraBaralho(Baralho b, int k) {
		for (int i = k; i < 10; i++) {
			for (int j = 0; j < 4; j++) {
				addCarta(b, valores[i], naipes[j]);
			}
		}
	}

	public void addCarta(Baralho b, Valor v, Naipe n) {
		Carta c = fabricaCarta.novo();

		c.setValor(v);
		c.setNaipe(n);
		b.addCarta(c);
	}

	public Jogador setarJogador(boolean cond) {
		if (cond) {
			fabricaJogador = new CriadorPessoa();
		} else {
			fabricaJogador = new CriadorPC();
		}
 
		return fabricaJogador.novo();
	}

	
	public void run(Jogador jogador, Baralho baralho, Partida partida, Turno turno, PC pc, Semaphore semaforo) {
		ControlPartida partidas = new ControlPartida(jogador, baralho, partida, turno, pc, semaforo);
		partidas.run();
	}
}
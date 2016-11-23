package controller;

import java.util.List;

import enumerated.Naipe;
import enumerated.Valor;
import model.Baralho;
import model.Carta;
import model.CriadorCarta;

public class ControlJogo {
	private CriadorCarta fabricaCarta;
	private Valor[] valores;
	private Naipe[] naipes;

	public ControlJogo() {
		this.fabricaCarta = new CriadorCarta();
		this.valores = Valor.values();
		this.naipes = Naipe.values();
	}

	public void setarBaralho(Baralho b) {
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
}

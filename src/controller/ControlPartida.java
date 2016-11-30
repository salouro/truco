package controller;

import java.util.Random;

public class ControlPartida {

	public ControlPartida() {
	}

	public void iniciarTurno() {
		System.out.println("jogador" + 1 + "vai iniciar");
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

package controller;

import java.util.Random;

import model.PC;

public class ControlPartida {
	public ControlPartida() {
		PC p1 = new PC("Z�");
		PC p2 = new PC("Chit�o");
		PC p3 = new PC("Marrone");
		
		System.out.println(p1.getNome());
		System.out.println(p2.getNome());
		System.out.println(p3.getNome());
		
	}

	public void iniciarTurno(int inicio, String nome) {
		switch (inicio) {
		case 1:
			System.out.println("Z� come�a o turno");
			break;
		case 2:
			System.out.println("Chit�o come�a o turno");
			break;
		case 3:
			System.out.println("Marrone come�a o turno");
			break;
		case 4:
			System.out.println(nome + " come�a o turno");
			break;
		}
		
		if(inicio<4){
			jogadaPC();
		}else{
			jogadaJogador();
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

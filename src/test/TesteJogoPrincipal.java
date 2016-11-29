package test;

import javax.swing.JFrame;

import view.jogo.JogoPrincipal;

public class TesteJogoPrincipal {

	public static void main(String[] args) {
		JogoPrincipal jogo = new JogoPrincipal();
		jogo.setVisible(true);
		jogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

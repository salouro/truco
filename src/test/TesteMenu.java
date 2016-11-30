package test;

import javax.swing.JFrame;

import core.MediaPlayer;
import view.menu.Menu;

public class TesteMenu {

	public static void main(String[] args) {
		Menu menuPrincipal = new Menu();
		menuPrincipal.setSize(490,420);
		menuPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuPrincipal.setVisible(true);
		menuPrincipal.setResizable(false);
		MediaPlayer mp = new MediaPlayer("/resource/music");
		mp.run();


	}

}

package test;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.swing.JFrame;

import core.MediaPlayer;
import core.PlayerListener;
import view.menu.Menu;

public class TesteMenu{

	public static void main(String[] args) {
		Menu menuPrincipal = new Menu();
		menuPrincipal.setSize(490,420);
		menuPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuPrincipal.setVisible(true);
		menuPrincipal.setResizable(false);		
	}
}

package view.menu;

import javax.swing.JFrame;

public class Menu extends JFrame {

	private PainelMenu painel;

	public Menu() {
		painel = new PainelMenu();
		setContentPane(painel);
	}

}

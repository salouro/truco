package view.jogo;

import javax.swing.JFrame;

public class JogoPrincipal extends JFrame {

	private PainelJogo painel;

	public JogoPrincipal() {
		this.setSize(1200, 800);
		this.setResizable(false);
		painel = new PainelJogo();
		this.setContentPane(painel);
	}

}

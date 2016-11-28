package view.jogo;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

class PainelJogo extends JPanel {
	

	public PainelJogo() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		Image background = new ImageIcon(getClass().getResource("/img/cenario/fundo-mesa.png")).getImage();
		g.drawImage(background,0,0,this);
		
	}
	
}

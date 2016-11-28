package view.jogo;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class JogoPrincipal extends JFrame{

	private ImageIcon fundo = new ImageIcon(getClass().getResource("fundo-mesa.png"));
	private PainelJogo painel;
	
	public JogoPrincipal(){
		setSize(1200,800);
		setResizable(false);
		painel = new PainelJogo();
		setContentPane(painel);
	}
	
	public class PainelJogo extends JPanel {
		
		private static final long serialVersionUID = 1L;

		public PainelJogo() {
			setBorder(new EmptyBorder(5, 5, 5, 5));
			setLayout(null);
		}
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			
			Image backgound = fundo.getImage();
			g.drawImage(backgound,0,0,this);
			
		}
		
	}
}

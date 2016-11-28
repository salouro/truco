package view.menu;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.net.URL;
import java.text.AttributedCharacterIterator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.w3c.dom.events.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;

public class Menu extends JFrame {

	private PainelMenu painel;
	private JLabel novo;
	private JLabel placar;
	private ImageIcon fundo = new ImageIcon(getClass().getResource("mesa 3.2.png"));

	
	public Menu() {
		painel = new PainelMenu();
		setContentPane(painel);
	}
	
	
	public class PainelMenu extends JPanel {
		
		private static final long serialVersionUID = 1L;

		public PainelMenu() {
			setBorder(new EmptyBorder(5, 5, 5, 5));
			setLayout(null);
			criarMenu();
		}
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			
			Image backgound = fundo.getImage();
			g.drawImage(backgound,0,0,this);
			
		}
		
		public void criarMenu() {
			ImageIcon novoIcon = new ImageIcon(getClass().getResource("novo1.jpg"));
			ImageIcon novoHoverIcon = new ImageIcon(getClass().getResource("novo.jpg"));
			ImageIcon placarIcon = new ImageIcon(getClass().getResource("Placar1.jpg"));
			ImageIcon placarHoverIcon = new ImageIcon(getClass().getResource("Placar.jpg"));
			
			novo = new JLabel();
			novo.setIcon(novoIcon);
			novo.setBounds(177, 116, 131, 46);
			add(novo);
			
			placar = new JLabel();
			placar.setIcon(placarIcon);
			placar.setBounds(177, 186, 139, 52);
			add(placar);
			
			
			novo.addMouseListener(new MouseListener() {
				@Override
				public void mouseReleased(java.awt.event.MouseEvent arg0) {}
				@Override
				public void mousePressed(java.awt.event.MouseEvent arg0) {}
				@Override
				public void mouseExited(java.awt.event.MouseEvent arg0) {novo.setIcon(novoIcon);}
				@Override
				public void mouseEntered(java.awt.event.MouseEvent arg0) {novo.setIcon(novoHoverIcon);}
				@Override
				public void mouseClicked(java.awt.event.MouseEvent arg0) {
					MenuNovo novoJogo = new MenuNovo();
					novoJogo.setVisible(true);
				}
			});
			
			placar.addMouseListener(new MouseListener() {
				@Override
				public void mouseReleased(java.awt.event.MouseEvent arg0) {}
				@Override
				public void mousePressed(java.awt.event.MouseEvent arg0) {}
				@Override
				public void mouseExited(java.awt.event.MouseEvent arg0) {placar.setIcon(placarIcon);}
				@Override
				public void mouseEntered(java.awt.event.MouseEvent arg0) {placar.setIcon(placarHoverIcon);}
				@Override
				public void mouseClicked(java.awt.event.MouseEvent arg0) {}
			});


		}
	}

}
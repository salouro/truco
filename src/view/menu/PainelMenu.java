package view.menu;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PainelMenu extends JPanel {
	private JLabel novo;
	private JLabel placar;
	AudioClip clip;

	public PainelMenu() {
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLayout(null);
		this.criarMenu();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Image background = new ImageIcon(this.getClass().getResource("/img/cenario/mesa-3.2.png")).getImage();
		g.drawImage(background, 0, 0, this);

	}

	public void criarMenu() {
		clip = Applet.newAudioClip(getClass().getResource("musica-fundo-menu.wav"));
		clip.loop();
		
		
		ImageIcon novoIcon = new ImageIcon(this.getClass().getResource("/img/cenario/novo1.jpg"));
		ImageIcon novoHoverIcon = new ImageIcon(this.getClass().getResource("/img/cenario/novo.jpg"));
		ImageIcon placarIcon = new ImageIcon(this.getClass().getResource("/img/cenario/placar1.jpg"));
		ImageIcon placarHoverIcon = new ImageIcon(this.getClass().getResource("/img/cenario/placar.jpg"));

		novo = new JLabel();
		novo.setIcon(novoIcon);
		this.add(novo);
		novo.setBounds(177, 116, 131, 46);

		placar = new JLabel();
		placar.setIcon(placarIcon);
		this.add(placar);
		placar.setBounds(177, 186, 139, 52);

		novo.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(java.awt.event.MouseEvent arg0) {
			}

			@Override
			public void mousePressed(java.awt.event.MouseEvent arg0) {
			}

			@Override
			public void mouseExited(java.awt.event.MouseEvent arg0) {
				novo.setIcon(novoIcon);
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent arg0) {
				novo.setIcon(novoHoverIcon);
			}

			@Override
			public void mouseClicked(java.awt.event.MouseEvent arg0) {
				MenuNovo novoJogo = new MenuNovo();
				novoJogo.setVisible(true);
				clip.stop();
			}
		});

		placar.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(java.awt.event.MouseEvent arg0) {
			}

			@Override
			public void mousePressed(java.awt.event.MouseEvent arg0) {
			}

			@Override
			public void mouseExited(java.awt.event.MouseEvent arg0) {
				placar.setIcon(placarIcon);
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent arg0) {
				placar.setIcon(placarHoverIcon);
			}

			@Override
			public void mouseClicked(java.awt.event.MouseEvent arg0) {
			}
		});

	}
}
package view.menu;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PainelMenu extends JPanel {
	private ImageIcon fundo;
	private JLabel novo;
	private JLabel placar;

	public PainelMenu() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		criarMenu();
		this.fundo = new ImageIcon(this.getClass().getResource("/img/cenario/mesa-3.2.png"));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Image backgound = fundo.getImage();
		g.drawImage(backgound, 0, 0, this);

	}

	public void criarMenu() {
		ImageIcon novoIcon = new ImageIcon(this.getClass().getResource("/img/cenario/novo1.jpg").getPath());
		ImageIcon novoHoverIcon = new ImageIcon(this.getClass().getResource("/img/cenario/novo.jpg").getPath());
		ImageIcon placarIcon = new ImageIcon(this.getClass().getResource("/img/cenario/placar1.jpg").getPath());
		ImageIcon placarHoverIcon = new ImageIcon(this.getClass().getResource("/img/cenario/placar.jpg").getPath());

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
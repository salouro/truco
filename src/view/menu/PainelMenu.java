package view.menu;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PainelMenu extends JPanel{

	private JLabel novo;
	private JLabel placar;
	private ImageIcon novoIcon = new ImageIcon(this.getClass().getResource("/resource/img/cenario/novo1.jpg"));
	private ImageIcon novoHoverIcon = new ImageIcon(this.getClass().getResource("/resource/img/cenario/novo.jpg"));
	private ImageIcon placarIcon = new ImageIcon(this.getClass().getResource("/resource/img/cenario/placar1.jpg"));
	private ImageIcon placarHoverIcon = new ImageIcon(this.getClass().getResource("/resource/img/cenario/placar.jpg"));

	public PainelMenu() {
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLayout(null);
		this.criarMenu();
		this.setName("cu");
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Image background = new ImageIcon(this.getClass().getResource("/resource/img/cenario/mesa-3.2.png")).getImage();
		g.drawImage(background, 0, 0, this);

	}

	public void criarMenu() {

		this.novo = new JLabel();
		this.novo.setIcon(novoIcon);
		this.novo.setName("novo");
		this.add(novo);
		this.novo.setBounds(177, 116, 131, 46);

		this.placar = new JLabel();
		this.placar.setIcon(placarIcon);
		this.placar.setName("placar");
		this.add(placar);
		this.placar.setBounds(177, 186, 139, 52);

		/*
		 * novo.addMouseListener(new MouseListener() {
		 * 
		 * @Override public void mouseReleased(java.awt.event.MouseEvent arg0) {
		 * }
		 * 
		 * @Override public void mousePressed(java.awt.event.MouseEvent arg0) {
		 * }
		 * 
		 * @Override public void mouseExited(java.awt.event.MouseEvent arg0) {
		 * novo.setIcon(novoIcon); }
		 * 
		 * @Override public void mouseEntered(java.awt.event.MouseEvent arg0) {
		 * novo.setIcon(novoHoverIcon); }
		 * 
		 * @Override public void mouseClicked(java.awt.event.MouseEvent arg0) {
		 * System.out.println(arg0.getComponent().getName()); novoJogo = new
		 * MenuNovo(); } });
		 * 
		 * placar.addMouseListener(new MouseListener() {
		 * 
		 * @Override public void mouseReleased(java.awt.event.MouseEvent arg0) {
		 * }
		 * 
		 * @Override public void mousePressed(java.awt.event.MouseEvent arg0) {
		 * }
		 * 
		 * @Override public void mouseExited(java.awt.event.MouseEvent arg0) {
		 * placar.setIcon(placarIcon); }
		 * 
		 * @Override public void mouseEntered(java.awt.event.MouseEvent arg0) {
		 * placar.setIcon(placarHoverIcon); }
		 * 
		 * @Override public void mouseClicked(java.awt.event.MouseEvent arg0) {
		 * } });
		 */

	}
/*
	@Override
	public void mouseClicked(MouseEvent e) {
		String name = e.getComponent().getName();
		
		if (name.equalsIgnoreCase(this.novo.getName())){
			this.setEnabled(false);
			this.novoJogo = new MenuNovo();
			this.novoJogo.setVisible(true);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		String name = e.getComponent().getName();

		if (name.equalsIgnoreCase(novo.getName())) {
			this.novo.setIcon(this.novoHoverIcon);
		} else if (name.equalsIgnoreCase(placar.getName())) {
			this.placar.setIcon(this.placarHoverIcon);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		String name = e.getComponent().getName();

		if (name.equalsIgnoreCase(novo.getName())) {
			this.novo.setIcon(this.novoIcon);
		} else if (name.equalsIgnoreCase(placar.getName())) {
			this.placar.setIcon(this.placarIcon);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}*/

	public JLabel getNovo() {
		return novo;
	}

	public void setNovo(JLabel novo) {
		this.novo = novo;
	}

	public JLabel getPlacar() {
		return placar;
	}

	public void setPlacar(JLabel placar) {
		this.placar = placar;
	}

	public ImageIcon getNovoIcon() {
		return novoIcon;
	}

	public void setNovoIcon(ImageIcon novoIcon) {
		this.novoIcon = novoIcon;
	}

	public ImageIcon getNovoHoverIcon() {
		return novoHoverIcon;
	}

	public void setNovoHoverIcon(ImageIcon novoHoverIcon) {
		this.novoHoverIcon = novoHoverIcon;
	}

	public ImageIcon getPlacarIcon() {
		return placarIcon;
	}

	public void setPlacarIcon(ImageIcon placarIcon) {
		this.placarIcon = placarIcon;
	}

	public ImageIcon getPlacarHoverIcon() {
		return placarHoverIcon;
	}

	public void setPlacarHoverIcon(ImageIcon placarHoverIcon) {
		this.placarHoverIcon = placarHoverIcon;
	}
}
package view.menu;

import java.awt.Dialog;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import core.MediaPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

public class Menu extends JFrame implements MouseListener {

	private PainelMenu painel;
	private MenuNovo novoJogo;

	public Menu() {
		painel = new PainelMenu();
		this.setContentPane(painel);
		this.painel.getNovo().addMouseListener(this);
		this.painel.getPlacar().addMouseListener(this);
	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		String name = e.getComponent().getName();

		if (name.equalsIgnoreCase(this.painel.getNovo().getName())) {
			this.novoJogo = new MenuNovo(this);
			this.novoJogo.setModalityType(Dialog.ModalityType.DOCUMENT_MODAL);
			this.novoJogo.setVisible(true);
			this.novoJogo.setLocationRelativeTo(this);
			this.novoJogo.setResizable(false);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		String name = e.getComponent().getName();

		if (name.equalsIgnoreCase(this.painel.getNovo().getName())) {
			this.painel.getNovo().setIcon(this.painel.getNovoHoverIcon());
		} else if (name.equalsIgnoreCase(this.painel.getPlacar().getName())) {
			this.painel.getPlacar().setIcon(this.painel.getPlacarHoverIcon());
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		String name = e.getComponent().getName();

		if (name.equalsIgnoreCase(this.painel.getNovo().getName())) {
			this.painel.getNovo().setIcon(this.painel.getNovoIcon());
		} else if (name.equalsIgnoreCase(this.painel.getPlacar().getName())) {
			this.painel.getPlacar().setIcon(this.painel.getPlacarIcon());
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

}

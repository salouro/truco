package view.jogo;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.ControlJogo;
import controller.ControlPartida;
import model.Carta;

public class JogoPrincipal extends JFrame implements MouseListener {

	private PainelJogo painel;
	private ControlPartida cp;
	private ControlJogo cj;

	public JogoPrincipal(ControlJogo cj) {
		this.cj = cj;
		cp = new ControlPartida();
		this.setSize(900, 600);
		this.setResizable(false);
		painel = new PainelJogo(cj.getJogadorHumano());
		this.setContentPane(painel);
		this.painel.getCard1().addMouseListener(this);
		this.painel.getCard2().addMouseListener(this);
		this.painel.getCard3().addMouseListener(this);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		String name = e.getComponent().getName();

		if (name.equalsIgnoreCase(this.painel.getCard1().getName())) { // caso
																		// seja
																		// clicado
																		// na
																		// carta1
			this.painel.moverCardParaMesa(this.painel.getCard1());
			cp.jogadaJogador();
		} else if (name.equalsIgnoreCase(this.painel.getCard2().getName())) { // clicado
																				// carta
																				// 2
			this.painel.moverCardParaMesa(this.painel.getCard2());
			cp.jogadaJogador();
		} else if (name.equalsIgnoreCase(this.painel.getCard3().getName())) { // caso
																				// seja
																				// clicado
																				// na
																				// carta3
			this.painel.moverCardParaMesa(this.painel.getCard3());
			cp.jogadaJogador();
		}

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		String name = e.getComponent().getName();
		Carta c = null;
		JLabel card = null;
		List<Carta> cartas = cj.getJogadorHumano().getMao();

		if (name.equalsIgnoreCase(this.painel.getCard1().getName())) {
			card = painel.getCard1();
		} else if (name.equalsIgnoreCase(this.painel.getCard2().getName())) {
			card = painel.getCard2();
		} else if (name.equalsIgnoreCase(this.painel.getCard3().getName())) {
			card = painel.getCard3();
		}

		System.out.println(card.getName());

		for (Carta carta : cartas) {
			if (card.getName().contains(carta.getNaipe().toString().toLowerCase())
					&& card.getName().contains(carta.getValor().toString().toLowerCase())) {
				c = carta;
			}
		}

		System.out.println(c.getValor());
		System.out.println(c.getNaipe());

		painel.setIconeGrande(card, c.getNaipe().toString().toLowerCase(), c.getValor().toString().toLowerCase());
	}

	@Override
	public void mouseExited(MouseEvent e) {
		String name = e.getComponent().getName();
		Carta c = null;
		JLabel card = null;
		List<Carta> cartas = cj.getJogadorHumano().getMao();

		if (name.equalsIgnoreCase(this.painel.getCard1().getName())) {
			card = painel.getCard1();
		} else if (name.equalsIgnoreCase(this.painel.getCard2().getName())) {
			card = painel.getCard2();
		} else if (name.equalsIgnoreCase(this.painel.getCard3().getName())) {
			card = painel.getCard3();
		}

		System.out.println(card.getName());

		for (Carta carta : cartas) {
			if (card.getName().contains(carta.getNaipe().toString().toLowerCase())
					&& card.getName().contains(carta.getValor().toString().toLowerCase())) {
				c = carta;
			}
		}

		System.out.println(c.getValor());
		System.out.println(c.getNaipe());

		painel.setIconePequeno(card, c.getNaipe().toString().toLowerCase(), c.getValor().toString().toLowerCase(),
				card.getX());

	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

}

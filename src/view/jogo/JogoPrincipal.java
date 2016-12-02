package view.jogo;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import controller.ControlJogo;
import controller.ControlPartida;
import controller.ControlTurno;
import model.Carta;
import model.Jogo;

public class JogoPrincipal extends JFrame implements MouseListener {

	private PainelJogo painel;
	private ControlPartida cp;
	private ControlJogo cj;
	private ControlTurno ct;

	public JogoPrincipal(String nome, boolean tipo, int n) {
		
		ct = new ControlTurno();
		cp = new ControlPartida(ct);
		cj = new ControlJogo(cp);
		
		cj.iniciaJogo(nome, tipo, n);
		
		this.setSize(900, 600);
		this.setResizable(false);
		
		painel = new PainelJogo();
		this.setContentPane(painel);
				
		inicioPartida();
	}
	
	public void addCardMouseListener(){
		this.painel.getCard1().addMouseListener(this);
		this.painel.getCard2().addMouseListener(this);
		this.painel.getCard3().addMouseListener(this);
	}
	
	public void inicioPartida(){
		cp.distribuiCartas(cj.getJogo().getJogadores(), cj.getJogo().getB());
		painel.criarTela(cj.getJogadorHumano());
		addCardMouseListener();
		cp.iniciarTurno();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		String name = e.getComponent().getName();
		Carta c = null;
		Jogo jogo = cj.getJogo();
		List<Carta> cartas = cj.getJogadorHumano().getMao();
		JLabel card = null;
		int pontuacaoA = jogo.getPontosA();
		int pontuacaoB = jogo.getPontosB();

		jogo.setPontosA(++pontuacaoA);
		jogo.setPontosB(++pontuacaoB);

		painel.atualizaPlacar(pontuacaoA, pontuacaoB);

		if (name.equalsIgnoreCase(this.painel.getCard1().getName())) {
			card = painel.getCard1();
		} else if (name.equalsIgnoreCase(this.painel.getCard2().getName())) {
			card = painel.getCard2();
		} else if (name.equalsIgnoreCase(this.painel.getCard3().getName())) {
			card = painel.getCard3();
		}
		for (Carta carta : cartas) {
			if (card.getName().contains(carta.getNaipe().toString().toLowerCase())
					&& card.getName().contains(carta.getValor().toString().toLowerCase())) {
				c = carta;
			}
		}
		
		this.painel.moverCardParaMesa(card, c.getNaipe().toString().toLowerCase(),
				c.getValor().toString().toLowerCase());
		
		ct.jogaCarta(c, cj.getJogo().getJogadores());

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

	public PainelJogo getPainel() {
		return painel;
	}

	public void setPainel(PainelJogo painel) {
		this.painel = painel;
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

}

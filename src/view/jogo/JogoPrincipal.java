package view.jogo;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.Semaphore;

import javax.swing.JFrame;

import controller.ControlPartida;
import enumerated.Naipe;
import enumerated.Valor;
import model.Baralho;
import model.Carta;
import model.Jogador;
import model.PC;
import model.Partida;
import model.Pessoa;
import model.Turno;


public class JogoPrincipal extends JFrame implements MouseListener {

	private PainelJogo painel;
	private ControlPartida cp;
	Jogador jogador;
	
	public JogoPrincipal(Jogador jogador) {
		this.jogador = jogador;
		this.setSize(900, 600);
		this.setResizable(false);
		painel = new PainelJogo();
		this.setContentPane(painel);
		this.painel.getCard1().addMouseListener(this);
		this.painel.getCard2().addMouseListener(this);
		this.painel.getCard3().addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		String name = e.getComponent().getName();
		
		if (name.equalsIgnoreCase(this.painel.getCard1().getName())) { 		//caso seja clicado na carta1
			this.painel.moverCardParaMesa(this.painel.getCard1());
			Carta carta = new Carta();
			carta.setNaipe(Naipe.ESPADILHA);
			carta.setValor(Valor.TRES);
			jogador.setCartaJogada(carta);
		} else if (name.equalsIgnoreCase(this.painel.getCard2().getName())) { //clicado carta 2
			this.painel.moverCardParaMesa(this.painel.getCard2());
		} else if (name.equalsIgnoreCase(this.painel.getCard3().getName())) { 		//caso seja clicado na carta3
			this.painel.moverCardParaMesa(this.painel.getCard3());
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		String name = e.getComponent().getName();
		
		
		if (name.equalsIgnoreCase(this.painel.getCard1().getName())) { 		//caso seja clicado na carta1
			this.painel.setIconeGrande(this.painel.getCard1());
		} else if (name.equalsIgnoreCase(this.painel.getCard2().getName())) { //clicado carta 2
			this.painel.setIconeGrande(this.painel.getCard2());
		} else if (name.equalsIgnoreCase(this.painel.getCard3().getName())) { 		//caso seja clicado na carta3
			this.painel.setIconeGrande(this.painel.getCard3());
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		String name = e.getComponent().getName();
		
		if (name.equalsIgnoreCase(this.painel.getCard1().getName())) { 		//caso seja clicado na carta1
			this.painel.setIconePequeno(this.painel.getCard1());
			
		} else if (name.equalsIgnoreCase(this.painel.getCard2().getName())) { //clicado carta 2
			this.painel.setIconePequeno(this.painel.getCard2());
		} else if (name.equalsIgnoreCase(this.painel.getCard3().getName())) { 		//caso seja clicado na carta3
			this.painel.setIconePequeno(this.painel.getCard3());
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}
	
}

package controller;

import java.util.List;
import java.util.Random;
<<<<<<< HEAD
import java.util.Set;
=======
import java.util.concurrent.Semaphore;
>>>>>>> refs/remotes/origin/master

import model.Baralho;
import model.Carta;
import model.Jogador;
import model.PC;
import model.Partida;
<<<<<<< HEAD

public class ControlPartida {
	private Partida partida;
	private ControlTurno ct;
	
	
	public ControlPartida() {		
		this.ct = new ControlTurno();
=======
import model.Turno;

public class ControlPartida extends Thread {

	private Jogador jogador;
	private Baralho baralho;
	private Partida partida;
	private ControlJogo controleJogo;
	private Turno turno;
	private PC pc;
	private Semaphore semaforo;
	private String[] valor = new String[]{"4","5","6","7","Q","J","K","A","2","3"};
	private String[] naipe = new String[]{"picafumo", "espadilha", "copas", "zap"};
	


	
	public ControlPartida(Jogador jogador, Baralho baralho, Partida partida, Turno turno, PC pc, Semaphore semaforo) {
		this.jogador = jogador;
		this.baralho = baralho;
		this.partida = partida;
		this.turno = turno;
		this.pc = pc;
		this.semaforo = semaforo;
		controleJogo = new ControlJogo();
>>>>>>> refs/remotes/origin/master
	}

	@Override
	public void run() {

			iniciarJogo();

	}

	private void iniciarJogo() {
		System.out.println("jogo começou");
		partida.setPontosDisputados(0);
		partida.setVencedor(null);

		while (jogador.getPontuacao() < 12 || pc.getPontuacao() < 12) {
			turno.setVencedor(null);
			turno.setNumero(1);
			turno.setPontuacaoJogador(0);
			turno.setPontuacaoPc(0);
			turno.setValorPontosTurno(1);
			System.out.println("inicio do turno " + turno.getNumero());
			iniciarTurno();
			if (jogador.getPontuacao() == 11 && pc.getPontuacao() == 11) {
				// jogada no escuro
			}
		}
	}

	public void iniciarTurno() {
		
		turno.setNumero(1);

		while ((turno.getPontuacaoJogador() < 2) || (turno.getPontuacaoJogador() < 2)) {
			System.out.println("entrou no novo turno");
			Random r = new Random();
			boolean quemJoga = r.nextBoolean();
			boolean jogadorJogou = false;
			if (turno.getNumero() == 1) {
				if (true) {
					System.out.println("jogador vai jogar...");
					// jogador joga primeiro
					while (jogadorJogou == false) {
						if (jogadaJogador() != null) jogadorJogou = true;
					}
					System.out.println("jogou");
						
					jogadaPC();
				} else {
					// pc joga primeiro
					jogadaPC();
					while (jogadaJogador() == null){
						
					}
					System.out.println("jogou");
				}
			}

			if (turno.getVencedor().equals(jogador)) {
				// jogador joga primeiro
				while (jogadaJogador() == null) {
					
				}
				System.out.println("jogou");
				jogadaPC();
			} else {
				// pc joga primeiro
				jogadaPC();
				while (jogadaJogador() == null) {
					
				}
				System.out.println("jogou");
			}

			turno.setNumero(turno.getNumero()+1);
			if (verificarVencedorTurno().equals(jogador)) {
				turno.setPontuacaoJogador(turno.getPontuacaoJogador() + 1);
				turno.setVencedor(jogador);
			}
			
			if (verificarVencedorTurno().equals(pc)) {
				turno.setPontuacaoPc(turno.getPontuacaoPc() + 1);
				turno.setVencedor(pc);
			}
		}
		
		if (turno.getPontuacaoJogador() > turno.getPontuacaoPc()) {
			jogador.setPontuacao(turno.getValorPontosTurno());
		} else {
			pc.setPontuacao(turno.getValorPontosTurno());
		}

	}
	
	public void distribuiCartas(Set<Jogador> j, Baralho b){
		embaralhar(b);
		
		for (int i = 0; i < 3; i++){
			for (Jogador jo : j){
				jo.addCarta(b.getCartas().remove(0));
			}
		}
		
		for (Jogador jo : j){
			System.out.println(jo.getNome());
			
			for (Carta c : jo.getMao()){
				System.out.println(c.getValor() + " de " + c.getNaipe());
			}
		}
	}
	
	public void embaralhar(Baralho b) {
		List<Carta> cartas = b.getCartas();
		Random gerador = new Random();
		Carta aux;
		int indice;

		for (int j = 0; j < 50; j++) {
			for (int i = 0; i < cartas.size(); i++) {
				indice = gerador.nextInt(cartas.size());
				aux = cartas.get(indice);
				cartas.set(indice, cartas.get(i));
				cartas.set(i, aux);
			}
		}
	}

	public Jogador verificarVencedorTurno() {
		Jogador r = null;

		int valorA = -1;
		int valorB = -1;

		for (int x = 0; x < valor.length; x++) {
			if (jogador.getCartaJogada().getValor().equals(valor[x])) {
				valorA = x;
			}
			if (pc.getCartaJogada().getValor().equals(valor[x])) {
				valorB = x;
			}
		}

		if (verificaManilha(jogador.getCartaJogada()) == true ) {
			for (int x = 0; x < naipe.length; x++) {
				if (jogador.getCartaJogada().getValor().equals(naipe[x])) {
					valorA = x * 100;
				}
			}
		}
			
		if (verificaManilha(pc.getCartaJogada()) == true ) {
			for (int x = 0; x < naipe.length; x++) {
				if (jogador.getCartaJogada().getValor().equals(naipe[x])) {
					valorB = x * 100;
				}
			}
		}

		if (valorA > valorB) {
			r = jogador;
		} else if (valorA < valorB) {
			r = pc;
		}
		
		return r;
	}

	private boolean verificaManilha(Carta carta) {
		boolean manilha = false;

		if (carta.getValor().equals(turno.getManilha().getValor()))
			manilha = true;
		
		return manilha;
	}
	
	public void verificarVendorPartida() {

	}

	public void atualizarPlacar() {

	}

	public void jogadaPC() {
		Random a = new Random();
		int tempo;
		tempo = a.nextInt(6);
		try {
			Thread.sleep(1000 + (tempo * 2000));
			pc.jogarCarta();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public Carta jogadaJogador() {
		return jogador.getCartaJogada();
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public Baralho getBaralho() {
		return baralho;
	}

	public void setBaralho(Baralho baralho) {
		this.baralho = baralho;
	}

	public Partida getPartida() {
		return partida;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	public ControlJogo getControleJogo() {
		return controleJogo;
	}

	public void setControleJogo(ControlJogo controleJogo) {
		this.controleJogo = controleJogo;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public PC getPc() {
		return pc;
	}

	public void setPc(PC pc) {
		this.pc = pc;
	}

	

}

package controller;


import enumerated.Naipe;
import enumerated.Valor;
import model.Baralho;
import model.Carta;
import model.CriadorCarta;
import model.CriadorPC;
import model.CriadorPessoa;
import model.FactoryJogador;
import model.Jogador;
import model.Jogo;


public class ControlJogo {
	private CriadorCarta fabricaCarta;
	private FactoryJogador fabricaJogador;
	private Valor[] valores;
	private Naipe[] naipes;
	private Jogo jogo;
	private ControlPartida cp;

	public ControlJogo() {
		this.fabricaCarta = new CriadorCarta();
		this.valores = Valor.values();
		this.naipes = Naipe.values();
		this.cp = new ControlPartida();
	}

	public void setarBaralho(boolean bool) {

		Baralho b = new Baralho();
		b.setTipo(bool);
		if (b.isTipo()) {
			geraBaralho(b, 0);
		} else {
			geraBaralho(b, 4);
		}
		
		this.jogo.setB(b);
	}

	public void geraBaralho(Baralho b, int k) {
		for (int i = k; i < 10; i++) {
			for (int j = 0; j < 4; j++) {
				addCarta(b, valores[i], naipes[j]);
			}
		}
	}

	public void addCarta(Baralho b, Valor v, Naipe n) {
		Carta c = fabricaCarta.novo();

		c.setValor(v);
		c.setNaipe(n);
		b.addCarta(c);
	}

	public Jogador setarJogador(boolean cond) {
		if (cond) {
			fabricaJogador = new CriadorPessoa();
		} else {
			fabricaJogador = new CriadorPC();
		}

		return fabricaJogador.novo();
	}
	
	public void setarJogadoresJogo(String nome, int numerojogadores){
		boolean tipo = true;
		
		for (int i = 0; i < numerojogadores; i++){
			Jogador j = setarJogador(tipo);
			
			if (tipo){
				j.setNome(nome);
				tipo = !tipo;
			}
			
			this.jogo.addJogador(j);
		}
	}

	public void iniciaJogo(String nome, boolean tipo, int numerojogadores) {
		this.jogo = new Jogo();
		this.jogo.setNumeroJogadores(numerojogadores);
		setarJogadoresJogo(nome, numerojogadores);
		setarBaralho(tipo);
		
		for (Jogador j : jogo.getJogadores()){
			System.out.println(j.getNome());
		}
		
		for (Carta c : jogo.getB().getCartas()){
			System.out.println(c.getValor() + " de " + c.getNaipe());
		}
		
		cp.distribuiCartas(jogo.getJogadores(), jogo.getB());
	}
	
	public Jogador getJogadorHumano(){
		for (Jogador j : jogo.getJogadores()){
			System.out.println(j.getNome());
			if (!j.getNome().contains("Computador")){
				return j;
			}
		}
		
		return null;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}
	
	

}
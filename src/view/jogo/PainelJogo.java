package view.jogo;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

class PainelJogo extends JPanel {
	
	private JLabel card1;
	private JLabel card2;
	private JLabel card3;
	private JLabel manilha;
	private ImageIcon iconCard1;
	private ImageIcon iconCard2;
	private ImageIcon iconCard3;
	private JLabel cardJogadoPc;
	private ImageIcon iconCardJogadoPc;
	private JLabel placar;
	private JLabel nomeJogador;
	private JLabel tipoBaralho;
	private JLabel pedirTruco;
	private JLabel virarCard;
	private ImageIcon iconPedirTruco;
	protected ImageIcon cardCostasGrande = new ImageIcon(this.getClass().getResource("/resource/img/cenario/carta-costas grande.png"));
	protected ImageIcon cardCostas = new ImageIcon(this.getClass().getResource("/resource/img/cenario/carta-costas.png"));
	
	public PainelJogo() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		criarTela();
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		Image background = new ImageIcon(getClass().getResource("/resource/img/cenario/fundo-mesa-menor.jpg")).getImage();
		g.drawImage(background,0,0,this);
		
	}
	
	private void criarTela() {
		//cria as cartas e adiciona no jogo, dps é só fazer a lógica e ir mudando o icone e retirando as cartas
		//seria melhor jogar isso dentro de uma metodo que adiciona a carta do jogo e um que remove
		this.manilha = new JLabel();
		this.manilha.setName("manilha");
		this.manilha.setBounds(399, 247, 73, 100);
		this.manilha.setIcon(new ImageIcon(this.getClass().getResource("/resource/img/cenario/carta-costas.png")));
		this.add(manilha);
		
		this.iconCard1 = new ImageIcon(this.getClass().getResource("/resource/img/cenario/carta-costas.png"));
		this.card1 = new JLabel();
		this.card1.setName("card1");
		this.card1.setIcon(iconCard1);
		this.card1.setBounds(290, 462, 73, 100);
		this.add(card1);
		
		this.iconCard2 = new ImageIcon(this.getClass().getResource("/resource/img/cenario/carta-costas.png"));
		this.card2 = new JLabel();
		this.card2.setName("card2");
		this.card2.setIcon(iconCard2);
		this.card2.setBounds(426, 462, 73, 100);
		this.add(card2);
		
		this.iconCard3 = new ImageIcon(this.getClass().getResource("/resource/img/cenario/carta-costas.png"));
		this.card3 = new JLabel();
		this.card3.setName("card3");
		this.card3.setIcon(iconCard3);
		this.card3.setBounds(576, 462, 73, 100);
		this.add(card3);
		
	}

	

	public JLabel getManilha() {
		return manilha;
	}

	public void setManilha(JLabel manilha) {
		this.manilha = manilha;
	}

	public ImageIcon getIconCard1() {
		return iconCard1;
	}

	public void setIconCard1(ImageIcon iconCard1) {
		this.iconCard1 = iconCard1;
	}

	public ImageIcon getIconCard2() {
		return iconCard2;
	}

	public void setIconCard2(ImageIcon iconCard2) {
		this.iconCard2 = iconCard2;
	}

	public ImageIcon getIconCard3() {
		return iconCard3;
	}

	public void setIconCard3(ImageIcon iconCard3) {
		this.iconCard3 = iconCard3;
	}

	public ImageIcon getIconCardJogadoPc() {
		return iconCardJogadoPc;
	}

	public void setIconCardJogadoPc(ImageIcon iconCardJogadoPc) {
		this.iconCardJogadoPc = iconCardJogadoPc;
	}

	public JLabel getPlacar() {
		return placar;
	}

	public void setPlacar(JLabel placar) {
		this.placar = placar;
	}

	public JLabel getNomeJogador() {
		return nomeJogador;
	}

	public void setNomeJogador(JLabel nomeJogador) {
		this.nomeJogador = nomeJogador;
	}

	public ImageIcon getIconPedirTruco() {
		return iconPedirTruco;
	}

	public void setIconPedirTruco(ImageIcon iconPedirTruco) {
		this.iconPedirTruco = iconPedirTruco;
	}
	
	
	
	public JLabel getCard1() {
		return card1;
	}

	public void setCard1(JLabel card1) {
		this.card1 = card1;
	}

	public JLabel getCard2() {
		return card2;
	}

	public void setCard2(JLabel card2) {
		this.card2 = card2;
	}

	public JLabel getCard3() {
		return card3;
	}

	public void setCard3(JLabel card3) {
		this.card3 = card3;
	}

	public JLabel getCardJogadoPc() {
		return cardJogadoPc;
	}

	public void setCardJogadoPc(JLabel cardJogadoPc) {
		this.cardJogadoPc = cardJogadoPc;
	}

	public JLabel getTipoBaralho() {
		return tipoBaralho;
	}

	public void setTipoBaralho(JLabel tipoBaralho) {
		this.tipoBaralho = tipoBaralho;
	}

	public JLabel getPedirTruco() {
		return pedirTruco;
	}

	public void setPedirTruco(JLabel pedirTruco) {
		this.pedirTruco = pedirTruco;
	}

	public JLabel getVirarCard() {
		return virarCard;
	}

	public void setVirarCard(JLabel virarCard) {
		this.virarCard = virarCard;
	}

	//aqui move a carta costas
	public void moverCardParaMesa(JLabel card){
		this.setIconePequeno(card);
		card.setBounds(424, 356, 73, 100);
		card.removeMouseListener(card.getMouseListeners()[0]);
	}
	
	//move a carta com valor
	public void moverCardParaMesa(JLabel card, String naipe, String valor){
		this.setIconePequeno(card, naipe, valor);
		card.setBounds(424, 356, 73, 100);
		card.removeMouseListener(card.getMouseListeners()[0]);
	}
	
	
	public void distribuirCartas(String carta1, String carta2, String carta3) {
		
	}
	
	
	
	public void setManilha(String naipe, String valor) {
		ImageIcon icone = new ImageIcon(this.getClass().getResource("/resource/img/baralho/" + naipe + "/"
																	+ valor + " de " + naipe + ".jpg"));
		this.manilha.setIcon(icone);
	}
	
	
	
	//hover para valores
	public void setIconeGrande(JLabel card, String naipe, String valor) {
		ImageIcon icone = new ImageIcon(this.getClass().getResource("/resource/img/baralho/" + naipe + "/"
				+ valor + " de " + naipe + ".jpg"));
		if (card.getName().equals("card1"))
			card.setBounds(229, 362, 150, 200);
		else if (card.getName().equals("card2"))
			card.setBounds(389, 362, 150, 200);
		else if (card.getName().equals("card3"))
			card.setBounds(523, 362, 150, 200);
		card.setIcon(icone);
	}
	
	
	//hover para carta costas
	public void setIconeGrande(JLabel card) {
		if (card.getName().equals("card1"))
			card.setBounds(229, 362, 150, 200);
		else if (card.getName().equals("card2"))
			card.setBounds(389, 362, 150, 200);
		else if (card.getName().equals("card3"))
			card.setBounds(523, 362, 150, 200);
		card.setIcon(cardCostasGrande);
	}
	
	//para carta costas
	public void setIconePequeno(JLabel card) {
		ImageIcon icone = new ImageIcon(this.getClass().getResource("/resource/img/cenario/carta-costas.png"));
		if (card.getName().equals("card1"))
			card.setBounds(290, 462, 73, 100);
		else if (card.getName().equals("card2"))
			card.setBounds(426, 462, 73, 100);
		else if (card.getName().equals("card3"))
			card.setBounds(576, 462, 73, 100);
		card.setIcon(cardCostas);
	}
	
	public void setIconePequeno(JLabel card, String naipe, String valor) {
		ImageIcon icone = new ImageIcon(this.getClass().getResource("/resource/img/baralho/" + naipe + "/"
				+ valor + " de " + naipe + ".jpg"));
		if (card.getName().equals("card1"))
			card.setBounds(290, 462, 73, 100);
		else if (card.getName().equals("card2"))
			card.setBounds(426, 462, 73, 100);
		else if (card.getName().equals("card3"))
			card.setBounds(576, 462, 73, 100);
		card.setIcon(icone);
	}
	
}

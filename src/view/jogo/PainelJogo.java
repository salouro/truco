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
		iconCard1 = new ImageIcon(this.getClass().getResource("/resource/img/cenario/carta-costas.png"));
		card1 = new JLabel();
		add(card1);
		card1.setIcon(iconCard1);
		card1.setBounds(290, 462, 73, 100);
		
		iconCard2 = new ImageIcon(this.getClass().getResource("/resource/img/cenario/carta-costas.png"));
		card2 = new JLabel();
		add(card2);
		card2.setIcon(iconCard2);
		card2.setBounds(426, 462, 73, 100);
		
		iconCard3 = new ImageIcon(this.getClass().getResource("/resource/img/cenario/carta-costas.png"));
		card3 = new JLabel();
		add(card3);
		card3.setIcon(iconCard3);
		card3.setBounds(576, 462, 73, 100);
		
		//isso é só pra testar
		card1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {}
			
			@Override
			public void mousePressed(MouseEvent arg0) {}
			
			@Override
			public void mouseExited(MouseEvent arg0) {}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {}
			
			@Override //quando clicar move a carta
			public void mouseClicked(MouseEvent arg0) {moverCardParaMesa(card1);}
		});
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
	
	
	//aqui move a carta passando a posição dela
	public void moverCardParaMesa(JLabel card){
		card.setBounds(424, 356, 73, 100);
	}
	
	
	
	
}

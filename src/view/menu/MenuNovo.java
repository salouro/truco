package view.menu;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ControlJogo;
import controller.ControlPartida;
import model.Pessoa;
import view.jogo.JogoPrincipal;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.Frame;
import java.awt.event.ActionEvent;

public class MenuNovo extends JDialog implements ActionListener {

	private JPanel contentPane;
	private JTextField nomeJogador;
	private JCheckBox chckbxBaralhoLimpo;
	private String nomeDoJogador;
	private boolean tipoBaralho;

	public MenuNovo(Frame owner) {
		super(owner);
		setBounds(100, 100, 365, 165);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNomeJogador = new JLabel("Nome Jogador:");
		lblNomeJogador.setBounds(12, 13, 118, 16);
		contentPane.add(lblNomeJogador);

		nomeJogador = new JTextField();
		nomeJogador.setBounds(107, 10, 228, 22);
		contentPane.add(nomeJogador);
		nomeJogador.setColumns(10);

		chckbxBaralhoLimpo = new JCheckBox("Baralho limpo?");
		chckbxBaralhoLimpo.setBounds(8, 54, 113, 25);
		contentPane.add(chckbxBaralhoLimpo);

		JButton btnJogar = new JButton("Jogar");
		btnJogar.addActionListener(this);
		btnJogar.setBounds(238, 54, 97, 25);
		contentPane.add(btnJogar);

	}

	public String getNomeDoJogador() {
		return nomeDoJogador;
	}

	public void setNomeDoJogador(JTextField nomeJogador) {
		this.nomeDoJogador = nomeJogador.getText();
	}

	public boolean isTipoBaralho() {
		return tipoBaralho;
	}

	// se true � sujo, se false � limpo
	public void setTipoBaralho(JCheckBox chckbx) {
		this.tipoBaralho = !chckbx.isSelected();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
		JogoPrincipal jogo = new JogoPrincipal(nomeJogador.getText(), isTipoBaralho(), 2);
		jogo.setVisible(true);
		setTipoBaralho(chckbxBaralhoLimpo);
		setNomeDoJogador(nomeJogador);
		jogo.getPainel().getNomeJogador().setText(getNomeDoJogador());;
		jogo.getPainel().getPlacar().setText("Placar: "  + getNomeDoJogador() + " 0 X 0 PC");
		
		
	}

}

package view.menu;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.jogo.JogoPrincipal;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.Frame;
import java.awt.event.ActionEvent;

public class MenuNovo extends JDialog {

	private JPanel contentPane;
	private JTextField textField;

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

		textField = new JTextField();
		textField.setBounds(107, 10, 228, 22);
		contentPane.add(textField);
		textField.setColumns(10);

		JCheckBox chckbxBaralhoLimpo = new JCheckBox("Baralho limpo?");
		chckbxBaralhoLimpo.setBounds(8, 54, 113, 25);
		contentPane.add(chckbxBaralhoLimpo);

		JButton btnJogar = new JButton("Jogar");
		btnJogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JogoPrincipal jogo = new JogoPrincipal();
				jogo.setVisible(true);
			}
		});
		btnJogar.setBounds(238, 54, 97, 25);
		contentPane.add(btnJogar);

	}
}

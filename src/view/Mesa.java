package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Mesa extends JFrame {

	private JPanel contentPane;

	public Mesa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 445);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		ImageIcon mesa = new ImageIcon(new ImageIcon("C:\\Users\\Celia\\Downloads\\mesa 3.2.png").getImage()
				.getScaledInstance(495, 406, Image.SCALE_SMOOTH));
		JLabel lblMesa = new JLabel();
		lblMesa.setIcon(mesa);
		lblMesa.setLayout(new BorderLayout());

		add(lblMesa);
		
	}
}

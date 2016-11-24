package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

import org.w3c.dom.events.MouseEvent;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class Menu extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Menu() {
		PainelMenu p = new PainelMenu();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 426);
		setResizable(false);
		setContentPane(p);
		addMouseListener(p);
	}

}
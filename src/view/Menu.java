package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.io.File;
import java.net.URL;

import javax.swing.JFrame;

import org.w3c.dom.events.MouseEvent;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class Menu extends JFrame {

	public static void main(String[] args) {
      
		//System.out.println(ClassLoader.class.getResource("mesa 3.2.png").toString());
		//File file = new File("img.Cenário//mesa 3.2.png");
		
		Menu m = new Menu();
	}

	public Menu() {
		PainelMenu p = new PainelMenu();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 426);
		setResizable(false);
		setContentPane(p);
		addMouseListener(p);
		setVisible(true);
	}
}
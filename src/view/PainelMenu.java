package view;

import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PainelMenu extends JPanel implements MouseListener {

	private BufferedImage fundo;
	private BufferedImage novo;
	private BufferedImage placar;
	private int flag;
	public PainelMenu() {
		try {
			fundo = ImageIO.read(new File("C:\\Users\\Celia\\Downloads\\mesa 3.2.png"));
			novo = ImageIO.read(new File("C:\\Users\\Celia\\Downloads\\novo1.jpg"));
			placar = ImageIO.read(new File("C:\\Users\\Celia\\Downloads\\placar1.jpg"));
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public void paint(Graphics g) {

		int x;
		int y;

		x = (getWidth() - fundo.getWidth());
		y = (getHeight() - fundo.getHeight());
		g.drawImage(fundo, x, y, this);

		x = (getWidth() - novo.getWidth()) / 2;
		g.drawImage(novo, x, 147+flag, this);
		flag =0;
		x = (getWidth() - placar.getWidth()) / 2;
		g.drawImage(placar, x, 197, this);

		// 172, 147
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		PointerInfo pi = MouseInfo.getPointerInfo();
		Point p = pi.getLocation();

		if ((int) p.x >= 132 && (int) p.x <= 202 && (int) p.y >= 113 && (int) p.y <= 180) {
			try {
				flag=20;
				novo = ImageIO.read(new File("C:\\Users\\Celia\\Downloads\\novo.jpg"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Teste");
		}
	
		
		
		repaint();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}

package core;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

public class MediaPlayer{
	private String[] caminhos;
	private int atual;
	private BasicPlayer pl;
	private String path;

	public MediaPlayer(String c) {
		this.path = c;
		this.pl = new BasicPlayer();
		this.atual = 0;

		File f = new File(this.getClass().getResource(path).getPath());

		this.caminhos = f.list();

		this.geraPlaylist();

	}

	public void continuaMusica() {
		while (pl.getStatus() == pl.PLAYING) {

		}
	}

	public void tocaMusica() throws BasicPlayerException {
		pl.open(this.getClass().getResource(path + "/" + caminhos[atual]));
		pl.play();
	}

	public void paraMusica() throws BasicPlayerException {
		pl.pause();
	}

	public void passaMusica() throws BasicPlayerException {

		if (atual >= caminhos.length - 1) {
			atual = 0;
		} else {
			atual++;
		}

		this.tocaMusica();
	}

	public void voltaMusica() throws BasicPlayerException {

		if (atual <= 0) {
			atual = caminhos.length - 1;
		} else {
			atual--;
		}

		this.tocaMusica();
	}

	public void geraPlaylist() {
		Random gerador = new Random();
		String aux;
		int novoind;

		for (int i = 0; i < caminhos.length; i++) {
			novoind = gerador.nextInt(caminhos.length - 1);
			aux = caminhos[novoind];
			caminhos[novoind] = caminhos[i];
			caminhos[i] = aux;
		}
	}

	public String[] getCaminhos() {
		return caminhos;
	}

	public void setCaminhos(String[] caminhos) {
		this.caminhos = caminhos;
	}

	public int getAtual() {
		return atual;
	}

	public void setAtual(int atual) {
		this.atual = atual;
	}

	public BasicPlayer getPl() {
		return pl;
	}

	public void setPl(BasicPlayer pl) {
		this.pl = pl;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}

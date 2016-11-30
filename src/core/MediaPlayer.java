package core;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MediaPlayer extends Thread {
	private String[] caminhos;
	private int atual;
	private Clip pl;
	private String path;
	private AudioInputStream ad;

	public MediaPlayer(String path) throws LineUnavailableException {
		this.path = path;
		this.pl = AudioSystem.getClip();
		this.atual = 0;

		File f = new File(this.getClass().getResource(path).getPath());

		this.caminhos = f.list();

		this.geraPlaylist();

	}

	@Override
	public void run() {
		try {
			tocaMusica();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void tocaMusica() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		ad = AudioSystem.getAudioInputStream(this.getClass().getResource(path + "/" + caminhos[atual]));
		pl.open(ad);
		pl.start();
	}

	public void passaMusica() {
		if (atual >= caminhos.length - 1) {
			atual = 0;
		} else {
			atual++;
		}
		
		flushFecha();
	}

	public void voltaMusica() {
		if (atual <= 0) {
			atual = caminhos.length - 1;
		} else {
			atual--;
		}
		
		flushFecha();
	}
	
	public void flushFecha(){
		pl.flush();
		pl.close();
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

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Clip getPl() {
		return pl;
	}

	public void setPl(Clip pl) {
		this.pl = pl;
	}

	public AudioInputStream getAd() {
		return ad;
	}

	public void setAd(AudioInputStream ad) {
		this.ad = ad;
	}

	public void setListener(PlayerListener teste) {
		pl.addLineListener(teste);
	}

}
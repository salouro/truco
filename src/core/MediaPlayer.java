package core;

import java.io.File;
import java.util.Random;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

public class MediaPlayer extends Thread{
	private String[] caminhos;
	private int atual;
	private BasicPlayer pl;
	private String path;

	public MediaPlayer(String path) {
		this.path = path;
		this.pl = new BasicPlayer();
		this.atual = 0;

		File f = new File(this.getClass().getResource(path).getPath());

		this.caminhos = f.list();

		this.geraPlaylist();

	}


	public void tocaMusica() throws BasicPlayerException {
		pl.open(this.getClass().getResource(path + "/" + caminhos[atual]));
		pl.play();
		//gambiarra pra deixar o metodo rodando pra sempre enquanto a musica toca
		while (pl.getStatus() == 0) {
		}

		//recursividade top
		if (atual >= caminhos.length - 1) {
			atual = 0;
			tocaMusica();
		} else {
			atual++;
			tocaMusica();
		}
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
	
	
	@Override
	public void run(){
		try {
			tocaMusica();
		} catch (BasicPlayerException e) {
			e.printStackTrace();
		}
	}

}
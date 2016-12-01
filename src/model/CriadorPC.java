package model;

public class CriadorPC extends FactoryJogador{

	@Override
	public Jogador novo() {
		System.out.println("passou");
		return new PC("Computador" + (PC.getId() + 1));
	}
	
}

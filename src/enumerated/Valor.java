package enumerated;

public enum Valor {
	QUATRO (4), CINCO (5), SEIS (6), SETE (7), Q (8), J (9), K (10), A (11), DOIS (12), TRES (13);
	
	private int valor;
	
	Valor(int valor){
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
}

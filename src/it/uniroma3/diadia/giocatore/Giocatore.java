package it.uniroma3.diadia.giocatore;

public class Giocatore {
	
	static final private int CFU_INIZIALI = 20;
	private int cfu;
	private Borsa borsa;
	
	
	public Giocatore () {
		this.cfu = CFU_INIZIALI;
		this.borsa = new Borsa();
	}
	
	public Giocatore (int peso) {
		this.cfu = CFU_INIZIALI;
		this.borsa = new Borsa(peso);
	}
	
	public int getCfu() {
		return this.cfu;
	}

	public void setCfu(int cfu) {
		this.cfu = cfu;		
	}
	
	public void togliCfu() {
		this.cfu--;
	}
	
	public Borsa getBorsa() {
		return this.borsa;
	}
}

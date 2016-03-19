package es.ull.esit.pai.p5.Coins;


public class BelgFranc extends Coin {
	/**
	 * New Belgium Franc. with value in Belgium Franc
	 * @param val must be Belgium Franc quantity
	 */
	public BelgFranc (double val) {
		setBasics(val, 40.34, "Belg. Franc");
	}
	
	public BelgFranc () {
		this (0);
	}
}

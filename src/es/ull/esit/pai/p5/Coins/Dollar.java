package es.ull.esit.pai.p5.Coins;


public class Dollar extends Coin {
	/**
	 * New dollar with value in euros
	 * @param val must be euros quantity
	 */
	public Dollar (double val) {
		setBasics(val, 1.1118, "Dollar");
	}
	
	public Dollar () {
		this (0);
	}
}

package es.ull.esit.pai.p5.Coins;


public class Euro extends Coin {
	/**
	 * Constructor for Euro
	 * @param value in Euros
	 */
	public Euro (double val) {
		setBasics (val, 1, "Euro");
	}
	
	public Euro () {
		this (0);
	}

}

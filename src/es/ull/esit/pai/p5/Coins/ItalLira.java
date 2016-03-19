package es.ull.esit.pai.p5.Coins;


public class ItalLira extends Coin {
	/**
	 * New German Mark with value in German Mark value
	 * @param val must be German Mark quantity
	 */
	public ItalLira (double val) {
		setBasics(val, 1936.27, "Ital. Lira");
	}
	
	public ItalLira () {
		this (0);
	}
}

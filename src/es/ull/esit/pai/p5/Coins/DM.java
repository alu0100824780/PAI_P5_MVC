package es.ull.esit.pai.p5.Coins;


public class DM extends Coin {
	/**
	 * New German Mark with value in German Mark value
	 * @param val must be German Mark quantity
	 */
	public DM (double val) {
		setBasics(val, 1.96, "DM");
	}
	
	public DM () {
		this (0);
	}

}

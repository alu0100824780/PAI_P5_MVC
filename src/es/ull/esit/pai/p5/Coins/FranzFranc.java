package es.ull.esit.pai.p5.Coins;


public class FranzFranc extends Coin {
	/**
	 * New Franz Franc with value in Franz Franc
	 * @param val must be Franz Franc quantity
	 */
	public FranzFranc (double val) {
		setBasics(val, 6.56, "Franz. Franc");
	}
	
	public FranzFranc () {
		this (0);
	}

}

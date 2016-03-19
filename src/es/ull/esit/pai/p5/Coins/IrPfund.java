package es.ull.esit.pai.p5.Coins;


public class IrPfund extends Coin {
	/**
	 * New German Mark with value in German Mark value
	 * @param val must be German Mark quantity
	 */
	public IrPfund (double val) {
		setBasics(val, 0.79, "Ir. Pfund");
	}
	
	public IrPfund () {
		this (0);
	}
}

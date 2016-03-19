package es.ull.esit.pai.p5;

import java.util.HashMap;

import es.ull.esit.pai.p5.Coins.Coin;



public class Model {
	private String originCoin;
	private double originValue;
	private HashMap<String, Coin> coins;
	/**
	 * Constructor
	 */
	public Model () {
		coins = new HashMap<String, Coin> ();
	}
	
	public void setOriginValue (double val) {
		originValue = val;
	}
	
	
	public void setOriginCoin (String coin, Coin coinObject) {

		originCoin = coin;
		coins.put(coin, coinObject);
	}
	
	/**
	 * Getter for value
	 * @return
	 */
	public double getOriginValue () {
		return originValue;
	}
	
	public void addCoin (String coin, Coin object) {
		coins.put(coin, object);
	}
	
	public Coin getCoin (String coinName) {
		return coins.get(coinName);
	}
	
	public Coin getOriginCoin () {
		return coins.get(originCoin);
	}
	
	

}

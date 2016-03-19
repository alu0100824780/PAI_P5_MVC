package es.ull.esit.pai.p5;

import java.io.IOException;

import es.ull.esit.pai.p5.Coins.Coin;


public class CoinConverter {
	Controller controller;
	
	public CoinConverter (String originCoinName, Coin originCoin) {
   	  try {
	    controller = new Controller ();
	    controller.setOriginCoin(originCoinName, originCoin);
	    controller.readNumber();
	    controller.createCoins();
	    controller.createGUI();
	  }
	  catch (IOException e) {
		System.out.println (e.getMessage());
	  }
    }
}

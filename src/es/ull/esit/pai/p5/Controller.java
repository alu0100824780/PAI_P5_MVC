package es.ull.esit.pai.p5;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JFrame;

import es.ull.esit.pai.p5.Coins.BelgFranc;
import es.ull.esit.pai.p5.Coins.Coin;
import es.ull.esit.pai.p5.Coins.DM;
import es.ull.esit.pai.p5.Coins.Dollar;
import es.ull.esit.pai.p5.Coins.Euro;
import es.ull.esit.pai.p5.Coins.FranzFranc;
import es.ull.esit.pai.p5.Coins.IrPfund;
import es.ull.esit.pai.p5.Coins.ItalLira;

public class Controller {
	private View view;
	private Model model;
	
	public Controller () throws IOException {
		view = new View ();
		model = new Model ();
	}
	
	public void createCoins () {
		model.addCoin("Euro", new Euro());
		model.addCoin ("Dollar", new Dollar());
		model.addCoin ("DM", new DM());
		model.addCoin ("BelgFranc", new BelgFranc());
		model.addCoin ("FranzFranc", new FranzFranc());
		model.addCoin ("IrPfund", new IrPfund());
		model.addCoin ("ItalLira", new ItalLira());
	}
	
	public void commonFrameOps () {
		view.setTitle("Coin Converter");
	    view.setSize(300, 600);
	    view.setLocationRelativeTo(null); // Center the frame
	    view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    view.setVisible(true);
		
	}
	
	public void createGUI () {
		double value = model.getOriginValue();
		commonFrameOps();
		view.setColor(Color.BLUE);

		view.addConversion(new Euro (value), model.getCoin("Dollar"));
		view.addConversion(new Euro (value), model.getCoin("DM"));
		view.addConversion(new Euro (value), model.getCoin("BelgFranc"));
		view.addConversion(new Euro (value), model.getCoin("FranzFranc"));
		view.addConversion(new Euro (value), model.getCoin("IrPfund"));
		view.addConversion(new Euro (value), model.getCoin("ItalLira"));
		
	}
	
	public void readNumber () throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Quantity in euros:");
		try{
			model.setOriginValue(Integer.parseInt(br.readLine()));
			System.out.println("Correct");
		}catch(NumberFormatException nfe){
			System.err.println("Invalid Format!");
		}
	}
	
	public void setOriginCoin (String originCoin, Coin origin) {
		model.setOriginCoin(originCoin, origin);
	}

}

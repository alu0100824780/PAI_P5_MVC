/**
 * @Author: Rudolf Cicko
 * @email: alu0100824780@ull.edu.es
 * @Description: Class that show all user interface
 * 
 */
package es.ull.esit.pai.p5;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import es.ull.esit.pai.p5.Coins.Coin;


public class View extends JFrame{
  private JPanel panel;
  private Color color;
	
  public View () {
	  panel = new JPanel ();
	  panel.setLayout (new GridLayout(0, 1, 1, 5));
	  
	  add (panel);
  }
  
  public void setColor (Color col) {
	  color = col;
  }
  
  public void addConversion (Coin inputCoin, Coin outputCoin) {
	  panel.add (new ConversionItemPanel(inputCoin, outputCoin, color));
  }
  
}

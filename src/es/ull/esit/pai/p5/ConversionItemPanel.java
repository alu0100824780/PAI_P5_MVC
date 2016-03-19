package es.ull.esit.pai.p5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import es.ull.esit.pai.p5.Coins.Coin;

public class ConversionItemPanel extends JPanel {
	private Color color;
  /**
   * You pass a string, for example "dollar" and factor is the number to be
   * 
   * 
   * @param outputCoin coin result type
   * @param factor factor to be multiplied 
   */
  public ConversionItemPanel (Coin inputCoin, Coin outputCoin, Color cl) {
	  color = cl;
	  
	  final String inputCoinName = inputCoin.getCoinName();
	  final String outputCoinName = outputCoin.getCoinName();
	  
	  TitledBorder title = new TitledBorder (outputCoinName);
	  title.setTitleColor(color);
	  setBorder (title);

	  setLayout (new BorderLayout(5, 5));
	  
	  JPanel upperPanel = new JPanel ();
	  upperPanel.setLayout (new BorderLayout());
	  upperPanel.add (new JLabel (1 + " " + inputCoinName + " is "), BorderLayout.WEST);
	  upperPanel.add (new JTextField (String.valueOf(outputCoin.getFactor())), BorderLayout.CENTER);
	  upperPanel.add (new JLabel (outputCoinName), BorderLayout.EAST);
	  
	  
	  JPanel bottomPanel = new JPanel ();
	  bottomPanel.setLayout (new GridLayout (2, 2, 1, 1));
	  bottomPanel.add(new JLabel (inputCoinName));
	  bottomPanel.add(new JLabel (outputCoinName));
	  bottomPanel.add (new JTextField (String.valueOf (inputCoin.getValue())));
	  bottomPanel.add (new JTextField (String.valueOf (inputCoin.to(outputCoin))));
	  
	  
	  
	  add(upperPanel, BorderLayout.NORTH);
	  add(bottomPanel, BorderLayout.SOUTH);
	  
	  setPanelComponentsTextColor(upperPanel);
	  setPanelComponentsTextColor(bottomPanel);
	
  }
  
  public void setPanelComponentsTextColor(JPanel panel) {
	  Component[] comps = panel.getComponents();

	  for(Component comp : comps) {
	      if(comp instanceof JLabel) {
	    	
	         ((JComponent)comp).setForeground(color);
	      }
	  }
  }
  
}

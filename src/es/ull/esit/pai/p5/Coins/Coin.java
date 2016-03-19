package es.ull.esit.pai.p5.Coins;

public abstract class Coin {
  protected String name;
  protected double value;
  protected double euroValue;
  protected double factor;
  
  protected void setBasics (double val, double fact, String nam) {
	  value = val;
	  factor = fact;
	  name = nam;
	  euroValue = val / factor;
  }
  /**
   * All factors are based on Euro. Euro have factor 1
   * @return the factor of that Coin. 
   */
  public double getFactor () {
	  return factor;  
  }
  
  /**
   * This method allows convertions between different types of Coin
   * @param other
   * @return
   */
  public double to (Coin other) {
	  return getEuroValue() * other.getFactor();
  }
  
  /**
   * Get the quantity equivalent to the original coin
   * @return the quantity 
   */
  public double getValue () {
	  return value; 
  }
  
  /**
   * This abstract method allow to get the value of any coin in Euro
   * @return
   */
  public double getEuroValue () {
	  return euroValue;
  }
  
  /**
   * Get the coin name
   * @return the coin name
   */
  public String getCoinName () {
	return name;  
  }
}

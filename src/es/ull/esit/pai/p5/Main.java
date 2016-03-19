package es.ull.esit.pai.p5;

import java.io.IOException;

import es.ull.esit.pai.p5.Coins.Euro;

public class Main {
  public static void main (String args[]) {
    CoinConverter coinConverter = new CoinConverter ("Euro", new Euro());
  }
}

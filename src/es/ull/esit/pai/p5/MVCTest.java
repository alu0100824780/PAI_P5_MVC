package es.ull.esit.pai.p5;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import es.ull.esit.pai.p5.Coins.BelgFranc;
import es.ull.esit.pai.p5.Coins.DM;
import es.ull.esit.pai.p5.Coins.Dollar;
import es.ull.esit.pai.p5.Coins.Euro;
import es.ull.esit.pai.p5.Coins.FranzFranc;
import es.ull.esit.pai.p5.Coins.IrPfund;
import es.ull.esit.pai.p5.Coins.ItalLira;

public class MVCTest {
	static Euro euro;
	
	@BeforeClass
	public static void before () {
		euro = new Euro (1);
	}

	@Test
	public void euroToDollar () {
		assertTrue(euro.to(new Dollar()) ==  1.1118);
		assertTrue(euro.to(new Dollar()) ==  new Dollar().getFactor());
	}
	
	@Test
	public void euroToDM () {
		assertTrue(euro.to(new DM()) ==  1.96);
		assertTrue(euro.to(new DM()) ==  new DM().getFactor());
	}
	
	@Test
	public void euroToBelgFranc () {
		assertTrue(euro.to(new BelgFranc()) ==  40.34);
		assertTrue(euro.to(new BelgFranc()) ==  new BelgFranc().getFactor());
	}
	
	@Test
	public void euroToFranzFranc () {
		assertTrue(euro.to(new FranzFranc()) ==  6.56);
		assertTrue(euro.to(new FranzFranc()) ==  new FranzFranc().getFactor());
	}
	
	@Test
	public void euroToIrPfund () {
		assertTrue(euro.to(new IrPfund()) ==  0.79);
		assertTrue(euro.to(new IrPfund()) ==  new IrPfund().getFactor());
	}
	
	@Test
	public void euroToItalLira () {
		assertTrue(euro.to(new ItalLira()) ==  1936.27);
		assertTrue(euro.to(new ItalLira()) ==  new ItalLira().getFactor());
	}
	
	
}

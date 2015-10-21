package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {

	@Test
	public void testPlanetLanding() {
		PlanetExplorer planetExplorer = new PlanetExplorer(100, 100, "", "");
		String expectResult = planetExplorer.executeCommand("");
		assertEquals("(100,100,N)", expectResult);
	}
	
	@Test
	public void testPlanetExplorerTurningLeftFromLanding() {
		PlanetExplorer planetExplorer = new PlanetExplorer(100, 100, "", "");
		String expectResult = planetExplorer.executeCommand("l");
		assertEquals("(100,100,W)", expectResult);
	}
	
	@Test
	public void testPlanetExplorerTurningRightFromLanding() {
		PlanetExplorer planetExplorer = new PlanetExplorer(100, 100, "", "");
		String expectResult = planetExplorer.executeCommand("r");
		assertEquals("(100,100,E)", expectResult);
	}
	
	@Test
	public void testPlanetExplorerMoveForwardFromLanding() {
		PlanetExplorer planetExplorer = new PlanetExplorer(100, 100, "", "");
		String expectResult = planetExplorer.executeCommand("f");
		assertEquals("(100,101,N)", expectResult);
	}
	
	@Test
	public void testPlanetExplorerMoveBackFromLanding() {
		PlanetExplorer planetExplorer = new PlanetExplorer(100, 100, "", "");
		String expectResult = planetExplorer.executeCommand("b");
		System.out.println(expectResult);
		assertEquals("(100,99,N)", expectResult);
	}
}

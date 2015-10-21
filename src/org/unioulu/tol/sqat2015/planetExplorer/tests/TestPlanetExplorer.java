package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {

	@Test
	public void testPlanetLanding() {
		PlanetExplorer planetExplorer = new PlanetExplorer(100, 100, null, null);
		String expectResult = planetExplorer.executeCommand(null);
		assertEquals("(0,0,N)", expectResult);
	}
}

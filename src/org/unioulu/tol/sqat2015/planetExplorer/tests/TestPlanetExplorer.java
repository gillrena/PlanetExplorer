package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {

	@Test
	public void testPlanetLanding() {
		PlanetExplorer planetExplorer = new PlanetExplorer(100, 100, "", "");
		String expectResult = planetExplorer.executeCommand("f");
		System.out.println(expectResult);
	}
}

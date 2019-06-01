package fr.unilim.iut.spaceinvaders;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import fr.unilim.iut.spaceinvaders.model.Dimension;
import fr.unilim.iut.spaceinvaders.model.Position;
import fr.unilim.iut.spaceinvaders.model.SpaceInvaders;

public class EnvahisseurTest {
	private SpaceInvaders spaceinvaders;

	@Before
	public void initialisation() {
		spaceinvaders = new SpaceInvaders(15, 10);
	}
	@Test
	public void test_unNouveauEnvahisseurEstCorrectementPositionneDansEspaceJeu() {
		spaceinvaders.positionnerUnNouvelEnvahisseur(new Dimension(2, 1), new Position(7, 3), 1);
		assertEquals("" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		".......EE......\n" + 
		"...............\n" +
		"...............\n" + 
		"...............\n" + 
		"...............\n" +
		"...............\n" +
		"...............\n", spaceinvaders.recupererEspaceJeuDansChaineASCII());
	}
	
	@Test
	public void test_EnvahisseurAvance_DeplacerEnvahisseurVersLaDroite() {
		spaceinvaders.positionnerUnNouvelEnvahisseur(new Dimension(2, 1), new Position(10, 3), 1);
	       spaceinvaders.deplacerEnvahisseurVersLaDroite();
		assertEquals("" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"...........EE..\n" + 
		"...............\n" +
		"...............\n" + 
		"...............\n" + 
		"...............\n" +
		"...............\n" +
		"...............\n", spaceinvaders.recupererEspaceJeuDansChaineASCII());
	}
	
	@Test
	public void test_EnvahisseurAvance_DeplacerEnvahisseurVersLaGauche() {
		spaceinvaders.positionnerUnNouvelEnvahisseur(new Dimension(2, 1), new Position(3, 3), 1);
	      spaceinvaders.deplacerEnvahisseurVersLaGauche();
		assertEquals("" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"..EE...........\n" + 
		"...............\n" +
		"...............\n" + 
		"...............\n" + 
		"...............\n" +
		"...............\n" +
		"...............\n", spaceinvaders.recupererEspaceJeuDansChaineASCII());
	}
	
	@Test
	public void test_EnvahisseurNePeutPasSeDeplaceVersLaDroite() {
		spaceinvaders.positionnerUnNouvelEnvahisseur(new Dimension(2, 1), new Position(13, 3), 1);
		assertEquals("" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		".............EE\n" + 
		"...............\n" +
		"...............\n" + 
		"...............\n" + 
		"...............\n" +
		"...............\n" +
		"...............\n", spaceinvaders.recupererEspaceJeuDansChaineASCII());
	}
	
	@Test
	public void test_EnvahisseurNePeutPasSeDeplaceVersLaGauche() {
		spaceinvaders.positionnerUnNouvelEnvahisseur(new Dimension(2, 1), new Position(0, 3), 1);
		assertEquals("" + 
		"...............\n" + 
		"...............\n" + 
		"...............\n" + 
		"EE.............\n" + 
		"...............\n" +
		"...............\n" + 
		"...............\n" + 
		"...............\n" +
		"...............\n" +
		"...............\n", spaceinvaders.recupererEspaceJeuDansChaineASCII());
	}
	
	
}

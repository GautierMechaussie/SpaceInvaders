package fr.unilim.iut.spaceinvaders.model;

public class Envahisseur extends Sprite {
	Direction direction;
	public Envahisseur(Dimension dimensionEnvahisseur, Position positionOrigineEnvahisseur, int vitesseEnvahisseur) {
		super(dimensionEnvahisseur, positionOrigineEnvahisseur, vitesseEnvahisseur);
		this.direction=Direction.DROITE;
	}
}

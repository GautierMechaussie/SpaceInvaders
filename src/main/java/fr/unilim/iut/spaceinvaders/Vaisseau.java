package fr.unilim.iut.spaceinvaders;

public class Vaisseau {
	int x;
	int y;
	int longueur;
	int hauteur;

	public Vaisseau(int longueur, int hauteur) {
		this(longueur, hauteur, 0, 0);
	}
	
	public Vaisseau(int longueur, int largeur, int x, int y) {
		this.longueur=longueur;
		this.hauteur=largeur;
		this.x=x;
		this.y=y;
	}

	public boolean occupeLaPosition(int x, int y) {
	     return (estAbscisseCouverte(x) && estOrdonneeCouverte(y));
    }

	private boolean estOrdonneeCouverte(int y) {
		return (this.y-this.hauteur+1<=y) && (y<=this.y);
	}

	private boolean estAbscisseCouverte(int x) {
		return (abscisseLaPlusAGAuche()<=x) && (x<=abscisseLaPlusADroite());
	}

	public int abscisseLaPlusADroite() {
		return this.x+this.longueur-1;
	}

	public void seDeplacerVersLaDroite() {
		this.x = this.x + 1;
	}
	
	public void seDeplacerVersLaGauche() {
		this.x = this.x - 1;
	}
	
	public int abscisseLaPlusAGAuche() {
        return this.x;
	}
	
	public void positionner(int x, int y) {
	    this.x = x;
	    this.y = y;
    }
	
}

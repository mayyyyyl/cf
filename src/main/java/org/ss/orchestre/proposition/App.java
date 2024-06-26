//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ss.orchestre.proposition;

public class App {
	public App() {
	}

	public static void main(String[] args) {
		Piano piano = new Piano();
		Batterie batterie = new Batterie();
		Violon violon = new Violon();

		Musicien pianiste = new Musicien(piano, "La 9eme de Beethoven");
		pianiste.jouerMorceau();
		Musicien batteur = new Musicien(batterie, "La 9eme de Beethoven");
		batteur.jouerMorceau();
		Musicien violoniste = new Musicien(violon, "La 9eme de Beethoven");
		violoniste.jouerMorceau();

		Orchestre orchestre = new Orchestre();
		orchestre.ajout(pianiste);
		orchestre.ajout(violoniste);
		orchestre.ajout(batteur);
		orchestre.jouer();
	}
}

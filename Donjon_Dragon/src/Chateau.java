import java.util.*;

import exercice1.position;

public class Chateau {
	private Random r = new Random();
	private Scanner sc = new Scanner(System.in);
	protected ArrayList<Piece> List = new ArrayList<Piece>();
	public String name;
	private Guerrier guerrier;

	public Chateau()
	{
	
		this.generatePieces();
	}
	
	private void generatePieces() {
		
		Piece Piece_vide    = new Piece_vide("Salle vide", "Il n'y a rien dans cette salle");
		Piece Piece_ennemi = new Piece_ennemi("Vous entrez dans cette piece quand tout d'un coup un ennemi apparait et vous agresse !", 1);
		Piece Piece_trésor  = new Piece_tresor("Il y a un trésor par terre, vous vous précipiter vers celui-ci", name);
		Piece Piece_ennemi_final  = new Piece_ennemi( "Voici la derniere piece du chateau , enfin vous vosu dites mais il y a aussi l'ennemi final qui apparait et vous agresse ! ", 2);
		
		
		this.pieces.add(Piece_vide);
	
		this.pieces.add(Piece_ennemi);
		
		this.pieces.add(Piece_ennemi);
	
		this.pieces.add(Piece_ennemi_final);
	}
	
}
	


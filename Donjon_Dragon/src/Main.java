import java.util.*;

public class Main 
{
	 public static void main(String[] args) 
		{
		  System.out.println("Voici quelque les regles du jeu:Tout d'abors tu possedes un certain nombres de point de vie "
				    + ",d'attaque.Ton but ramaser le plus d'argent possible sans mourrir");
		 System.out.println("Lancement du jeu...");
			Scanner sc = new Scanner(System.in);
			System.out.println("Voulez vous entrer dans un Chateau remplis d'ennemi legendaires, guerrier etes vous pret ? (y/n)");
			sc.next().equals("y");
			sc.close();
			new Chateau();
			
		}
}

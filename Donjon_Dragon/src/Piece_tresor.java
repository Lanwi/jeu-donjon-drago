import java.util.*;
public class Piece_tresor extends Piece
{

	public Piece_tresor(String texte,String name) {
		super(texte,name);
		// TODO Auto-generated constructor stub
	}
	public int Tresor_argent()
	{
		Random random = new Random();
		return random.nextInt(1) + 6;
		
	}
}	

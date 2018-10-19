import java.util.*;
public class Piece_ennemi extends Piece{
     
	private Ennemi ennemi;
	public Piece_ennemi(String name, String texte) {
		super(name, texte);
		// TODO Auto-generated constructor stub
		this.apparition_du_Monstre();
	}
		private void apparition_du_Monstre() {
		// TODO Auto-generated method stub
			Random ramdom = new Random();
			String[] noms = new String[5];
			
			noms[0] = "Ares";
			noms[1] = "Hades";
			noms[2] = "Dragon";
			noms[3] = "Demon";
			noms[4] = "Satan";
		
			this.ennemi = new Ennemi(noms[random.nextInt(5)]);
	}
		protected Ennemi getEnnemi() 
		{
			return this.ennemi;
		}
		
		public boolean combat(Guerrier guerrier) 
		{
			while(guerrier.getPt_vie() > 0 && this.ennemi.getPt_vie() > 0) {
				this.ennemi.frappe(guerrier);
				if(guerrier.getPt_vie() <= 0) {
					System.out.println("Vous avez échouez dans votre quetes");
					break;
				}
				
				guerrier.frappe(this.ennemi);
				if(this.ennemi.getPt_vie() <= 0) {
					System.out.println("Vous avez triomphez d'un redoutables adversaires");
					break;
				}
			}
			
			if(guerrier.getPt_vie() > 0) {
				return true;
			}
			else {
				return false;
			}		
		}


		public int Tresor_argent()
		{
			Random random = new Random();
			return random.nextInt(1) + 6;
			
		}
		
}		
		
		

import java.util.*;
public class Guerrier  extends Joueur{
	
	private Random random = new Random();
	private Integer pt_vie;
	private Integer pt_att;
	private int argent = 0;

	public Guerrier(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.Point_de_vie();
		this.Point_attaque();
	}
	
    //methodes de la class Guerrier
	private void Point_attaque() {
		// TODO Auto-generated method stub
		this.pt_att=this.random.nextInt(5)+10;
	}

	private void Point_de_vie()
	{
		this.pt_vie=this.random.nextInt(5)+10;
	}
	public void ajoutArgent(int argent)
	{
		this.argent=+argent;
	}
	
	public void frappe(Ennemi ennemi) {
		System.out.println(" Guerrier qui se nommme:"+this.getName()+
				"frappe "+ennemi.getName()+
				" point de vie de l'ennemi : "+
				ennemi.getPt_vie()+" => "+
				(ennemi.getPt_vie() - this.pt_att));
		        ennemi.setPt_att(ennemi.getPt_att() - this.pt_att);
	}
	
	//assesseurs 
	public Integer getPt_vie()
	{
		return pt_vie;
	}
	
	public void setPt_vie(Integer pt_vie)
	{
		 this.pt_vie=pt_vie;
	}
	public Integer getPt_att()
	{
		return pt_att;
	}
	public void setPt_att(Integer pt_att)
	{
		 this.pt_att=pt_att;
	}
	public int getArgent()
	{
		return argent;
	}
	public void setArgent(int argent)
	{
		 this.argent=argent;
	}
	
	public  String  ToString()
	 {
		 return"Guerries tu es"+this.getName()+"tu as"this.pt_vie+","+this.pt_att;
   
	 }
}

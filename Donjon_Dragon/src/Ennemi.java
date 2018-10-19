import java.util.Random;

public class Ennemi extends Joueur{
	
	private Random random = new Random();
	private Integer pt_vie;
	private Integer pt_att;

	public Ennemi(String name) {
		super(name);
		this.Point_de_vie();
		this.Point_attaque();
		// TODO Auto-generated constructor stub
	}
	private void Point_attaque() {
		// TODO Auto-generated method stub
		this.pt_att=this.random.nextInt(5)+10;
	}

	private void Point_de_vie()
	{
		this.pt_vie=this.random.nextInt(5)+10;
	}
	public void frappe(Guerrier guerrier) 
	{
		System.out.println("l'ennemi: "+this.getName()+"frappe "+
				guerrier.getName()+" point de vie du guerrier:  "+
				guerrier.getPt_vie()+" => "+(
				guerrier.getPt_vie() - this.pt_att));
				guerrier.setPt_att(
				guerrier.getPt_att() - this.pt_att);
	}
	
	//assenseur
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
	
	public  String  ToString()
	{
		return"Ennemi se nomme"+this.getName()+"tu as"this.pt_viet+","+this.pt_att;
	}
}

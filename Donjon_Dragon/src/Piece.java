
public class Piece 
{
   public String texte;
   public String name;
   
   public Piece(String name,String texte) 
   {
	   this.texte=texte;
	   this.name=name;
   }
   
   protected String getDescription()
   {
	  return texte;
   }
  
}

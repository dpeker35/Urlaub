public class Urlaub
{
   private String ort;
   private int preis;
   private boolean allInclusive;
   
   
   
   
   //Constructor: legt mir neue Objekte an
   //heisst ganz gleich wie die Klasse
   public Urlaub(String neuOrt, int neuPreis, boolean neuAllInclusive)
   {
     
       setOrt(neuOrt);
       setPreis(neuPreis);
       setAllInclusive(neuAllInclusive);
       
   }
   
   public void setOrt(String neuOrt)
   {
       ort = neuOrt;
   }
   
   public void setPreis(int neuPreis)
   {
       preis = neuPreis;
   }
   
   public void setAllInclusive(boolean neuAllInclusive)
   {
       allInclusive = neuAllInclusive;
   }
   
   public String getOrt()
   {
       return ort;
   }
    
   public int getPreis()
   {
       return preis;
   }
   
   public boolean getAllInclusive()
   {
       return allInclusive;
   }
    
    
    /*
     * New York - 2329 EUR - All inclusive: false
     * Berlin - 999 EUR - All inclusive: true
     */
    
    
    //printUrlaub() //Printmethode keine Parameter, weil ein Befehl (schreib deine Eigenschaft auf)
    
    public void printUrlaub()
    {
        System.out.println(ort + " - " + preis + " EUR – AllInclusive: " + allInclusive);
    }
    
    
    
    
}
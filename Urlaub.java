public class Urlaub
{
    private String  ort;           
    private int     preis;        
    private boolean allInclusive;  
    
    public Urlaub(String ort, int preis, boolean allInclusive)
    {
        setOrt(ort);
        setPreis(preis);
        setAllInclusive(allInclusive);
    }
    
    
    public Urlaub(String ort, boolean allInclusive) 
    {
        setOrt(ort);
        setPreis(1999);
        setAllInclusive(allInclusive);
    }
    
    public Urlaub(String ort)
    {
        setOrt(ort);
        setPreis(1999);
        setAllInclusive(false);
        
    }
    
    
    public Urlaub()
    {
        setOrt("Wien");
        setPreis(1999);
        setAllInclusive(false);
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
    
    public String getZielort()
    {
        int pos;
        String zielOrt;
        pos = ort.indexOf("-");  //5
        zielOrt = ort.substring(0,pos);
        
        return zielOrt;
        
        
        
    }
    
    public String getLand()
    {
        int pos;
        String land;
        
        pos = ort.indexOf("-")+1;
        land = ort.substring(pos);
        
        return land;
        
    }
    
   
   
    
    public void setOrt(String ort)
    {
        // Die Eigenschaft ort wird auf den Wert des Parameters gesetzt.
        this.ort = ort;
    }
    
    //500...3000
    public void setPreis(int preis)
    {
        if((preis >= 500) && (preis <= 3000))
        {
        this.preis = preis;
        }
        else
        {
            System.out.println("Fehler: ungültiger Preis. muss zw. 5000 und 3000 sein!");
            this.preis = 1999; 
        }
    }
    
    /*
     * this bezieht sich immer auf die Eigenschaften
     */
    public void setAllInclusive(boolean allInclusive)
    {
        this.allInclusive = allInclusive;
    }
    
    /*
     * New York - 2310 EUR - all Inclusive
     * Berlin - 999 EUR - keine Verpflegung
     */
    public void printUrlaub()
    {
        if(allInclusive == true)
        {
        System.out.println(ort + " - " + preis + " EUR - all Inclusive");
        }
        else
        {
            System.out.println(ort + " - " + preis + " EUR - keine Verpflegung");
        }
    }

}





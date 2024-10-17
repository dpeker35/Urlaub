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
    
    public void setOrt(String ort)
    {
        // Die Eigenschaft ort wird auf den Wert des Parameters gesetzt.
        this.ort = ort;
    }
    
    public void setPreis(int preis)
    {
        this.preis = preis;
    }
    
    /*
     * this bezieht sich immer auf die Eigenschaften
     */
    public void setAllInclusive(boolean nallInclusive)
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





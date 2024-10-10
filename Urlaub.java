public class Urlaub
{
    private String  ort;           // Der Urlaubsort
    private int     preis;         // Kosten inkl. Steuer
    private boolean allInclusive;  // Verpflegung inkl.
    
    public Urlaub(String neuOrt, int neuPreis, boolean neuAllInclusive)
    {
        setOrt(neuOrt);
        setPreis(neuPreis);
        setAllInclusive(neuAllInclusive);
    }
    
    //ich hab kein parameter neuPreis, aber im UML kann man defaulwerte angeben
    public Urlaub(String neuOrt, boolean neuAllInclusive) 
    {
        setOrt(neuOrt);
        setPreis(1999);
        setAllInclusive(neuAllInclusive);
    }
    
    public Urlaub(String neuOrt)
    {
        setOrt(neuOrt);
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
    
    public void setOrt(String neuOrt)
    {
        // Die Eigenschaft ort wird auf den Wert des Parameters gesetzt.
        ort = neuOrt;
    }
    
    public void setPreis(int neuPreis)
    {
        preis = neuPreis;
    }
    
    /*
     * Die Eigenschaft allInclusive wird
     * auf den Wert den übergbenen Parameters
     * gesetzt
     */
    public void setAllInclusive(boolean neuAllInclusive)
    {
        allInclusive = neuAllInclusive;
    }
    
    /*
     * New York - 2310 EUR - AllInclusive: false
     * Berlin - 999 EUR - AllInclusive: true
     */
    public void printUrlaub()
    {
        System.out.println(ort + " - " + preis + " EUR - AllInclusive: " + allInclusive);
    }
}






public class TestUrlaubSemi
{
   public void testBillig()
    {
        Urlaub baden;
        
        baden = new Urlaub("Baden", 499, false);
        //Erwartetes Ergebnis Fehlermeldung
        System.out.println(baden.getPreis());
        //Erwartetes Ergebnis 1999
    
    }
   
    public void testOK()
    {
        Urlaub rom;
        
        rom = new Urlaub("Rom", 1200, false);
        System.out.println(rom.getPreis());
        //Erwartetes Ergebnis 1200
    }
    
    
    public void testTeuer()
    {
        Urlaub dubai;
        
        dubai = new Urlaub("Dubai",3001,true);
        System.out.println(dubai.getPreis());
        // Ausgabe Defaultwert
    }
    
    
}
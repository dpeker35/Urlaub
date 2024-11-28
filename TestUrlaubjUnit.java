

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestUrlaubjUnit
{
    @Test
   public void testBillig()
    {
        Urlaub baden;
        
        baden = new Urlaub("Baden", 499, false);
        //Erwartetes Ergebnis Fehlermeldung
        assertEquals(baden.getPreis(), 1999);
        
    
    }
    @Test
    public void testOK()
    {
        Urlaub rom;
        
        rom = new Urlaub("Rom", 1200, false);
        assertEquals(rom.getPreis(), 1200);
        
    }
    
    @Test
    public void testTeuer()
    {
        Urlaub dubai;
        
        dubai = new Urlaub("Dubai",3001,true);
        assertEquals(dubai.getPreis(), 1999);
        
    }
    
    
    
    
    
}



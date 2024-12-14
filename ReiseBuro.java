public class ReiseBuro
{
    private Urlaub urlaub0;
    private Urlaub urlaub1;
    private Urlaub urlaub2;
    
    public void loschen(Urlaub welcher)
    {
        if(welcher != null)
        {
            if(urlaub0 == welcher)
            {
                urlaub0 = null;
                welcher.setReiseBuro(null);
            }
            else
            {
                if(urlaub1 == welcher)
                {
                    urlaub1 = null;
                    welcher.setReiseBuro(null);
                }
                else
                {
                    if(urlaub2 == welcher)
                    {
                        urlaub2 = null;
                        welcher.setReiseBuro(null);
                    }
                    else
                    {
                        System.out.println("Fehler: nicht in diesem Reiseburo angeboten!");
                    }
                }
            }
        }
        else
        {
            System.out.println("Fehler: kein Urlaub!");
        }
    }
    
    public void hinzufugen(Urlaub welcher)
    {
        if (welcher != null)
            {
                if(welcher.getReiseBuro() == null)
                {
                    if (urlaub0 == null)
                    {
                        urlaub0 = welcher;
                        welcher.setReiseBuro(this);
                    }
                    else
                    {
                    if (urlaub1 == null)
                    {
                        urlaub1 = welcher;
                        welcher.setReiseBuro(this);
                                
                    }
                    else
                    {
                    if (urlaub2 == null)
                    {
                        urlaub2 = welcher;
                        welcher.setReiseBuro(this);
                    }
                    else
                    {
                        System.out.println("Fehler: keine weiteren Angebote mehr möglich!");
                    }
                }
            }
        }
        else
        {
            System.out.println("Urlaub wird schon angeboten!");
        }
    }
    else
    {
        System.out.println("Fehler: kein Urlaub");
    }
}

        

    public Urlaub gunstigsterUrlaub()
    {
        int min;
        Urlaub urlaub;
        
        min = 999999;
        urlaub = null;
        if (urlaub0 != null)
        {
            if (urlaub0.getPreis() < min)
            {
                min = urlaub0.getPreis();
                urlaub = urlaub0;
            }
        }
        if (urlaub1 != null)
        {
            if (urlaub1.getPreis() < min)
            {
                min = urlaub1.getPreis();
                urlaub = urlaub1;
            }
        }
        if (urlaub2 != null)
        {
            if (urlaub2.getPreis() < min)
            {
                min = urlaub2.getPreis();
                urlaub = urlaub2;
            }
        }
        
        return urlaub;
    }

    
    // public int gunstigsterUrlaub()
    // {
        // int min;
        
        // min = 999999;
        // if (urlaub0 != null)
        // {
            // if (urlaub0.getPreis() < min)
            // {
                // min = urlaub0.getPreis();
            // }
        // }
        // if (urlaub1 != null)
        // {
            // if (urlaub1.getPreis() < min)
            // {
                // min = urlaub1.getPreis();
            // }
        // }
        // if (urlaub2 != null)
        // {
            // if (urlaub2.getPreis() < min)
            // {
                // min = urlaub2.getPreis();
            // }
        // }
        
        // return min;
    // }
}
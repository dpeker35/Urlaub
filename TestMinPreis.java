

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestMinPreis
{
   @Test
   public void testleer()
   {
       ReiseBuro r;
       
       r = new ReiseBuro();
       assertEquals(r.gunstigsterUrlaub(), null);
   }
   
   
@Test
   public void test1()
   {
       ReiseBuro r;
       
       Urlaub u0;
       
       r = new ReiseBuro();
       u0 = new Urlaub("Rom", 999, false);
       r.hinzufugen(u0);
       assertEquals(r.gunstigsterUrlaub(), u0);
   }   
   
   
   public void test2()
   {
       ReiseBuro r;
       
       Urlaub u0, a;
       
       r = new ReiseBuro();
       u0 = new Urlaub("Rom", 999, false);
       a = new Urlaub("Paris", 1100, true);
       r.hinzufugen(u0);
       r.hinzufugen(a);
       assertEquals(r.gunstigsterUrlaub(), u0);
   }   
   
   
   public void test3()
   {
       ReiseBuro r;
       
       Urlaub u0, a, d;
       
       r = new ReiseBuro();
       u0 = new Urlaub("Rom", 999, false);
       a = new Urlaub("Paris", 1100, true);
       d = new Urlaub("Dubai", 555, true);
       r.hinzufugen(u0);
       r.hinzufugen(a);
       r.hinzufugen(d);
       assertEquals(r.gunstigsterUrlaub(), d);
   }   
   
   
   
   public void test0Pos()
   {
       ReiseBuro r;
       
       Urlaub u0, a, d;
       
       r = new ReiseBuro();
       u0 = new Urlaub("Rom", 555, false);
       a = new Urlaub("Paris", 1100, true);
       d = new Urlaub("Dubai", 999, true);
       r.hinzufugen(u0);
       r.hinzufugen(a);
       r.hinzufugen(d);
       assertEquals(r.gunstigsterUrlaub(), u0);
   }   
   
   public void test1Pos()
   {
       ReiseBuro r;
       
       Urlaub u0, a, d;
       
       r = new ReiseBuro();
       u0 = new Urlaub("Rom", 1111, false);
       a = new Urlaub("Paris", 666, true);
       d = new Urlaub("Dubai", 999, true);
       r.hinzufugen(u0);
       r.hinzufugen(a);
       r.hinzufugen(d);
       assertEquals(r.gunstigsterUrlaub(), a);
   }  
   
   public void test2Pos()
   {
       ReiseBuro r;
       
       Urlaub u0, a, d;
       
       r = new ReiseBuro();
       u0 = new Urlaub("Rom", 1111, false);
       a = new Urlaub("Paris", 999, true);
       d = new Urlaub("Dubai", 777, true);
       r.hinzufugen(u0);
       r.hinzufugen(a);
       r.hinzufugen(d);
       assertEquals(r.gunstigsterUrlaub(), d);
   }   
   
   
   public void test2aPos()
   {
       ReiseBuro r;
       
       Urlaub u0, a, d;
       
       r = new ReiseBuro();
       u0 = new Urlaub("Rom", 1111, false);
       a = new Urlaub("Paris", 999, true);
       d = new Urlaub("Dubai", 500, true);
       r.hinzufugen(u0);
       r.hinzufugen(a);
       r.hinzufugen(d);
       assertEquals(r.gunstigsterUrlaub(), d);
   }   
}

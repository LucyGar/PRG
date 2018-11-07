package Mnoziny; 
import static Mnoziny.mnozinyTest.generujMnozinu1;
import static Mnoziny.mnozinyTest.generujMnozinu2;
public class Mnoziny { 


    public static void main(String[] args) { 
      int[] mnozina1 = generujMnozinu1();
        System.out.println("");
      int[] mnozina2 = generujMnozinu2();
      
      System.out.println("");
      
      sjednoceni M1 = new sjednoceni();
      M1.sjednoceni(mnozina1, mnozina2);
      
      System.out.println("");
      
      Prunik M2 = new Prunik();
      M2.prunik(mnozina1, mnozina2);
     
      System.out.println("");
      
      Rozdil M3 = new Rozdil();
      M3.rozdil(mnozina1,mnozina2);
      
        System.out.println("");
      
      Doplnek M4 = new Doplnek();
      M4.Doplnek(mnozina1, mnozina2);
      
    }
}
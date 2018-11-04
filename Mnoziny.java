package mnoziny; 
import static mnoziny.mnozinyTest.generujMnozinu1;
import static mnoziny.mnozinyTest.generujMnozinu2;
public class Mnoziny { 

  

    public static void main(String[] args) { 
      int[] mnozina1 = generujMnozinu1();
      int[] mnozina2 = generujMnozinu2();
      
      sjednoceni M1 = new sjednoceni();
      M1.sjednoceni(mnozina1, mnozina2);
      
      Prunik M2 = new Prunik();
      M2.prunik(mnozina1, mnozina2);
      
      Rozdil M3 = new Rozdil();
      M3.rozdil(mnozina1,mnozina2);
   
    } 

     

} 

 

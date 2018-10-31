package mnoziny; 
import static mnoziny.mnozinyTest.generujMnozinu1;
import static mnoziny.mnozinyTest.generujMnozinu2;
public class Mnoziny { 

  

    public static void main(String[] args) { 
      int[] mnozina1 = generujMnozinu1();
      int[] mnozina2 = generujMnozinu2();
      sjednoceni AB = new sjednoceni();
      AB.sjednot(mnozina1, mnozina2);
    } 

     

} 

 

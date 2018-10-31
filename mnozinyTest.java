package mnoziny; 

  

import java.util.Random;
import java.util.Scanner; 

  

public class mnozinyTest { 

 static Random rand = new Random();

    public static int [] generujMnozinu1() { 

     Scanner sc = new Scanner(System.in); 

        System.out.println("Zadejte počet čísel v množině v rozmezí od 10 do 20:"); 

        int i = sc.nextInt(); 

        while ( i < 10 || i > 20 ) { 

            System.out.println("Zadejte prosím číslo v daném rozmezí:"); 

            i = sc.nextInt(); 

        } 

        int[] mnozina1 = new int[i]; 

         

        for (int p = 0; p < mnozina1.length; p++) { 

            mnozina1[p] =  rand.nextInt(31) + -20;
            System.out.println(mnozina1[p]);

        } 
        return mnozina1;
        

    } 
    
    public static int[] generujMnozinu2() { 

    Scanner sc = new Scanner(System.in); 

        System.out.println("Zadejte počet čísel v množině v rozmezí od 10 do 20:"); 

        int i = sc.nextInt(); 

        while ( i < 10 || i > 20 ) { 

            System.out.println("Zadejte prosím číslo v daném rozmezí:"); 

            i = sc.nextInt(); 

        } 

        int[] mnozina2 = new int[i]; 

         

        for (int p = 0; p < mnozina2.length; p++) { 

            mnozina2[p] =  rand.nextInt(31) + -20;
            System.out.println(mnozina2[p]);

        } 
        return mnozina2;
     

} 
  
}

 
package Mnoziny; 

  

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner; 

  

public class mnozinyTest { 

 static Random rand = new Random();

    public static int [] generujMnozinu1() { 

     Scanner sc = new Scanner(System.in); 

        System.out.println("Zadejte počet čísel v první množině v rozmezí od 10 do 20:"); 

        int p = sc.nextInt(); 

        while ( p < 10 || p > 20 ) { 

            System.out.println("Zadejte prosím číslo v daném rozmezí:"); 

            p = sc.nextInt(); 
        } 

        int[] mnozina1 = new int[p]; 

        for (int i = 0; i < mnozina1.length; i++) { 

            mnozina1[i] =  rand.nextInt(21) + -30;    

        }
        for (int i = 0; i < mnozina1.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < mnozina1.length; j++)
                if (mnozina1[j] < mnozina1[index]) 
                    index = j;
      
            int mensiCislo = mnozina1[index];  
            mnozina1[index] = mnozina1[i];
            mnozina1[i] = mensiCislo;
        }
     
           System.out.println("A = " + Arrays.toString(mnozina1));
        
        return mnozina1; 
        
    } 
    
    public static int[] generujMnozinu2() { 

    Scanner sc = new Scanner(System.in); 

        System.out.println("Zadejte počet čísel v druhé množině v rozmezí od 10 do 20:"); 

        int p = sc.nextInt(); 

        while ( p < 10 || p > 20 ) { 

            System.out.println("Zadejte prosím číslo v daném rozmezí:"); 

            p = sc.nextInt(); 

        } 

        int[] mnozina2 = new int[p]; 

        for (int i = 0; i < mnozina2.length; i++) { 

            mnozina2[i] =  rand.nextInt(31) + -20;

        } 
        for (int i = 0; i < mnozina2.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < mnozina2.length; j++)
                if (mnozina2[j] < mnozina2[index]) 
                    index = j;
      
            int mensiCislo = mnozina2[index];  
            mnozina2[index] = mnozina2[i];
            mnozina2[i] = mensiCislo;
        }
       
            System.out.println("B = " + Arrays.toString(mnozina2));
       
        return mnozina2;
     } 
}
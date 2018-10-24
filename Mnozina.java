package Mnoziny; 

  

import java.util.Scanner; 

  

public class Mnozina { 

  

    public static void main(String[] args) { 

    Scanner sc = new Scanner(System.in); 

        System.out.println("Zadejte počet čísel v množině v rozmezí od 10 do 20:"); 

        int i = sc.nextInt(); 

        while ( i < 10 || i > 20 ) { 

            System.out.println("Zadejte prosím číslo v daném rozmezí:"); 

            i = sc.nextInt(); 

        } 

        int[] mnozina = new int[i]; 

         

        for (int p = 0; p < mnozina.length; p++) { 

            mnozina[p] = (int)(Math.random()*((-30 - 20)+1))+20; 

            System.out.println(mnozina[p]); 

        } 

        

    } 

     

} 

 

package Mnoziny;

import java.util.Arrays;

public class Rozdil {
   public void rozdil(int[] gen1, int[] gen2) {
   
      int pocetDvoj = 0;
       for (int i = 0; i < gen1.length - 1; i++){
           
                if (gen1[i] == gen1[i + 1]) {
                 pocetDvoj++;   
        } 
       }       
      int[] roz1 = new int[gen1.length - pocetDvoj];      
        
         int p = 0;
        for (int i = 0; i < gen1.length - 1; i++){  
         if (gen1[i] != gen1[i + 1]) { 
                roz1[p] = gen1[i];
                p++;
           }
         if (i == gen1.length - 2) {
            roz1[p] = gen1[i+1];
                    i++;
         }         
        }
        
         pocetDvoj = 0;
       for (int i = 0; i < gen2.length - 1; i++){
           
                if (gen2[i] == gen2[i + 1]) {
                 pocetDvoj++;   
        } 
       }
       
      int[] roz2 = new int[gen2.length - pocetDvoj];
      
         p = 0;
        for (int i = 0; i < gen2.length - 1; i++){  
         if (gen2[i] != gen2[i + 1]) { 
                roz2[p] = gen2[i];
                p++;
           }
         if (i == gen2.length - 2) {
            roz2[p] = gen2[i+1];
                    i++;
         } 
        }
        
        int[] slouceni = new int[roz1.length + roz2.length];
        for (int i = 0; i < roz1.length; i++) {
            slouceni[i] = roz1[i];
        }
       for (int i = 0; i < roz2.length; i++) {
           slouceni[i+roz1.length] = roz2[i];
       }
      
        for (int i = 0; i < slouceni.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < slouceni.length; j++)
                if (slouceni[j] < slouceni[index]) 
                    index = j;
      
            int mensiCislo = slouceni[index];  
            slouceni[index] = slouceni[i];
            slouceni[i] = mensiCislo;
        }

        pocetDvoj = 0;
        for (int i = 0; i < slouceni.length - 1; i++){
           
                if (slouceni[i] == slouceni[i + 1]) {
                 pocetDvoj++;   
        } 
       }
  
        int[] stejne = new int[pocetDvoj];
        p = 0;
        for (int i = 0; i < slouceni.length - 1; i++){  
         if (slouceni[i] == slouceni[i + 1]) { 
                stejne[p] = slouceni[i];
                p++; 
         }
        }
        
        p = 0;
        int poradi = 0;
        int por = 0;
        boolean ulozit = true;
        int[] rozdilA = new int[roz1.length - stejne.length];
 
         if (pocetDvoj != 0) {
        for (int i = 0; i < roz1.length - 1; i++) {
           
            do  {
            if (stejne[poradi] != roz1[i]) {
                poradi++;
                p++;
            }
            else {
                ulozit = false;
                poradi++;
                p++;
            }            
            } while (p != stejne.length); 
           
            if (ulozit == true) {
                rozdilA[por] = roz1[i];
                por++;
            }
             if (por == rozdilA.length - 1) {
                rozdilA[por] = roz1[i +1];
               i++;  
              }
             
            p = 0;
            poradi = 0;
            ulozit = true;  
        }
         }
          System.out.println("Rozdil A z B");
          System.out.println("▼");
        System.out.println(Arrays.toString(rozdilA));
        System.out.println("▲");
                
        p = 0;
        poradi = 0;
        por = 0;
        ulozit = true;
        int[] rozdilB = new int[roz2.length - stejne.length];
   
         if (pocetDvoj != 0) {
        for (int i = 0; i < roz2.length - 1; i++) {
           
            do  {
            if (stejne[poradi] != roz2[i]) {
                poradi++;
                p++;
            }
            else {
                ulozit = false;
                poradi++;
                p++;
            }            
            } while (p != stejne.length); 
           
            if (ulozit == true) {
                rozdilB[por] = roz2[i];
                por++;
            }
             if (por == rozdilB.length - 1) {
                rozdilB[por] = roz2[i +1];
               i++;  
              }
             
            p = 0;
            poradi = 0;
            ulozit = true;  
        }
             System.out.println("");
         System.out.println("Rozdil B z A");
             System.out.println("▼");
            System.out.println(Arrays.toString(rozdilB));
             System.out.println("▲");
         }
}
}


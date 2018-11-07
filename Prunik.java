
package Mnoziny;

import java.util.Arrays;

class Prunik {
 
  public void prunik(int[] gen1, int[] gen2) {
      int[] slouceni = new int[gen1.length + gen2.length];
       for (int i = 0; i < gen1.length; i++) {
            slouceni[i] = gen1[i];
        }
       for (int i = 0; i < gen2.length; i++) {
           slouceni[i+gen1.length] = gen2[i];
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
      
      int pocetDvoj = 0;
       for (int i = 0; i < slouceni.length - 1; i++){
           
                if (slouceni[i] == slouceni[i + 1]) {
                 pocetDvoj++;   
        } 
       }
        
        int[] prunik1 = new int[pocetDvoj];
        
         int p = 0;
        for (int i = 0; i < slouceni.length - 1; i++){  
         if (slouceni[i] == slouceni[i + 1]) { 
                prunik1[p] = slouceni[i];
                p++; 
         }
        }
          int pocetDv = 0;
       for (int i = 0; i < prunik1.length - 1; i++){
           
                if (prunik1[i] != prunik1[i + 1]) {
                 pocetDv++;   
        }
                 if (i == prunik1.length - 2) {
                 pocetDv++;
                 i++;
       }
       }
         int[] prunik = new int[pocetDv];
         p = 0;
        for (int i = 0; i < prunik1.length - 1; i++){  
         if (prunik1[i] != prunik1[i + 1]) { 
                prunik[p] = prunik1[i];
                p++; 
         }
            if (i == prunik1.length - 2) {
            prunik[p] = prunik1[i+1];
                    i++;
            }
        }
 
       System.out.println("Prunik AB");
       System.out.println("▼");
       System.out.println(Arrays.toString(prunik));
       System.out.println("▲");
   
}
}